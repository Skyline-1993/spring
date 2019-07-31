package com.skyline.spring.component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * 此类用作测试获取applicationContext
 *
 * @author zhangkepepng
 * @date 2019-7-31
 */
@Getter
@Setter
@Component
@ToString
public class Person {

    private int id;
    private String name;

}
