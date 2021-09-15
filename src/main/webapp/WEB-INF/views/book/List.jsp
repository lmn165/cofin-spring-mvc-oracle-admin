<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 목록</h2>

<form action="<%= application.getContextPath() %>/books">
  <div class="imgcontainer">
    <img src="./img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">    
    <button type="submit">책 목록 조회</button>
  </div>

</form>

</body>
</html>
