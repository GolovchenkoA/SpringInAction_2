package com.springinaction.springidol;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * Created by головченко on 09.02.2017.
 */
public class Go {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
/*        Performer eddy = (Performer)context.getBean("instrumentalist");

        try {
            eddy.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }*/


        Performer bob = (Performer)context.getBean("juggler");


        try {
            bob.perform();

            ((Contestant)bob).receiveAward(); // Bob jungling and tell "Why, thank you all very much!"
        } catch (PerformanceException e) {
            e.printStackTrace();
        }


    }
}
