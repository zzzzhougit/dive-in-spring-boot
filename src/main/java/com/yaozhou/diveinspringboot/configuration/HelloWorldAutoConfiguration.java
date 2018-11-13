package com.yaozhou.diveinspringboot.configuration;

import com.yaozhou.diveinspringboot.annotation.EnableHelloWorld;
import com.yaozhou.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配
 *
 * @author Yao.Zhou
 * @since 2018/11/13 23:14
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "yaozh") // Spring 条件装配
public class HelloWorldAutoConfiguration {
}
