package com.Shishkov;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MySecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("username");// достаем из xml файла
        String password =sce.getServletContext().getInitParameter("password");// тоже самое
        // когда запускается приложение запускается контекст
        System.out.println(username);
        System.out.println(password);
        User user = new User(username,password);
        sce.getServletContext().setAttribute("user", user);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
