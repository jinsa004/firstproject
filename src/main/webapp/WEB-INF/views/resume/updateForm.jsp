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
        <form>
            <div class="mb-3 mt-3">
                <input
                    id="resumeName"
                    type="text"
                    class="form-control"
                    value="${resumePS.resumeName}"
                />
            </div>
            <div class="mb-3 mt-3">
                <input
                    id="employeeId"
                    type="text"
                    class="form-control"
                    value="${resumePS.employeeId}"
                />
            </div>
            <div class="mb-3 mt-3">
                <input
                    id="jobId"
                    type="text"
                    class="form-control"
                    value="${resumePS.jobId}"
                />
            </div>
            <button id="btnUpdate" type="button" class="btn btn-primary">
                수정
            </button>
        </form>
    </body>
</html>
