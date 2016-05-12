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
<h1>회원-새 글</h1>
<form action='add.do' method='post'>
이름: <input type='text' name='name'><br>
비밀번호: <input type='password' name='password'><br>
이메일: <input type='text' name='email'><br>
전화: <input type='text' name='tel'><br>
<button>등록</button>
<button type='reset'>초기화</button>
</form>
</body>
</html>


