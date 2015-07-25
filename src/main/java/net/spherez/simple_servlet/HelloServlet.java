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
        out.println("<html>\n");
        out.println("<head>\n");
        out.println("<title>Hello World!</title>\n");
        out.println("</head>\n");
        out.println("<body>\n");
        out.println("<h1>Hello World!</h1>\n");
        out.println("<p>This is the start of the java server.</p>\n");
        out.println("</body>\n");
        out.println("<html>\n");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy()");
    }
}