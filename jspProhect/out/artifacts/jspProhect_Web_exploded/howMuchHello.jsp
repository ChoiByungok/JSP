<%--
  Created by IntelliJ IDEA.
  User: quddh
  Date: 2022-10-27
  Time: 오후 7:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>헬로</title>
</head>
<body>
<h1>JSP Servlet 연습</h1>
<form method="post" action="Hello">
    <div>
        <label>
        <input type="text" name="name" placeholder="이름" />
        </label>
    </div>
    <div>
        <label>
            <textarea name="content" cols="30" rows="10" placeholder="내용입력"></textarea>
        </label>
    </div>
    <div>
        <input type="submit" name="submit" value="등록"/>
    </div>
</form>
</body>
</html>
