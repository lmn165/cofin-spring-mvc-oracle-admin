<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= request.getContextPath() %>" />
<jsp:include page="./common/head.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring MVC 시작이다 !</h1>
<ol>
<li><a href="${ctx}/move/book/Detail">bookDetail</a></li>
<li><a href="${ctx}/move/book/List">bookList</a></li>
<li><a href="${ctx}/move/book/Register">bookRegister</a></li>
<li><a href="${ctx}/move/book/Update">bookUpdate</a></li>
</ol>
<ol>
<li><a href="${ctx}/move/order/Detail">orderDetail</a></li>
<li><a href="${ctx}/move/order/List">orderList</a></li>
<li><a href="${ctx}/move/order/Register">orderRegister</a></li>
<li><a href="${ctx}/move/order/Update">orderUpdate</a></li>
</ol>
<ol>
<li><a href="${ctx}/move/publisher/Detail">publisherDetail</a></li>
<li><a href="${ctx}/move/publisher/List">publisherList</a></li>
<li><a href="${ctx}/move/publisher/Register">publisherRegister</a></li>
<li><a href="${ctx}/move/publisher/Update">publisherUpdate</a></li>
</ol>
<ol>
<li><a href="${ctx}/move/user/Detail">customerDetail</a></li>
<li><a href="${ctx}/move/user/List">customerList</a></li>
<li><a href="${ctx}/move/user/Register">customerRegister</a></li>
<li><a href="${ctx}/move/user/Update">customerUpdate</a></li>
</ol>
</body>
</html>