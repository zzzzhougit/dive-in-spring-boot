package com.yaozhou.diveinspringboot.bootstrap;

import com.yaozhou.diveinspringboot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Yao.Zhou
 * @since 2018/11/13 22:04
 */
@EnableHelloWorld
public class EnableHelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // helloWorld bean 是否存在
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("myFirstLevelRepository bean : "+ helloWorld);

        context.close();
    }

}
