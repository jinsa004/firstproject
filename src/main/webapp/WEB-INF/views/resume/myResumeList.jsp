<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>Insert title here</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    </head>
    <body>
        <ul>
            <c:forEach var="resumePS" items="${resumePS}">
                <li>${resumePS.resumeId}</li>
                <li>${resumePS.resumeName}</li>
                <li>${resumePS.highschoolName}</li>
            </c:forEach>
        </ul>
    </body>
</html>