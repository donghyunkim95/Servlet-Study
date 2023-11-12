package com.kitri.myfirstservlet.practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "CalcServlet", value = "/practice/calc")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=UTF-8"); // 한글로 바꿔줌
        PrintWriter out = resp.getWriter();

        out.println("계산기!!\n");
        int val1 = Integer.parseInt(req.getParameter("val1"));
        int val2 = Integer.parseInt(req.getParameter("val2"));
        String operator = req.getParameter("op");

        switch (operator) {
            case "plus":
                out.println(val1 + val2);
            break;

            case "minus":
                out.println(val1 - val2);
            break;

            case "mul":
                out.println(val1 * val2);
            break;

            case "div":
                out.println(val1 / val2);
            break;

            case "mod":
                out.println(val1 % val2);
            break;
        }
    }
}
