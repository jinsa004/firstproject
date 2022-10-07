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
        <form>
            <input id="resumeId" type="hidden" value="${resumePS.resumeId}" />
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
            <button id="btnDelete" type="button" class="btn btn-primary">
                삭제
            </button>
        </form>

        <script>
            $("#btnUpdate").click(() => {
                update();
            });

            function update() {
                let data = {
                    resumeName: $("#resumeName").val(),
                    employeeId: $("#employeeId").val(),
                    jobId: $("#jobId").val(),
                };
                console.log(data.employeeId);

                let resumeId = $("#resumeId").val();

                $.ajax("/resume/" + resumeId + "/update", {
                    type: "PUT",
                    dataType: "json", // 응답 데이터
                    data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                    headers: {
                        // http header에 들고갈 요청 데이터
                        "Content-Type": "application/json; charset=utf-8",
                    },
                }).done((res) => {
                    if (res.code == 1) {
                        alert("이력서 수정 완료");
                        location.href = "/";
                    } else {
                        alert("업데이트에 실패하였습니다");
                    }
                });
            }

            $("#btnDelete").click(() => {
                deleteResume();
            });

            function deleteResume() {
                let resumeId = $("#resumeId").val();

                $.ajax("/resume/" + resumeId + "/delete", {
                    type: "DELETE",
                    dataType: "json", // 응답 데이터
                }).done((res) => {
                    if (res.code == 1) {
                        alert("이력서 삭제 완료");
                        location.href = "/";
                    } else {
                        alert("삭제에 실패하였습니다");
                    }
                });
            }
        </script>
    </body>
</html>
