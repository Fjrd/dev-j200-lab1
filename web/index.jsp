<%--
  Created by IntelliJ IDEA.
  User: fjrd
  Date: 04.03.2020
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
  <% String msg = (String) request.getAttribute("msg");
  if (msg != null) {
      out.println(msg);
  }
  %>

  <form name="Enter your message" method="post" action="/hello">
      <b>Message:</b>
      <input name="message" type="text" size="=40">
      <input type="submit" value="Submit">
  </form>

  </body>
</html>
