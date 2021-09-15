<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>개인정보 수정</h2>

<form action="${ctx}/customers/update" method="post">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>

    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter Password" name="custName" required>
        
    <label for="address"><b>address</b></label>
    <input type="text" placeholder="custId" name="address" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter Password" name="phone" required>
    
    <button type="submit">개인정보 수정!</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>


<h2>개인정보 삭제</h2>
<form action="${ctx}/customers/delete">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>

    <button type="submit">개인정보 삭제!</button>
  </div>
</form>


</body>
</html>
