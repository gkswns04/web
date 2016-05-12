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
<h1>게시물-상세정보</h1>
<%Project project = (Project)request.getAttribute("project"); %>
<form action='update.do' method='post'>
<input type='hidden' name='no' value='<%=project.getNo()%>'>
제목: <input type='text' name='title' value='<%=project.getTitle()%>'><br>
내용: <textarea name='description' rows='5' cols='60'><%=project.getDescription()%></textarea><br>
시작일: <input type='date' name='startDate' value='<%=project.getStartDate()%>'><br>
종료일: <input type='date' name='endDate' value='<%=project.getEndDate()%>'><br>
<button>변경</button>
<a href='delete.do?no=<%=project.getNo()%>'>삭제</a><button type='reset'>초기화</button>
</form>
</body>
</html>

