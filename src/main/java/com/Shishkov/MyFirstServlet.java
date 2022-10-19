package com.Shishkov;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MyFirstServlet extends HttpServlet {

    private int counter;

    @Override
    public void init() throws ServletException {
        counter =0;
    }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // слева что ушло от клиена и справа,что прийдет клиенту
        System.out.println("Hello world");
        resp.setContentType("text/html");// передает штмль
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        writer.println("<h1>hello," + (counter++) + " from my server</h1>");// ответ от сервера, количество пользователей
//        String attribute = (String) req.getAttribute("A");
//        System.out.println("My attribute: "+ attribute);
//        req.setAttribute("A","my attribute");
//
        String attribute = (String) req.getSession().getAttribute("A");
        System.out.println("My attribute: " + attribute);
        req.getSession().setAttribute("A", "my attribute");
        req.getSession().setAttribute("A", "my attribute 2");//
        req.getSession().removeAttribute("A");
        System.out.println("_____________________________________________");
//
//        resp.addCookie(new Cookie("my cookie", "123"));// установить куки, посмотреть, что было раньше написано у клиента
//        Arrays.stream(req.getCookies()).
//                forEach(element -> element.getName());
//        req.getHeader("Header");
//        resp.setHeader("Header", "123");
    }
        @Override
        public void destroy() {
            super.destroy();
        }
    }

