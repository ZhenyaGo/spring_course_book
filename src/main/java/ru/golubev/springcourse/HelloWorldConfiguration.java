package ru.golubev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//вариант конфигурирования с помощью аннотаций и конфигурационных классов
//@ComponentScan(basePackages = {"ru.golubev.springcourse"})
@ImportResource(locations = {"classpath:spring/app-context.xml"})
@Configuration
public class HelloWorldConfiguration {

//    @Bean
//    public MessageProvider messageProvider() {
//       return new HelloWorldMessageProvider();
//    }
//
//    @Bean
//    public  MessageRenderer renderer() {
//        StandardOutMessageRenderer messageRenderer = new StandardOutMessageRenderer();
//        messageRenderer.setMessageProvider(messageProvider());
//        return messageRenderer;
//    }
}
