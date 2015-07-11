package net.spherez.simple_servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()");

        PrintWriter out = servletResponse.getWriter();
        out.println("Hello World!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy()");
    }
}