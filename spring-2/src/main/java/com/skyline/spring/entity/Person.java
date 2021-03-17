package com.skyline.spring.entity;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author skyline
 * @date 2021/3/17
 */
@Component
@Data
public class Person implements InitializingBean {

    private String name;
    private int age;

    /**
     * InitializingBean的方法，在bean实例化完成之前调用该方法
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        name = "skyline";
        age= 18;
    }
}
