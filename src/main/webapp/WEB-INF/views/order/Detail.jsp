<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>주문 상세</h2>

<form action="${ctx}/orders/detail">

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
