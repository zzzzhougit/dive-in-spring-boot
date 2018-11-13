package com.yaozhou.diveinspringboot.service.impl;

import com.yaozhou.diveinspringboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Yao.Zhou
 * @since 2018/11/13 22:28
 */
@Service
@Profile("Java7") //
public class Java7CalculateService implements CalculateService {

    @Override
    public int sum(Integer... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum +=values[i];
        }
        return sum;
    }

}
