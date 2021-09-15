<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>유저 상세</h2>

<form action="<%= application.getContextPath() %>/customers/detail">

  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>

    <button type="submit">유저 상세!</button>
  </div>
</form>

</body>
</html>
