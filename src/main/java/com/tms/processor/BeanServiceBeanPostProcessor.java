package com.tms.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanServiceBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanService) {
            BeanService beanService =  (BeanService)bean;
            beanService.setDefaultValue("Hello from BPP");
        }
        System.out.println("bpp before init");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bpp after init");
        return bean;
    }
}
