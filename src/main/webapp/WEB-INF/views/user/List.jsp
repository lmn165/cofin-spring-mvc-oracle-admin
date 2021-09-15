<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>유저 목록</h2>

<form action="${ctx}/customers">
  <div class="container">
    <button type="submit">유저 리스트</button>
  </div>
</form>

</body>
</html>
