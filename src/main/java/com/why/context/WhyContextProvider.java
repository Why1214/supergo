package com.why.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class WhyContextProvider implements ApplicationContextAware {
    private static ApplicationContext springContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        springContext = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return springContext.getBean(clazz);
    }
}
