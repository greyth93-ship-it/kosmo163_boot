<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.css" rel="stylesheet">
    
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
	                   <form action="./create" method="post" enctype="multipart/form-data">
						  <div class="form-group">
						    <label for="articleTitle">글 제목 입력</label>
						    <input type="text" name="articleTitle"  class="form-control" id="articleTitle">
						  </div>
						  <div class="form-group">
						    <label for="articleWriter">작성자 입력</label>
						    <input type="text" name="articleWriter"  class="form-control" id="articleWriter">
						  </div>
						  <div class="form-group">
						    <label for="articleContent">글 내용 입력</label>
						    <textarea rows="12" cols="" name="articleContent"  class="form-control" id="articleContent"></textarea>
						   
						  </div> 
						  	
						  	
						
						  <div class="form-group">
						  	<label>첨부파일</label>
						  	<input type="file" name="attach" class="form-control">
						  	
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
	
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.js"></script>
	<script>
      $('#articleContent').summernote({
        placeholder: 'Hello Bootstrap 4',
        tabsize: 2,
        height: 100
      });
    </script>
	
	
</body>
</html>