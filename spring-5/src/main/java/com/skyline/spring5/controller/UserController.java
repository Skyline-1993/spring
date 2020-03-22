package com.skyline.spring5.controller;

import com.skyline.entity.User;
import com.skyline.spring5.service.ProductService;
import com.skyline.spring5.service.UserService;
import com.skyline.spring5.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Spring提供了注解@Controller、@Service、@Repository、@Component等注解来初始化bean。
 * 不过与配置文件中配置<bean>标签方式初始化bean不同的是，注解的方式给属性赋值的时候是通过反射机制赋值，不用setter方法。
 * xml配置文件中配置<bean>标签的方式是通过setter方法对属性进行赋值，故实体类中需要setter方法
 *
 * @author zhangkepeng
 * @date 2019/7/27
 */
@Controller
public class UserController {

    /**
     * @Autowired 注解表示按类型注入，即需要给productService字段注入ProductService类型的bean值
     *            ProductService是接口，就会给productService注入它的实现类的bean，
     *            所以ProductService只能有一个实现类，否则会报异常
     */
    @Autowired
    private ProductService productService;


    /**
     * 如果UserService有多个实现类：
     * 一、配合@Qualifier注解指定注入哪个实现类的bean
     *     @Autowired
     *     @Qualifier("adminServiceImpl")
     *     private UserService userService;
     * 二、使用@Resource注解，指定要注入的bean
     *     @Resource(name = "adminServiceImpl")
     *     private UserService userService;
     * 三、字段类型指定为需要注入bean的实现类的类型
     *     @Autowired
     *     private UserServiceImpl userService;
     *
     */
    @Autowired
    @Qualifier("adminServiceImpl")
    // @Resource(name = "adminServiceImpl")
    private UserService adminServiceImpl;

    @Autowired
    private UserServiceImpl userService;



    @Override
    public String toString() {
        return "UserController{" +
                "adminServiceImpl=" + adminServiceImpl +
                "userService=" + userService +
                "productService=" + productService +
                '}';
    }
}
