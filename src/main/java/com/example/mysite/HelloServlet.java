package com.example.mysite;

import java.io.*;
import java.util.concurrent.ForkJoinPool;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("nameField");
        int input1 = Integer.parseInt(request.getParameter("input1Field"));
        int input2 = Integer.parseInt(request.getParameter("input2Field"));
        int result = ForkJoinPool.commonPool().invoke(new GCDTask(input1, input2));

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>GCD Result!</title></head><body>");
        out.println("<h1>" + name + " the greatest common divisor is " + result + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}