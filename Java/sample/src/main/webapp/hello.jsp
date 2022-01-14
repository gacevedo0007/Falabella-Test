<html>
<head>
<title>Sample Application JSP Page</title>
</head>
<body bgcolor=white>

<table border="0">
<tr>
<td align=center>
<img src="images/tomcat.gif">
</td>
<td>
<h1>Ejemplo Falabella </h1>

</td>
</tr>
</table>


<form action="${pageContext.request.contextPath}/myservlet" method="post">

 <label for="uname">Ingrese Valor a Codificar: </label>
    <input type="text" id="p_co" name="name" placeholder="Ingrese valor a codificar">
    <input type="text" id="p_res" name="name" placeholder="">
    <button type="submit" name="button" value="button1">Codificar</button>
    </br> 
    
    <label for="uname">Ingrese Valor a Decodificar: </label>
    <input type="text" id="d_co" name="name" placeholder="Ingrese valor a decodificar">
    <input type="text" id="d_res" name="name" placeholder="">
    <button type="submit" name="button" value="button2">Decodificar</button>
    </br> 
    
    
    
</form>



</body>
</html>
