<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: gkstn_000
  Date: 2015-11-21
  Time: 오후 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello! - Space It</title>
    <script type="text/javascript" src="static/script/jquery-2.1.4.min.js"></script>
</head>
<body>
    <h1>${gender_greeting}</h1>

    <form id="Space-It" action="result" method="post">

        <input id="Space-time" type="hidden" name="time" >
        <input id="Space-submit" type="button" value="Hello">

    </form>

<script src="static/script/custom-submit.js"></script>
</body>
</html>
