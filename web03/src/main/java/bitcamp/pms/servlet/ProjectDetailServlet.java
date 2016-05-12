package bitcamp.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import bitcamp.pms.dao.ProjectDao;
import bitcamp.pms.vo.Project;

@WebServlet("/project/detail.do")
public class ProjectDetailServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    ServletContext servletContext = this.getServletContext();
    ApplicationContext iocContainer = (ApplicationContext)servletContext.getAttribute("iocContainer");
    ProjectDao projectDao = iocContainer.getBean(ProjectDao.class);
    
    int no = Integer.parseInt(request.getParameter("no"));
    Project project = projectDao.selectOne(no);
    
    // 게시물 상세 폼 출력
    response.setContentType("text/html;charset=UTF-8");
    RequestDispatcher rd = request.getRequestDispatcher("/project/ProjectDetail.jsp");
    request.setAttribute("project", project);
    rd.include(request, response);
    
  }
 
}










