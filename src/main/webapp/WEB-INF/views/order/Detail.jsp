<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>주문 상세</h2>

<form action="<%= application.getContextPath() %>/orders/detail">

  <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="orderId" name="orderId" required>

    <button type="submit">주문 상세 확인</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

</body>
</html>
