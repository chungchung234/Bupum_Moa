<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>product</title>

<link href="http://bootstrapk.com/dist/css/bootstrap.min.css">

<link href="carousel.css" rel="stylesheet">
</head>


<body>
	<jsp:include page="menu.jsp" />
	
	<div class="alert alert-info" role="alert">

		<div class="container">
			<h1 class="display-3">Product</h1>
			<form>
				<select name="select">
					<option value="">=== 선택 ===</option>
					<option value="cpu">CPU</option>
					<option value="gcard">Graphic Card</option>
					<option value="mboard" disabled>Main board</option>
					<option value="ram" disabled>RAM</option>
					<option value="ssd" disabled>SSD</option>
					<option value="power" disabled>power</option>
				</select> <input type='submit' class="btn btn-primary btn-sm" value='go'>

			</form>
		</div>

	</div>

	<div class="container">
		<div class="row" align="center">
			<%@ include file="dbconn.jsp"%>
			<%
				String sql;
			String select = request.getParameter("select");
			if (select != null) {
				sql = "select * from product where category = '" + select + "'";
			} else
				sql = "select * from product";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
			%>
			<div class="col-md-4">
				<img src="./resources/images/<%=rs.getString("fileName")%>"
					" style="width: 70%">

				<h3><%=rs.getString("name")%></h3>
				<p><%=rs.getString("description")%>
				<p><%=rs.getString("UnitPrice")%>원
				<p>
					<a href="./product.jsp?id=<%=rs.getString("id")%>"
						class="btn btn-secondary" role="button"> 상세 정보 &raquo;></a>
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
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>