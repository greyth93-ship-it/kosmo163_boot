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
	                   					<th>교수 번호</th>
	                   					<th>교수명</th>
	                   					<th>주민번호</th>
	                   					<th>주소</th>
	                   					<th>학과 번호</th>
	                   				</tr>
	                   			</thead>
	                   			<tbody>
	                   				<tr>
	                   					<td>${d.professorNo}</td>
	                   					<td>${d.professorName}</td>
	                   					<td>${d.professorSsn}</td>
	                   					<td>${d.professorAddress}</td>
	                   					<td>${d.departmentNo}</td>
	                   				</tr>
	                   				
	                   			</tbody>
	                   		</table>
	                   </div>
						<div>
						<a class="btn btn-primary" href="./update?professorNo=${d.professorNo}">교수 정보 수정</a>
						<form action="./delete" method="post">
							<input type="hidden" name="professorNo" value="${d.professorNo}">
							<button class="btn btn-danger" type="submit">교수 정보 삭제</button>
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