package cn.zxJava.controller;

import cn.zxJava.entity.Result;
import cn.zxJava.model.Article;
import cn.zxJava.model.User;
import cn.zxJava.service.IndexService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.controller
 * @Description: 主页控件
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-09 23:06:42
 */

@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    /**
        * @param pageNum:定义分页的页数
    	* @param pageSize:定义分页的大小
        * @return cn.zxJava.entity.Result 
        * @author zx
        * @date 2020/11/9 0009 23:21
    */
    @RequestMapping("/findPage/{pageNum}/{pageSize}")
    public Result findPage (@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, HttpServletRequest request) {
        try {
            PageInfo<Article> pageInfo = indexService.findPage(pageNum,pageSize);
            return new Result(true,"操作成功",pageInfo.getTotal(),pageInfo.getList());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"操作失败");
        }
    }

    @RequestMapping("/getLoginUser")
    public Result hSession(HttpServletRequest request){
        try {
            //从springsecurity框架中获取用户名
            //上下文对象
            SecurityContext context = SecurityContextHolder.getContext();
            //获取用户名
            String loginPhone = context.getAuthentication().getName();
            User user = indexService.findLoginMessage(loginPhone);
            HttpSession session = request.getSession();
            session.setAttribute("sessionUser2",user);
            return new Result(true,"操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"操作失败");
        }
    }
}
