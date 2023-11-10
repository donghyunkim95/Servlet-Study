package com.kitri.myfirstservlet;


import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import static java.time.LocalTime.now;


@WebServlet(name = "currentTimeServlet", value = "/currentTime-servlet")
public class CurrentTimeServlet extends HttpServlet {
    private String dateTime;

    public void init() {


        dateTime = "" + now();

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + dateTime + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}