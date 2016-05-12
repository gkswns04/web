package bitcamp.pms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.vo.Member;

@WebServlet("/member/list.do")
public class MemberListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    // 1) 스프링 IoC 컨테이너를 꺼낸다.
    ServletContext servletContext = this.getServletContext();
    ApplicationContext iocContainer = 
        (ApplicationContext)servletContext.getAttribute("iocContainer");
    
    // 2) IoC 컨테이너에서 MemberDao 객체를 꺼낸다.
    MemberDao memberDao = iocContainer.getBean(MemberDao.class);
    
    // 3) MemberDao 객체를 이용하여 게시물 목록을 가져온다.
    List<Member> list = memberDao.selectList();
    
    // 4) 게시물 목록을 클라이언트로 출력한다.
    response.setContentType("text/html;charset=UTF-8");
    
    RequestDispatcher rd = request.getRequestDispatcher("/member/MemberList.jsp");
    request.setAttribute("list", list);
    rd.include(request, response);
    
  }
}










