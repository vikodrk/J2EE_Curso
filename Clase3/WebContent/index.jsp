<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">
body {
	background-color: lime;
	text-align: center;
	text-decoration: blink;
}

h2 {
	font: italic, bold;
	color: green;
	text-align: right;
}

h2.error{
	font: bold;
	color: red;
	text-align:center;
	background-color: tomato;
	margin: 20px 20px 20px 20px;
	border-style: solid;
	border-color: red;
	
}

#label1{

	font: larger;
	color: aqua;
	text-align: center;

}


</style>

<title>Insert title here</title>

</head>

<h2 id="label1">Esto es un texto en h1</h1>
<h2 class="error">Esto es un texto en h2</h2>
<h2>Esto es un texto en h2</h2>


<body>


	<p style="color:white;size: 30px;font: cursive;" >Este es un texto en el body</p>
	<br />

	<form action="clase3" method="get">

		<input type="text" name="user" required="true"
			placeholder="Usuario..." /> <input type="password" name="password"
			required="true" /> <input type="submit" value="Iniciar." />

	</form>

</body>
</html>