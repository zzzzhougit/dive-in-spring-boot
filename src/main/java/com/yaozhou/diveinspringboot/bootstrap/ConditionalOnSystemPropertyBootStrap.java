package com.yaozhou.diveinspringboot.bootstrap;

import com.yaozhou.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 *
 * @author Yao.Zhou
 * @since 2018/11/13 22:47
 */
public class ConditionalOnSystemPropertyBootStrap {

    @Bean
    // @ConditionalOnSystemProperty(name = "user.name", value = "Yao.Zhou")
    @ConditionalOnSystemProperty(name = "user.name", value = "yaozh")
    public String helloWorld() {
        return "Hello World, 2018";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println(context.getBean("helloWorld", String.class));

        context.close();
    }

}
