package com.Shishkov;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener//аннотация позволяет работать номально
public class MyFirstListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("We add the following attribute:"+ event.getName()+ "with value:" +event.getValue());
        // event событие следит за событиями связанными с атрибутами
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("We removed the following attribute:"+ event.getName()+ "with value:" +event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("We replaced the following attribute:"+ event.getName()+
                        "with value:" +event.getValue()+","
                        + event.getSession().getAttribute(event.getName())
                );
    }
}
