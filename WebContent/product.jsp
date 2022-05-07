<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page errorPage="exceptionNoProductId.jsp"%>
<html>
<head>
<link href="http://bootstrapk.com/dist/css/bootstrap.min.css">

<link href="carousel.css" rel="stylesheet">
<title>상품 상세 정보</title>
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하시겠습니까?")) {
			document.addForm.submit();
		} else {
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp" />

		<div class="alert alert-info" role="alert">
			<h1 class="display-3">상품 정보</h1>
		</div>


	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<%@ include file="dbconn.jsp"%>
				<%
				
					String ID = request.getParameter("id");
				String sql = "select * from product where id = '" + ID + "'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				rs.next();
				%>
				<img src="./resources/images/<%=rs.getString("fileName")%>">
			</div>
			<div class="col-md-6">
				<p>
					<b>카테고리</b> :
					<%=rs.getString("category")%>
				<p>
				<h3><%=rs.getString("name")%></h3>
				<p><%=rs.getString("description")%></p>
				<p>
					<b>제조사</b> :
					<%=rs.getString("manufacturer")%>
				<h4>가격 : <%=rs.getString("unitPrice")%>
					원
				</h4>
				<p>
				<p><form name="addForm" action="./addCart.jsp?id=<%=rs.getString("id")%>" method="post">
					<a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 &raquo;</a> 
					<a href="./cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
					<a href="./products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</form>
				<%
					if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				%>
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
