package com.kitri.myfirstservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// 톰캣에서 쓸 웹서블릿 을 정한다.
//@WebServlet(name = "helloServlet", value = "/hello-servlet") 이 내용을 지우면 동작 안한다. 꼭 맵핑해야한다.

// @어노테이션 방법이 더 편하다 xml 파일을 이용하는 것 보다!
// 짜장면 -> 짜장서블릿 // 짬뽕-> 짬뽕 서블릿이 오는 것처럼 맵핑이 되어야 한다.
@WebServlet(name = "helloServlet", value = {"/hello-servlet"}) // 맵핑정보를 변경해주면 도메인 주소 / 뒷부분을 간략하게 해줄수있다
                                                                                // 아무거나 와도 받을 수 있다.
public class HelloServlet extends HttpServlet {
    private String message;
    // 클라이언트에서 요청이 오면 스레드가 실행된다.
    public void init() {  // 최초실행이라 init 실행되고 1번만 실행된다. 실행되고 바로 -> doGet으로 간다.
        message = "Hello World!";
    }

    // doGet : 홈페이지 들어가서 링크 클릭했을 때 Hello World! 뜨게 하는 것
    // => 조회하는 것임. 등록 (로그인) 하는건 아닙니다.
    // Get 만 처리하는게 doGet
    // doXXX 종류가 많다.   doDelete, doPut, doPost 정도만 기억하자

    // 서블릿에서 실행되는 메서드 -> 두겟, 두포스트, 두풋
    // HTTP 메시지에 있는 메서드에 따라 서블릿에서 메서드가 알잘딱깔센으로 실행된다. (요청이 GET 으로 왔으면 doGet)
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");  // <html> 브라우저가 알아들을수 있는 마크업 랭귀지
        out.println("<h1>" + message + "</h1>"); // h1 : 제목처럼 보여줘, 텍스트 크게보여줘
        out.println("</body></html>");
    }

    public void destroy() {
    }
}