package com.bright.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-06-26 16:00
 **/
public class InitializingBeanTest
{
    public static void main(String[] args) throws IOException
    {
//        Resource resource = new FileSystemResource("C:/beans.xml");
//        Resource resource1 = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("C:/beans.xml");
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans2.xml");
//        beanFactory.getBean("sonBean");
//        BeanFactory beanFactory = new XmlBeanFactory(resource1);
//        LombokDemo lombokDemo = (LombokDemo) beanFactory.getBean("lombok");
//        System.out.println("hi, " + lombokDemo.getTest());
        System.out.println("hi,1 ");
//        Exception in thread "main" org.springframework.beans.factory.BeanIsNotAFactoryException: Bean named 'lombok' is expected to be of type 'org.springframework.beans.factory.FactoryBean' but was actually of type 'com.bright.util.LombokDemo'
//        Object object1 = beanFactory.getBean("&lombok");
//        System.out.println(object1);
    }

    public static void main2(String[] args) throws IOException
    {
        LombokDemo lombokDemo = new LombokDemo();
        System.out.println(lombokDemo.getName());
    }
}
