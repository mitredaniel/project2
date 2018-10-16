<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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