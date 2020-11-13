package cn.zxJava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.controller
 * @Description: 文章编辑页控件
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-12 18:20:07
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/loginPage")
    public ModelAndView toLogin (ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }
}
