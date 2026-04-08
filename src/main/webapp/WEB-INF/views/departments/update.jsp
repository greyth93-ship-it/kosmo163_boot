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
	                   <h1 class="h3 mb-4 text-gray-800">작성 페이지</h1>
	                   
	                   <div>
	                   <form action = "./update" method="post">
						  <div class="form-group">
						    <label for="departmentNo">학과 번호 입력</label>
						    <input type="text" name="departmentNo" readonly value="${d.departmentNo}"  class="form-control" id="departmentNo">
						  </div>
						  <div class="form-group">
						    <label for="departmentName">학과 이름 입력</label>
						    <input type="text" name="departmentName" value="${d.departmentName}" class="form-control" id="departmentName">
						  </div>
						  <div class="form-group">
						    <label for="category">학과 계열 입력</label>
						    <input type="text" name="category" value="${d.category}" class="form-control" id="category">
						  </div>
						  <div class="form-group">
						    <label for="open">OPEN</label>
						    <input type="radio" name="openYn" ${d.openYn eq 'Y'? 'checked':''} value="Y" class="form-control" id="open">
						    <label for="close">CLOSE</label>
						    <input type="radio" name="openYn" ${d.openYn eq 'N'? 'checked':''} value="N" class="form-control" id="close">
						  </div>
						  <div class="form-group">
						    <label for="capacity">학과 정원 입력</label>
						    <input type="number" name="capacity" value="${d.capacity}" class="form-control" id="capacity">
						  </div>
							
						  <button type="submit" class="btn btn-primary">Submit</button>
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