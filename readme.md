# Spring
注：本文中的实体类使用了lombok，请自行安装插件。

## 1、spring核心机制

spring的两大核心机制是IOC（控制反转）和AOP（切面编程）。

控制反转：对象由ioc容器创建，创建成功后将对象放在ioc容器中。调用者需要使用对象时，去ioc容器中取即可。

切面编程：

## 2、控制反转IOC

通过xml配置方式创建bean

https://github.com/Skyline-1993/spring/tree/master/spring-1

## 1、spring注解中的注入通过反射来注入，但是xml配置的bean通过setter方法注入。

## 2、手动获取spring容器中的bean
spring容器中的bean可以通过applicationContext.getBean("idName")来获取。
applicationContext获取的几种方式：

1. 根据xml文件获取[applicationContext](spring-1/src/main/java/com/skyline/util/Test.java) ，该applicationContext只能获取到中该配置文件中的&lt;bean&gt;  
2. 实现ApplicationContextAware接口，将实现类放入spring容器中，spring会将[applicationContext](spring-6/src/main/java/com/skyline/spring/util/ApplicationContextUtil.java)自动注入到实现类的实例对象中。