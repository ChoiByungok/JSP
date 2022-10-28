<%--
  Created by IntelliJ IDEA.
  User: quddh
  Date: 2022-10-28
  Time: 오전 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>계산 예제</title>
</head>
<body>
 <h1>JSP Servlet 연습</h1>
        <form action="Calc" method="post">
          <div>
              <label>x : </label>
              <input type="text" name="x" />
          </div>
          <div>
              <label>y : </label>
              <input type="text" name="y" />
          </div>
          <div>
              <input type="submit" name="operator" value="덧셈" />
              <input type="submit" name="operator" value="뺄셈">
          </div>
        </form>

        <form action="index.jsp" method="post">
            <div>
                <input type="submit" value="처음으로">
            </div>
        </form>
</body>
</html>
