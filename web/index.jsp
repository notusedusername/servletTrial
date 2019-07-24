<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Login</h1>
<table>
    <tr>
        <td>
            <div>
                <p>This with POST</p>
                <form method="post" action="hello">
                    Username: <input type="text" name="uname"><br>
                    Password: <input type="password" name="password"><br>
                    <input type="submit" value="Submit">
                </form>
            </div>
        </td>
        <td>
            <div>
                <p>This with GET</p>
                <form method="get" action="hello">
                    Username: <input type="text" name="uname"><br>
                    Password: <input type="password" name="password"><br>
                    <input type="submit" value="Submit">
                </form>
            </div>
        </td>
    </tr>
</table>
<a href="generic">Click to call generic servlet</a>
</body>
</html>