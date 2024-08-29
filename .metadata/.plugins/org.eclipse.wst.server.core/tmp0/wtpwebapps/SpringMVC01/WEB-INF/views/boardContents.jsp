<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<% pageContext.setAttribute("nl", "\n"); %>

	<div class="container">
		<h2>Spring MVC 01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Board</div>
			<div class="panel-body">


				<table class="table">
					<tr>
						<td>제목</td>
						<td><c:out value="${vo.title }"/></td>
					</tr>

					<tr>
						<td>내용</td>
						<td>${fn:replace(vo.contents, nl, "<br>")}</td>
					</tr>

					<tr>
						<td>작성자</td>
						<td><c:out value="${vo.writer }"/></td>
					</tr>
					
					<tr>
						<td>작성일</td>
						<td>
							${fn:split(vo.indate, " ")[0] }
						</td>
					</tr>
					
					<tr>
						<td colspan="2" align="center">

						</td>
					</tr>

				</table>


			</div>
			<div class="panel-footer">웹기반 인공지능 Track2 (B) - Jipumpkin</div>
		</div>
	</div>

</body>
</html>