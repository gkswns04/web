<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET 요청</h1>
<a href="controller05.do">A 태그를 이용한 GET요청</a><br>
<form action="controller05.do" method="get">
<button>폼을 이용한 GET요청</button>
</form>
<h1>POST 요청</h1>
<form action="controller05.do" method="post">
<button>폼을 이용한 POST요청</button>
</form>
</body>
</html>