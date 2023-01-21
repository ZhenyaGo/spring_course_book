package ru.golubev.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);

        mr.render();
    }
}
