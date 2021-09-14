<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>주문 수정</h2>

<form action="<%= application.getContextPath() %>/orders/update" method="post">
  
  <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="orderId" name="orderId" required>

    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>
        
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>

    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="orderPrice" name="orderPrice" required>
    
    <label for="orderDate"><b>orderDate</b></label>
    <input type="date" placeholder="orderDate" name="orderDate" required>
	<input type="hidden" name="_method" value="PUT"/>
    <button type="submit">update!</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  
</form>

</body>
</html>
