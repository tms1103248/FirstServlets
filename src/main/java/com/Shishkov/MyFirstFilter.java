package com.Shishkov;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFirstFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // фильтр чейн - цепочка фильтров,производящих проверку по установленному порядку
        System.out.println("Ip: "+ servletRequest.getRemoteAddr()); //

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
