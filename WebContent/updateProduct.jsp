<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 수정</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="alert alert-info" role="alert">
		<div class="container">
			<h1 class="display-3">상품 수정</h1>
		</div>
	</div>
	<%@ include file="dbconn.jsp"%>
	<%
		String productId = request.getParameter("id");

	String sql = "select * from product where id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, productId);
	rs = pstmt.executeQuery();
	if (rs.next()) {
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="c:/upload/<%=rs.getString("filename")%>" alt="image"
					style="width: 100%" />
			</div>
			<div class="col-md-7">
				<form name="newProduct" action="./processUpdateProduct.jsp"
					class="form-horizontal" method="post" enctype="multipart/form-data">
					<div class="form-group row">
						<label class="col-sm-2">상품 코드</label>
						<div class="col-sm-3">
							<input type="text" id="productId" name="productId"
								class="form-control" value='<%=rs.getString("id")%>'>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">상품명</label>
						<div class="col-sm-3">
							<input type="text" id="name" name="name" class="form-control"
								value="<%=rs.getString("name")%>">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">가격</label>
						<div class="col-sm-3">
							<input type="text" id="unitPrice" name="unitPrice"
								class="form-control" value="<%=rs.getInt("unitPrice")%>">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">상세 설명</label>
						<div class="col-sm-5">
							<textarea name="description" cols="50" rows="2"
								class="form-control"><%=rs.getString("description")%></textarea>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">제조사</label>
						<div class="col-sm-3">
							<input type="text" name="manufacturer" class="form-control"
								value="<%=rs.getString("manufacturer")%>">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">분류</label>
						<div class="col-sm-3">
							<input type="text" name="category" class="form-control"
								value="<%=rs.getString("category")%>">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">카테고리</label>
						<div class="col-sm-5">
							<input type="radio" name="category" value="cpu ">CPU
							<input type="radio" name="category" value="mboard">Main Board
							<input type="radio" name="category" value="ram ">RAM
							<input type="radio" name="category" value="gcard">그래픽카드
							<input type="radio" name="category" value="power">power
							<input type="radio" name="category" value="ssd">SSD
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2">이미지</label>
						<div class="col-sm-5">
							<input type="file" name="productImage" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-offset-2 col-sm-10 ">
							<input type="submit" class="btn btn-primary" value="등록">
						</div>
					</div>
				</form>

			</div>
		</div>
	</div>
	<%
		}
	if (rs != null)
	rs.close();
	if (pstmt != null)
	pstmt.close();
	if (conn != null)
	conn.close();
	%>
</body>
</html>
