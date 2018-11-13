package com.yaozhou.diveinspringboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 条件装配
 * Java系统属性条件判断
 *
 * @author Yao.Zhou
 * @since 2018/11/13 22:40
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java系统属性名称
     * @return
     */
    String name();

    /**
     * Java系统属性值
     * @return
     */
    String value();

}
