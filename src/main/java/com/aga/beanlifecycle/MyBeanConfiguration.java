package com.aga.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfiguration {

    @Bean
    MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean
    public MyBean2 myBean2() {
        return new MyBean2();
    }
}
