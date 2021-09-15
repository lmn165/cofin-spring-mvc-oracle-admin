<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>유저 목록</h2>

<form action="<%= application.getContextPath() %>/customers">
  <div class="container">
    <button type="submit">유저 리스트</button>
  </div>
</form>

</body>
</html>
