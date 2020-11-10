package cn.zxJava.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo_sys
 * @description: springMvc+web.xml配置
 * @author: mtbtdg
 * @create: 2020-09-21 12:07
 **/

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //配置fastJSON消息转换器
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverter () {
        //fastJsonAPI:自定义一个fastJson的消息转换器
        //定义一个converter消息转换器
        FastJsonHttpMessageConverter fc = new FastJsonHttpMessageConverter();
        //添加fastJson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fc.setDateFormat("yyyy-MM-dd");
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //处理中文乱码
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        //在converter添加配置信息
        fc.setSupportedMediaTypes(fastMediaTypes);
        fc.setFastJsonConfig(fastJsonConfig);

        return new HttpMessageConverters(fc);
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源映射
        registry.addResourceHandler("/article/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/template/**").addResourceLocations("classpath:/static/");
    }
}
