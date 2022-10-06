<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>Insert title here</title>
    </head>
    <body>
        <form action="/resume/update" method="post">
            <div class="mb-3 mt-3">
                <input
                    name="resumeName"
                    type="text"
                    class="form-control"
                    placeholder="Enter title"
                />
            </div>
            <div class="mb-3 mt-3">
                <input
                    name="employeeId"
                    type="text"
                    class="form-control"
                    placeholder="Enter title"
                />
            </div>
            <div class="mb-3 mt-3">
                <input
                    name="jobId"
                    type="text"
                    class="form-control"
                    placeholder="Enter title"
                />
            </div>
            <div class="mb-3 mt-3">
                <input
                    name="isMain"
                    type="text"
                    class="form-control"
                    placeholder="Enter title"
                />
            </div>
            <button type="submit" class="btn btn-primary">완료</button>
        </form>
    </body>
</html>