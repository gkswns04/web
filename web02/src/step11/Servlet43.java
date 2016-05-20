package step11;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step11/logout")
public class Servlet43 extends HttpServlet {
  @Override
  protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    
    // 세션을 무효화시킨다.
    request.getSession().invalidate();
    
    // 로그인 폼으로 리다이렉트 시킨다.
    response.sendRedirect("login");
  }  
}

