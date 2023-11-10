package com.kitri.myfirstservlet.practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "multiplication", value ="/multiplication")
public class Multiplication extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=UTF-8"); // 한글로 바꿔줌
        PrintWriter out = resp.getWriter();

        out.println("구구단!!\n");
        int num = Integer.parseInt(req.getParameter("firstname"));

        for (int i = 1; i < 10; i++) {
            out.println(num + " * " + i +" = " + num * i);
            }
        }
    }
