package com.aga.beanlifecycle;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Log4j2
public class MyBean implements AwareInterfaceGroup, InitializingBean, DisposableBean {

    //BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        MyBean2 myBean2 = (MyBean2) beanFactory.getBean("myBean2");
        log.info("BeanFactoryAware: {}", myBean2.getClass().getCanonicalName());
    }

    //BeanNameAware
    @Override
    public void setBeanName(String s) {
        log.info("BeanNameAware: {}", s);
    }

    //ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MyBean2 myBean2 = (MyBean2) applicationContext.getBean("myBean2");
        log.info("ApplicationContextAware: {}", myBean2.getClass().getCanonicalName());
    }

    @PostConstruct
    public void postConstruct() {
        log.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("PreDestroy");
    }

    //InitializingBean
    @Override
    public void afterPropertiesSet() {
        log.info("InitializingBean-afterPropertiesSet");
    }

    //DisposableBean
    @Override
    public void destroy() {
        log.info("DisposableBean-destroy");
    }

    public void initMethod() {
        log.info("Init-method");
    }

    public void destroyMethod() {
        log.info("Destroy-method");
    }
}
