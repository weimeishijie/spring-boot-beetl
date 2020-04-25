package com.demo.beetl.config;

import com.demo.beetl.init.BeetlConfigurationInit;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by li wen ya on 2020/4/25
 */
@Configuration
public class SpringBootBeetlConfig {

    @Bean(name = "beetlConfig", initMethod = "init")
    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
        BeetlConfigurationInit beetlConfiguration = new BeetlConfigurationInit();
        //获取Spring Boot 的ClassLoader
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if(loader==null){
            loader = SpringBootBeetlConfig.class.getClassLoader();
        }
        ClasspathResourceLoader classpathResourceLoader = new ClasspathResourceLoader(loader, "/resources");
        beetlConfiguration.setResourceLoader(classpathResourceLoader);
        return beetlConfiguration;

    }

    @Bean(name = "beetlViewResolver")
    public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
        beetlSpringViewResolver.setOrder(0);
        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
        return beetlSpringViewResolver;
    }

}
