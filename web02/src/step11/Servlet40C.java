package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step11/servlet40/page3")
public class Servlet40C extends HttpServlet {
  @Override
  protected void doPost(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String tel = request.getParameter("tel");
    String email = request.getParameter("email");
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>입력 내용</h1>");
    out.println("<form action='page4' method='post'>");
    out.printf("이름: %s<br>", request.getParameter("name"));
    out.printf("나이: %s<br>", request.getParameter("age"));
    out.printf("전화: %s<br>", request.getParameter("tel"));
    out.printf("이메일: %s><br>", request.getParameter("email"));
    out.printf("<input type='hidden' name='name' value='%s'><br>", name);
    out.printf("<input type='hidden' name='age' value='%s'><br>", age);
    out.printf("<input type='hidden' name='tel' value='%s'><br>", tel);
    out.printf("<input type='hidden' name='email' value='%s'><br>", email);
    out.println("<button>완료</button>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }  
  
}

