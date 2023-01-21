package ru.golubev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;


    @Override
    public void render() {
        if(messageProvider == null) {
            throw new RuntimeException("You must set the "
                    + "property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName() );
            //11 Установите свойство messageProvider
            //11 в данном классе
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
         this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
