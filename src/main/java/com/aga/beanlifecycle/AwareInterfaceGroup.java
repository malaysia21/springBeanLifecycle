package com.aga.beanlifecycle;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;

public interface AwareInterfaceGroup extends ApplicationContextAware, BeanNameAware, BeanFactoryAware {
}
