package com.yaozhou.diveinspringboot.service;

/**
 * 计算服务
 *
 * @author Yao.Zhou
 * @since 2018/11/13 22:27
 */
public interface CalculateService {

    /**
     * 多个整数sum求和
     *
     * @param values
     * @return
     */
    int sum(Integer... values);

}
