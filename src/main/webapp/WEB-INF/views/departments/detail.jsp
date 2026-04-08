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
	                   <h1 class="h3 mb-4 text-gray-800">상세 페이지</h1>
	                   <div class="col-8">
	                   		<table class="table table-hover">
	                   			<thead>
	                   				<tr class="table-secondary">
	                   					<th>학과번호</th>
	                   					<th>학과명</th>
	                   					<th>계열</th>
	                   					<th>개설여부</th>
	                   					<th>정원</th>
	                   				</tr>
	                   			</thead>
	                   			<tbody>
	                   				<tr>
	                   					<td>${d.departmentNo}</td>
	                   					<td>${d.departmentName}</td>
	                   					<td>${d.category}</td>
	                   					<c:choose>
	                   						<c:when test="${d.openYn eq 'Y'}">
	                   						<td>OPEN</td>
	                   						</c:when>
	                   						<c:otherwise>
	                   						<td>CLOSE</td>
	                   						</c:otherwise>
	                   					</c:choose>
	                   					<td>${d.capacity}</td>
	                   					
	         
	                   				</tr>
	                   				
	                   			</tbody>
	                   		</table>
	                   </div>
						<div>
						<a class="btn btn-primary" href="./update?departmentNo=${d.departmentNo}">학과수정</a>
						
						
						<form action="./delete" method="post">
							<input type="hidden" name="departmentNo" value="${d.departmentNo}">
							<button class="btn btn-danger" type="submit">DELETE</button>
						</form>
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