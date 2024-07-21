<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  style="padding:10px">
    <form action="addAlien">
    <label >id</label>
    <input type="text" name="id"> <br>
    <label >name </label>
    <input type="text" name="name"> <br>
    <label >Address</label>
    <input type="text" name="Address"> <br>
    <input type="submit"><br>
</form></div>


<div style="background-color: blueviolet">

</div>
<form action="updateAlien">
    <label >id</label>
    <input type="text" name="id"> <br>
    <label >name </label>
    <input type="text" name="name"> <br>
    <label >Address</label>
    <input type="text" name="Address"> <br>
    <input type="submit"><br>
</form>

<form action="getAlien">
    <label >id</label>
    <input type="text" name="id"> <br>

    <input type="submit"><br>
</form>

<form action="deleteAlien">
    <label >id</label>
    <input type="text" name="id"> <br>

    <input type="submit" placeholder="delete" style="background-color: aqua  "><br>
</form>



</body>
</html>