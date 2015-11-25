<%--
  Created by IntelliJ IDEA.
  User: gkstn_000
  Date: 2015-11-22
  Time: 오전 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${clicked_time}</h1>
<br >
<h1 id="message1">Wait For Sync...</h1>
<br >
<h3 id="timer"></h3>
<br >

<form action="result" method="post">
    <input type="hidden" name="index" value=${index}>
    <input style="visibility: hidden;" type="submit" id="submit_button" value="RESULT">
</form>

<script type="text/javascript">
    var timer = setInterval(showTime, 1000);
    var t = 5;
    function showTime(){
        document.getElementById('timer').innerHTML = (t--).toString();
        if(t == 0){
            document.getElementById('submit_button').style.visibility = 'visible';
            document.getElementById('timer').innerHTML = "Let me See";
            document.getElementById('message1').innerHTML = "Done!";
            clearInterval(timer);
        }
    }
</script>

</body>
</html>
