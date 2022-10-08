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
        <input id="noticeId" type="hidden" value="3" />
            <form>
                이력서<br>
                <c:forEach var="resumePS" items="${resumePS}">
                <input type='radio' id='resumeId' name='only' value="${resumePS.resumeId}" />${resumePS.resumeName}
                <br>
                </c:forEach>
            </form>
            <button id="btnInsert">등록</button>

        <script>
            $("#btnInsert").click(() => {
                insert();
            });

            function insert() {
                let data = {
                    resumeId: $('input[id=resumeId]:checked').val(),
                    noticeId: $("#noticeId").val()
                };

                console.log(data.resumeId);
                console.log(data.noticeId);

                $.ajax("/resume/applicate", {
                    type: "POST",
                    dataType: "json", // 응답 데이터
                    data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                    headers: {
                        // http header에 들고갈 요청 데이터
                        "Content-Type": "application/json; charset=utf-8",
                    },
                }).done((res) => {
                    if (res.code == 1) {
                        alert("공고 지원 완료");
                        location.href = "/";
                    } else {
                        alert("지원에 실패하였습니다");
                    }
                });
            }
        </script>
    </body>
</html>
