<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ include file="dbconn.jsp"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%
	request.setCharacterEncoding("UTF-8");
ProductRepository dao = ProductRepository.getInstance();
String filename = "";
String realFolder = "C:/Users/a8207/Downloads/source/WebMarket_17장/WebMarket/WebContent/resources/images";
String encType = "utf-8"; 
int maxSize = 5 * 1024 * 1024; 

MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());

String id = multi.getParameter("id");
String name = multi.getParameter("name");
String unitPrice = multi.getParameter("unitPrice");
String description = multi.getParameter("description");
String manufacturer = multi.getParameter("manufacturer");
String category = multi.getParameter("category");
Integer price;

if (unitPrice.isEmpty())
	price = 0;
else
	price = Integer.valueOf(unitPrice);

Enumeration files = multi.getFileNames();
String fname = (String) files.nextElement();
String fileName = multi.getFilesystemName(fname);

String sql = "insert into product values(?,?,?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "p0010");
pstmt.setString(2, category);
pstmt.setString(3, name);
pstmt.setInt(4, price);
pstmt.setString(5, description);
pstmt.setString(6, manufacturer);
pstmt.setString(7, fileName);
pstmt.executeUpdate();

if (pstmt != null)
	pstmt.close();
if (conn != null)
	conn.close();

response.sendRedirect("products.jsp");
%>
