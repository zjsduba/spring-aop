package com.example.springaop.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: lsp
 * @Date: 2021/2/4 9:59
 * @Version 1.0
 * @Description:
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    //给容器中发布此事件以后，方法触发
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("event = " + event);
        System.out.println("event.getSource() = " + event.getSource().toString());
    }
}
