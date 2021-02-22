package com.example.springaop.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 注解形式的
 */
@Component
public class MyEventListener {


    @EventListener(classes = PayloadApplicationEvent.class)
    public void listen(ApplicationEvent applicationEvent){
        System.out.println("MyEventListener监听"+applicationEvent);
    }

}
