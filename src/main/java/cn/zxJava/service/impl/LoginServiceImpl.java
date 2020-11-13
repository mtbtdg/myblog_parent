package cn.zxJava.service.impl;

import cn.zxJava.entity.UserEntity;
import cn.zxJava.mapper.RoleMapper;
import cn.zxJava.mapper.UserMapper;
import cn.zxJava.mapper.UserRoleMapper;
import cn.zxJava.model.*;
import cn.zxJava.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.service.impl
 * @Description: 登录类
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-12 16:08:57
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;

    /**
        * @param phone:以手机号为查询条件
        * @return cn.zxJava.entity.UserEntity
        * @Description:登录方法
        * @author zx
        * @date 2020/11/12 0012 17:06
    */
    @Override
    public UserEntity findUserLogin(String phone) {
        //通过手机号登录
        User user = userMapper.LoginByPhone(phone);

        //通过连接表获取id
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(user.getId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);

        //获取roles列表
        List<Role> roles = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            Role role = roleMapper.selectByPrimaryKey(userRole.getRoleId());
            roles.add(role);
        }

        //数据组合返回
        return new UserEntity(user,roles);
    }

    /**
        * @param user:需要更新的数据以对象的形式传输
    	* @param recentlyLanded:格式化后的时间
        * @return void
        * @Description:更新最后登录的时间
        * @author zx
        * @date 2020/11/12 0012 17:08
    */
    @Override
    public void updateRecentlyLanded(User user, String recentlyLanded) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(user.getPhone());
        userMapper.updateByExample(user,userExample);
    }
}
