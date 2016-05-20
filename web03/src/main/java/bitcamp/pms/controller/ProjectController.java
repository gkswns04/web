package bitcamp.pms.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bitcamp.pms.dao.ProjectDao;
import bitcamp.pms.vo.Project;

@Controller
@RequestMapping("/project/")
public class ProjectController {
  @Autowired
  ProjectDao projectDao;
  
  @RequestMapping("add")
  public String add(
      String title,
      String description,
      Date startDate,
      Date endDate) throws ServletException, IOException {
    
    Project project = new Project();
    project.setTitle(title);
    project.setDescription(description);
    project.setStartDate(startDate);
    project.setEndDate(endDate);
    
    projectDao.insert(project);
    return "redirect:list.do";
  }
  
  @RequestMapping("delete")
  public String delete(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {

    int no = Integer.parseInt(request.getParameter("no"));
    projectDao.delete(no);
    
    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    int no = Integer.parseInt(request.getParameter("no"));
    Project project = projectDao.selectOne(no);
    
    request.setAttribute("project", project);
    return "project/ProjectDetail";
  }
  
  @RequestMapping("list")
  public String list(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    
    // 3) ProjectDao 객체를 이용하여 게시물 목록을 가져온다.
    List<Project> list = projectDao.selectList();
    
    // 4) 게시물 목록을 클라이언트로 출력한다.
    response.setContentType("text/html;charset=UTF-8");
    
    request.setAttribute("list", list);
    return "project/ProjectList";
  }
  
  @RequestMapping("new")
  public String form(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 게시물 입력 폼 출력
    response.setContentType("text/html;charset=UTF-8");
    return "project/ProjectForm";
  }
  
  @RequestMapping("update")
  public String update(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    
    Project project = new Project();
    project.setNo(Integer.parseInt(request.getParameter("no")));
    project.setTitle(request.getParameter("title"));
    project.setDescription(request.getParameter("description"));
    project.setStartDate(Date.valueOf(request.getParameter("startDate")));
    project.setEndDate(Date.valueOf(request.getParameter("endDate")));
    
    projectDao.update(project);
    return "redirect:list.do";
  }
}
