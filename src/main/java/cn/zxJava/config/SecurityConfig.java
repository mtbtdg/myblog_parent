package cn.zxJava.config;

import cn.zxJava.service.security.UserDetailsServiceImpl;
import cn.zxJava.utils.MD5Utils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava.config
 * @Description:springsecurity配置
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-12 15:51:13
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new PasswordEncoder() {
            //启用MD5加密
            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Utils.md5((String) rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.equals(MD5Utils.md5((String) rawPassword));
            }
        });

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/","/index","/index/**","/aboutme","/archives","/categories","/friendlylink","/tags","/update")
                    .permitAll()
                .antMatchers("/editor/**","/user/**").hasAnyRole("USER")
                .antMatchers("/superadmin/**","/today","/yesterday").hasAnyRole("SUPERADMIN")
                .and()
                .formLogin().loginPage("/login/loginPage").failureUrl("/login?error").defaultSuccessUrl("/").successHandler(new AuthenticationSuccessHandler() {
                                                                                                                /**
                                                                                                                 * @description:对登录后的需要跳转页面进行处理，将跳转回被登录拦截了的页面
                                                                                                                 * @author:zx
                                                                                                                 * @date:2020/11/13 0013 23:39
                                                                                                                 */
                                                                                                                @Override
                                                                                                                public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                                                                                                                                    Authentication authentication) throws IOException, ServletException {
                                                                                                                    response.setContentType("application/json;charset=utf-8");
                                                                                                                    //RequestCache存储了与页面有关的数据
                                                                                                                    RequestCache cache = new HttpSessionRequestCache();
                                                                                                                    SavedRequest savedRequest = cache.getRequest(request, response);
                                                                                                                    //如果从主页跳转，那么savedRequest将为null，这时会报错，需要进行处理
                                                                                                                    if (savedRequest == null){
                                                                                                                        //重定向的页面需要加上项目后缀
                                                                                                                        response.sendRedirect("/myblog");
                                                                                                                    }
                                                                                                                    else {
                                                                                                                    String url = savedRequest.getRedirectUrl();
                                                                                                                    response.sendRedirect(url);
                                                                                                                    }
                                                                                                                }
                                                                                                            })
                .and()
                .headers().frameOptions().sameOrigin()
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/");

        http.csrf().disable();

    }
}
