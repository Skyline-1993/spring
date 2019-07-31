package com.skyline.spring.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取applicationcontext，以及获取spring容器中的bean
 *
 * @author zhangkepepng
 * @date 2019-7-31
 */
@Component  // 要想spring自动注入applicationContext,必须将该类放入spring容器中
public class ApplicationContextUtil implements ApplicationContextAware {

    /**
     * spring应用上下文
     */
    private static ApplicationContext applicationContext;

    /**
     * spring容器初始化时，会通过该setter方法将applicationContext注入到该类中(DI)。
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    /**
     * 获取applicationContext对象
     *
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 通过id名获取bean
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    public static Object getBean(String beanName) throws BeansException {
        return applicationContext.getBean(beanName);
    }

}
