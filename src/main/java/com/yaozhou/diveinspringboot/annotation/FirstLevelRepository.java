package com.yaozhou.diveinspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 模式注解装配
 * 一级{@link Repository @Repository}
 *
 * @author Yao.Zhou
 * @since 2018/11/13 21:33
 */
@Documented
@Repository
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstLevelRepository {

    String value() default "";

}
