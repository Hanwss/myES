package com.myself.souwuproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName JPAConfig
 * @Description TODO
 * @Author hws
 * @Date 2021/3/31 17:36
 * @Version 1.0
 *
 **/
@Configuration//声明当前类是一个配置类，相当于spring中的一个xml文件
@EnableJpaRepositories(basePackages = {"com.myself.souwuproject.repositories"})
/**
 * 用来扫描和发现指定包及其子包中的Repository定义如果多处使用@EnableJpaRepositories，
 *
 * 如果多出使用@EnableJpaRepositories,它们的basePackages集合不能有交集，并且要能覆盖所有需要的Repository定义。
 *
 * 如果有交集，相应的Repository会被尝试反复注册，从而遇错误:
 *  The bean ‘OrderRepository’, defined in xxx, could not be registered.
 *  A bean with that name has already been defined in xxx and overriding is disabled.
 *
 * 如果不能覆盖所有需要的Repository定义，会遇到启动错误
 * Parameter 0 of method setCustomerRepository in com.service.
 * CustomerService required a bean of type ‘come.repo.OrderRepository’ that could not be found.
 **/
@EnableTransactionManagement //开启事物管理，等同于xml配置方式种的<tx:annotation-driven>
public class JPAConfig {
    /**
     * @Author hws
     * @Description   建立数据源//TODO
     * @Date
     * @Param
     * @return
     **/


}
