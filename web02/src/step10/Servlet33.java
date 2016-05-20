package step10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step10/servlet33")
public class Servlet33 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 1) 쿠키 만들기
    Cookie cookie1 = new Cookie("name2", URLEncoder.encode("홍길동", "UTF-8"));
    cookie1.setPath("/"); // 모든 요청에 대해 쿠키를 보내라고 지정한다.
    Cookie cookie2 = new Cookie("age2", "20");
    cookie2.setPath("/web02/other"); 
    Cookie cookie3 = new Cookie("tel2", "111-1111");
    //cookie3.setPath("/step10"); // 경로를 지정하지 않으면 해당 서블릿이 있는
                                // 경로(하위 경로 포함)에 한정시킨다.
    // 2) 응답 프로토콜에 쿠키 정보 첨부하기
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    response.addCookie(cookie3);
    
    // 3) 클라이언트에게 응답하기
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("쿠키 보냈음!!");
    
  }
}

/*
# 쿠키 경로 설정하기
- 쿠키를 받은 클라이언트가 언제 다시 서버에 쿠키를 전달할 지 설저할 수 있다.
- 쿠키 경로를 설정하지 않으면 기본으로 쿠키를 보낸 
  
# HTTP 응답 프로토콜과 쿠키

# HTTP 요청 프로토콜과 쿠키
*/