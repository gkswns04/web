<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>로그인</h1>
<form action='login.do' method='post'>
아이디: <input type='text' name='id' value='${id}'><br>
암호: <input type='password' name='password'><br>
<input type='checkbox' name='idsave'>아이디 저장<br>
<button>로그인</button>
</form>
</body>
</html>
