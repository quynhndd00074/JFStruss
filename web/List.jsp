<%-- 
    Document   : List
    Created on : Sep 29, 2018, 9:47:47 AM
    Author     : QUYNH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Student</title>
    </head>
    <body>
        <h1>List Student</h1>
        <table border="1px solid black">
            <tr>
                <th>rollnumber</th>
                <th>name</th>
                <th>class</th>
                <th>email</th>

            </tr>
            <c:forEach items="${student}" var="b">
                <tr>
                    <td>${b.rollnumber}</td>
                    <td>${b.name}</td>
                    <td>${b.class}</td>
                    <td>${b.mail}</td>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>
