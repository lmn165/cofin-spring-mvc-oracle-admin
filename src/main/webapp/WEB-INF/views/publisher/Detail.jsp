<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>출판사 상세</h2>

<form action="${ctx}/publishers/detail">

  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
    
    <button type="submit">출판사 상세!</button>
  </div>

</form>

</body>
</html>
