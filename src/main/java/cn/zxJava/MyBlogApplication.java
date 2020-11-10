package cn.zxJava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: myblog_parent
 * @Package: cn.zxJava
 * @Description: 主启动类
 * @Author: zx
 * @Email: mtbtdg@gmail.com
 * @Date: 2020-11-09 22:35:32
 */
@SpringBootApplication
@MapperScan("cn.zxJava.mapper")
public class MyBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBlogApplication.class);
    }
}
