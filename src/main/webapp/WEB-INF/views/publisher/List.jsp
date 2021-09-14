<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>출판사 목록</h2>

<form action="<%= application.getContextPath() %>/publishers" method="post">
  <div class="imgcontainer">
    <img src="./img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>

    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="pubName" name="pubName" required>
        
    <label for="mgrName"><b>mgrName</b></label>
    <input type="text" placeholder="mgrName" name="mgrName" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="phone" name="phone" required>
    
    <button type="submit">출판사 목록!</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>
