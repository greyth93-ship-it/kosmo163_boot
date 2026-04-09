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
				<div class="container-fluid">
                    <h1 class="h3 mb-4 text-gray-800">Create Page</h1>
                    
                    <div>
                    	<form method="post">
						  <div class="form-group">
						    <label for="professorNo">교수 번호</label>
						    <input type="text" name="professorNo" value="${d.professorNo}" class="form-control" id="professorNo">
						  </div>
						  <div class="form-group">
						    <label for="professorName">교수 이름</label>
						    <input type="text" name="professorName" value="${d.professortName}" class="form-control" id="professorName">
						  </div>
						  <div class="form-group">
						    <label for="professorSsn">주민번호</label>
						    <input type="text" name="professorSsn" value="${d.professorSsn}" class="form-control" id="professorSsn">
						  </div>
						  <div class="form-group">
						    <label for="professorAddress">주소</label>
						    <input type="text" name="professorAddress" value="${d.professorAddress}" class="form-control" id="professorAddress">
						  </div>
						  <div class="form-group">
						    <label for="departmentNo">학과 번호</label>
						    <input type="text" name="departmentNo" value="${d.departmentNo}" class="form-control" id="departmentNo">
						  </div>
						  
						  <button type="submit" class="btn btn-primary">교수 추가</button>
						</form>
                    </div>
                    
                </div>
                <!-- end container-fluid -->
			</div>
			<!-- end content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- end content-wrapper -->
	</div>
	<!-- end wrapper -->
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>

</body>
</html>