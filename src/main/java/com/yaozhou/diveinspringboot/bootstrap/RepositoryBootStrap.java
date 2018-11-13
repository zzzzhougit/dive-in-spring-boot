package com.yaozhou.diveinspringboot.bootstrap;

import com.yaozhou.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓储引导类
 *
 * @author Yao.Zhou
 * @since 2018/11/13 21:40
 */
@ComponentScan(basePackages = "com.yaozhou.diveinspringboot.repository")
public class RepositoryBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // myFirstLevelRepository bean 是否存在
        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println("myFirstLevelRepository bean : "+ myFirstLevelRepository);

        context.close();
    }

}
