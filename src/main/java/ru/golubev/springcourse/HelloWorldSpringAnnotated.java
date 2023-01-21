package ru.golubev.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);

        mr.render();
    }
}
