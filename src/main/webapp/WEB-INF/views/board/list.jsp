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
	                   
	                   
	                   <!-- 검색 -->
	                   
	                   <div>
	                   <form action="./list" method="get">
	                   <div class="input-group mb-3">
	                   <div class="input-group-prepend">
									<select name="kind" class="custom-select">
										<option ${pager.kind =='v1'?'selected':''} value="v1">Title</option>
										<option ${pager.kind =='v2'?'selected':''} value="v2">Contents</option>
										<option ${pager.kind =='v3'?'selected':''} value="v3">Writer</option>
									</select>
									</div>
						  <input type="text" value="${pager.search}" name="search" class="form-control" placeholder="검색어를 입력해 주세요" aria-label="Recipient's username" aria-describedby="button-addon2">
						  <div class="input-group-append">
						    <button class="btn btn-outline-secondary" id="button-addon2">검색</button>
						  </div>
					   </div>
					   </form>
					   </div>
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
	                   					<td><a href="./detail?articleNo=${d.articleNo}">${d.articleNo}</a></td>
	                   					<td><a href="./detail?articleNo=${d.articleNo}">${d.articleTitle}</a></td>
	                   					<td>${d.articleDate}</td>
	                   					<td>${d.articleWriter}</td>
	                   					<td>${d.articleHit}</td>
	                   				</tr>
	                   				</c:forEach>
	                   			</tbody>
	                   		</table>
	                   		
	                   		<div >
								<nav aria-label="Page navigation example">
								  <ul class="pagination">
								    <li class="page-item ${pager.pre?'':'disabled'}">
								      <a class="page-link" href="/list?page=${pager.pre?pager.start-1:pager.start}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
								        <span aria-hidden="true">&laquo;</span>
								      </a>
								    </li>
								    <c:forEach begin="${pager.start}" end="${pager.end}" var="i">
	                   				<li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
	                   				</c:forEach>
								    <li class="page-item ${pager.next?'':'disabled'}">
								      <a class="page-link" href="./list?page=${pager.next?pager.end+1:pager.end}&search=${pager.search}&kind=${pager.kind}" aria-label="Next" aria-label="Next">
								        <span aria-hidden="true">&raquo;</span>
								      </a>
								    </li>
								  </ul>
								</nav>
	                   		
	                   		
	                   			
	                   		</div>
	                   		
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