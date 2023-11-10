package com.kitri.myfirstservlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KoreanServlet", value = "/Korean-servlet")
public class KoreanServlet extends HttpServlet {
    @Override                            // ★★ req : 요청 객체, resp : 응답 객체 -> 상당히 중요하다 / 정보가 다 담겨있따
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 클라이언트에 문자열로 응답 -> 출력 스트림 사용하자
        //ISO-85- ... -> UTF-8

        resp.setContentType("text/html;charset=UTF-8");  // 괄호 안에 타입을 정해주면된다.
        PrintWriter out = resp.getWriter();
        out.println("<h1>안녕하세요</h1>");  // 이렇게하면 ??? 으로 뜬다.
        // UTF-8 가장많이 사용되는 유니코드

    }
}
