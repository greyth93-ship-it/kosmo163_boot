<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>

<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		
		<div id="content-wrapper" class="d-flex flex-column">
		
			<div id="content">
			
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
					
				<!-- Begin Page Content -->
				<div class="container-fluid">

	                   <!-- Page Heading -->
	                   <h1 class="h3 mb-4 text-gray-800">공지사항</h1>
	                   
	                   <div class="col-8">
	                   		<table class="table table-hover">
	                   			<thead>
	                   				<tr class="table-secondary">
	                   					<th>글 번호</th>
	                   					<th>글 제목</th>
	                   					<th>작성 시간</th>
	                   					<th>작성자</th>
	                   					<th>조회수</th>
	                   				</tr>
	                   			</thead>
	                   			<tbody>
	                   				<c:forEach items="${list}" var="d">
	                   				<tr>
	                   					<td><a href="./notice?articleNo=${d.articleNo}">${d.articleNo}</a></td>
	                   					<td>${d.articleTitle}</td>
	                   					<td>${d.articleDate}</td>
	                   					<td>${d.articleWriter}</td>
	                   					<td>${d.articleHit}</td>
	                   				</tr>
	                   				</c:forEach>
	                   			</tbody>
	                   		</table>
	                   		<div>
	                   			<a href="./create">글 등록</a>
	                   		</div>
	                   		
	                   </div>

                </div>
                <!-- End Page container-fluid -->
			</div>
			<!-- End page Content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- End content-wrapper -->
	</div>
	<!-- End wrapper -->
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
</body>
</html>