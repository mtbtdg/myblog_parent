package cn.zxJava.service.security;

import cn.zxJava.entity.UserEntity;
import cn.zxJava.model.Role;
import cn.zxJava.service.LoginService;
import cn.zxJava.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.service.security
 * @Description: 实现security登录接口
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-12 15:59:50
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private HttpSession session;
    @Autowired
    private LoginService loginService;
    /**
        * @param phone:使用手机号登录
        * @return org.springframework.security.core.userdetails.UserDetails
        * @description:使用security的方法代替controller
        * @author:zx
        * @date:2020/11/12 0012 17:43
    */
    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {

        //用户登录验证
        UserEntity userEntity = loginService.findUserLogin(phone);
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        //更新最后登录时间
        TimeUtil timeUtil = new TimeUtil();
        String recentlyLanded = timeUtil.getFormatDateForSix();
        userEntity.getUser().setRecentlylanded(recentlyLanded);
        loginService.updateRecentlyLanded(userEntity.getUser(), recentlyLanded);

        //封装权限列表
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : userEntity.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        session.setAttribute("sessionUser",userEntity.getUser());

        //封装数据返回
        return new User(userEntity.getUser().getPhone(),userEntity.getUser().getPassword(),authorities);
    }
}
