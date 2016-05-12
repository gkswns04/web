<%@page import="bitcamp.pms.vo.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원(by JSP)</title>
</head>
<body>
<h1>회원-목록</h1>
<p><a href='add.do'>새 글</a></p>
<table border='1'>
<thead>
<tr>
  <th>번호</th>
  <th>이름</th>
  <th>이메일</th>
  <th>전화번호</th>
</tr>
</thead>
<tbody>
<%
List<Member> list = (List<Member>)request.getAttribute("list");
for (Member member : list) {%>
  <tr>
    <td><%=member.getNo()%></td>
    <td><a href='detail.do?no=<%=member.getNo()%>'><%=member.getName()%></a></td>
    <td><%=member.getEmail()%></td>
    <td><%=member.getTel()%></td>
  </tr>
<%}%>
</tbody>
</table>
</body>
</html>

