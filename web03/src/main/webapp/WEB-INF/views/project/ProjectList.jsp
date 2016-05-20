<%@page import="bitcamp.pms.vo.Project"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판(by JSP)</title>
</head>
<body>
<h1>프로젝트-목록</h1>
<p><a href='new.do'>새 글</a></p>
<table border='1'>
<thead>
<tr>
  <th>번호</th>
  <th>제목</th>
  <th>내용</th>
  <th>시작일</th>
  <th>종료일</th>
</tr>
</thead>
<tbody>
<%
List<Project> list = (List<Project>)request.getAttribute("list");
for (Project project : list) {%>
  <tr>
    <td><%=project.getNo()%></td>
    <td><a href='detail.do?no=<%=project.getNo()%>'><%=project.getTitle()%></a></td>
    <td><%=project.getState()%></td>
    <td><%=project.getStartDate()%></td>
    <td><%=project.getEndDate()%></td>
  </tr>
<%}%>
</tbody>
</table>
</body>
</html>









