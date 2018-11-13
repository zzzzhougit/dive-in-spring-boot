package com.yaozhou.diveinspringboot.repository;

import com.yaozhou.diveinspringboot.annotation.SecondLevelRepository;

/**
 * @author Yao.Zhou
 * @since 2018/11/13 21:38
 */
@SecondLevelRepository(value = "myFirstLevelRepository") // bean 名称
public class MyFirstLevelRepository {
}
