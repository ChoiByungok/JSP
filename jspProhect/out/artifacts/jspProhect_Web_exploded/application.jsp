<%--
  Created by IntelliJ IDEA.
  User: quddh
  Date: 2022-10-29
  Time: 오전 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application 저장소</title>
</head>
<body>
<h1>JSP Servlet 연습</h1>
<form action="Application" method="post" />
<div>
  <label>입력 : </label>
  <input type="text" name="v" />
</div>
<div>
  <input type="submit" name="operator" value="+" />
  <input type="submit" name="operator" value="-" />
  <input type="submit" name="operator" value="=" />
</div>
</form>
<form action="index.jsp" method="post">
  <div>
    <input type="submit" value="처음으로">
  </div>
</form>
</body>
</html>
