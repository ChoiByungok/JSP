<%--
  Created by IntelliJ IDEA.
  User: quddh
  Date: 2022-10-29
  Time: 오전 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>배열예제</title>
</head>
<body>
  <h1>JSP Servlet 연습</h1>
  <form action="AddArray" method="post">
    <div>
      <input type="text" name="num" />
      <input type="text" name="num" />
      <input type="text" name="num" />
      <input type="text" name="num" />
    </div>
    <div>
      <input type="submit" value="모두 더해라!" />
    </div>
  </form>
  <form action="index.jsp" method="post">
    <div>
      <input type="submit" value="처음으로">
    </div>
  </form>

</body>
</html>
