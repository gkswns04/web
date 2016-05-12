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
<%Member member = (Member)request.getAttribute("member");%>
<h1>회원-상세정보</h1>
<form action='update.do' method='post'>
<input type='hidden' name='no' value='<%=member.getNo()%>'>
이름: <input type='text' name='name' value='<%=member.getName()%>'><br>
비밀번호: <input type='password' name='password' value='<%=member.getPassword()%>'><br>
이메일: <input type='text' name='email' value='<%=member.getEmail()%>'><br>
전화: <input type='text' name='tel' value='<%=member.getTel()%>'><br>
<button>변경</button>
<a href='delete.do?no=<%=member.getNo()%>'>삭제</a><button type='reset'>초기화</button>
</form>
</body>
</html>


