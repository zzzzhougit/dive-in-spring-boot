package com.yaozhou.diveinspringboot.service.impl;

import com.yaozhou.diveinspringboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author Yao.Zhou
 * @since 2018/11/13 22:29
 */
@Service
@Profile("Java8") //
public class Java8CalculateService implements CalculateService {

    @Override
    public int sum(Integer... values) {
        return Stream.of(values).reduce(0, Integer::sum);
    }

}
