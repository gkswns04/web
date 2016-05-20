package step10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step10/servlet31")
public class Servlet31 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 1) 쿠키 받기
    Cookie[] cookies = request.getCookies();
    
    // 2) 클라이언트로부터 받은 쿠키를 출력하기
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("쿠키 받았음!!");
    
    for (Cookie cookie : cookies) {
      out.printf("%s=%s\n", cookie.getName(),
          URLDecoder.decode(cookie.getValue(), "UTF-8"));
    }
  }
}

/*
# 
*/