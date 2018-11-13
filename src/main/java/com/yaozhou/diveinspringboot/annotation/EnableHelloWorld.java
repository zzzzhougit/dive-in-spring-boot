package com.yaozhou.diveinspringboot.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Enable模块装配
 * 激活 HelloWorld 模块
 *
 * @author Yao.Zhou
 * @since 2018/11/13 22:02
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
// @Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
