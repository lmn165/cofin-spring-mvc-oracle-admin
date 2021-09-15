<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>유저 상세</h2>

<form action="${ctx}/customers/detail">

  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>

    <button type="submit">유저 상세!</button>
  </div>
</form>

</body>
</html>
