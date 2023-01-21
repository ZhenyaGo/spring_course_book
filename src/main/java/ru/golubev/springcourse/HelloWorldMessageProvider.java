package ru.golubev.springcourse;

import org.springframework.stereotype.Component;

//простой компонент Spring Beans
@Component("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
