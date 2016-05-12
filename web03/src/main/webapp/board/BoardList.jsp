<%@page import="bitcamp.pms.vo.Board"%>
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
<h1>게시판-목록</h1>
<p><a href='add.do'>새 글</a></p>
<table border='1'>
<thead>
<tr>
  <th>번호</th>
  <th>제목</th>
  <th>등록일</th>
  <th>조회수</th>
</tr>
</thead>
<tbody>
<%
List<Board> list = (List<Board>)request.getAttribute("list");
for (Board board : list) {%>
<tr>
  <td><%=board.getNo()%></td>
  <td><a href='detail.do?no=<%=board.getNo()%>'><%=board.getTitle()%></a></td>
  <td><%=board.getCreatedDate()%></td>
  <td><%=board.getViews()%></td>
</tr>
<%}%>
</tbody>
</table>
</body>
</html>
