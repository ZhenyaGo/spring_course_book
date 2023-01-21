package ru.golubev.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Здесь приведен типичный пример поиска с извлечением зависимостей
public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");

        MessageRenderer mr = context.getBean("messageRenderer", MessageRenderer.class);

        mr.render();
    }
}
