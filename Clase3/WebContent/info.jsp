<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">

div.sucess{

	text-align: center;
	background-color: aqua;
	border-style: solid;
	border-color: blue;

}

div.error{


	text-align: center;
	background-color: tomato;
	border-style: solid;
	border-color: red;

}

</style>
<title>Insert title here</title>
</head>
<body>

	<%
		Object sucess = null;
		Object error = null;

		sucess = request.getAttribute("success");
		error = request.getAttribute("error");

		Object message = request.getAttribute("message");

		if (sucess != null&&error==null) {
	%>
	<div class="sucess">
		Result size:
		<%
		out.print(request.getAttribute("message"));
	%>
	</div>
	<%
		}
		if (error != null) {
	%>
	<div class="error">
		Error al realizar la conexión.<br />
		<%
			if (request.getAttribute("message") != null) {
					out.print(request.getAttribute("message"));
				}
		%>
		
	</div>
	<%
		}
	%>

</body>
</html>