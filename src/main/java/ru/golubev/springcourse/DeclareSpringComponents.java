package ru.golubev.springcourse;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-annotation.xml");
        context.refresh();

        MessageRenderer mr = (MessageRenderer) context.getBean("messageRenderer");
        mr.render();
        context.close();
    }
}
