package com.yaozhou.diveinspringboot.bootstrap;

import com.yaozhou.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Yao.Zhou
 * @since 2018/11/13 22:32
 */
@SpringBootApplication(scanBasePackages = "com.yaozhou.diveinspringboot.service")
public class CalculateServiceBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8") // 通过profile控制Bean装载, 也是条件装配的一种,
                .run(args);

        // calculateService 求和
        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.getClass().getName());
        System.out.println("calculateService.sum(1...10) : "+ calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        context.close();
    }

}
