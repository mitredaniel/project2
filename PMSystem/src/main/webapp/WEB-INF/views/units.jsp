<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Rent a Unit
</h1>
<hr>
<form action="/unit/rentunit{userid}/dstart{dstart}/davail{davailable}/occ{occupied}/unit{unitid}" method="post">
Tenant Id                    :<input type="text" name="userid" ><br>
Started date               :<input type="time" name="dstart" ><br>
End date                     :<input type="time" name="davailable" ><br>
Status                      :<input type="number" name="occupied" value=1><br>
Unit number                 :<input type="number" name="unitid" ><br>
<hr>
<input type="submit" onclick="/unit/rentunit{userid}/dstart{dstart}/davail{davailable}/occ{occupied}/unit{unitid}" value="Submit">
<hr>
</form>

<p>Click the "Submit" button and the form-data will be sent to a page on the server called "/action_page.php".</p>

</body>
</html>
</body>
</html>