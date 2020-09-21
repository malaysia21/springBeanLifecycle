package com.aga.beanlifecycle;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Log4j2
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("BeanPostProcessor - postProcessBeforeInitialization: {}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            log.info("BeanPostProcessor-postProcessAfterInitialization: {}", beanName);
        }
        return bean;
    }
}
