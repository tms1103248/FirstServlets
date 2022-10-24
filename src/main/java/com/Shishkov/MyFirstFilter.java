package com.Shishkov;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFirstFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // фильтр чейн - цепочка фильтров,производящих проверку по установленному порядку
        System.out.println("Ip: "+ servletRequest.getRemoteAddr()); //
        User myUser =(User) servletRequest.getServletContext().getAttribute("user");//достаем юзера через сервлет реквест
        System.out.println("My user from filter:" +myUser.getUsername());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
