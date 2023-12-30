<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/index.css">
<title>Login</title>
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    <div class="container">

        <h1>User Login</h1>

        <form action="login" method="post">

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <div style="text-align: center;">
                <input type="submit" value="Login">
            </div>

        </form>

        <p style="text-align: center;">Not a member yet? <a href="index.jsp">Register</a></p>

    </div>
    <script>
        var status = document.getElementById("status").value;

        if (status === "failed") {
            alert("Wrong Username or Password");}

    </script>
</body>
</html>