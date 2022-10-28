<%--
  Created by IntelliJ IDEA.
  User: quddh
  Date: 2022-10-28
  Time: 오전 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Repeat Hello</title>
</head>
<body>
<h1>JSP Servlet 연습</h1>
<form action="Repeat" method="get">
    <div>
        <label>몇번 반복하시겠습니까 </label>
            <input type="text" name="input" placeholder="반복 횟수 입력" />
    </div>
    <div>
        <input type="submit" value="제출">
    </div>
</form>

    <form action="index.jsp" method="post">
        <div>
            <input type="submit" value="처음으로">
        </div>
    </form>


</body>
</html>
