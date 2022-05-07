<%@ page contentType="text/html; charset=utf-8"%>
<link href="http://bootstrapk.com/dist/css/bootstrap.min.css"
	rel="stylesheet">
<div class="navbar-wrapper">
	<div class="container">

		<nav class="navbar navbar-inverse navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="./welcome.jsp">Bupum Moa</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="./welcome.jsp">Home</a></li>
						<li><a href="./products.jsp">Product</a></li>


						<li><a href="./addProduct.jsp">Add</a></li>
						<li><a href="./editProduct.jsp?edit=update">Update</a></li>
						<li><a href="./editProduct.jsp?edit=delete">Delete</a></li>

						</ul>
				</div>
			</div>
		</nav>

	</div>
</div>
