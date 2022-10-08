<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8" />
            <title>Insert title here</title>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        </head>

        <body>
            <form>
                아이디<br>
                <div class="mb-3 mt-3">
                    <input id="employeeName" type="text" class="form-control" placeholder="Enter title" />
                </div>
                비밀번호<br>
                <div class="mb-3 mt-3">
                    <input id="employeeUsername" type="text" class="form-control" placeholder="Enter title" />
                </div>
                <div class="form-group">
                    <label for="address">Address:</label>
                    <button onclick="goPopup()" type="button" class="btn btn-success float-right">주소찾기</button>
                    <input type="text" class="form-control" placeholder="Enter address" id="address" name="address"
                        required="required" readonly="readonly">
                </div>
                <button id="btnInsert" type="button" class="btn btn-primary">
                    가입
                </button>
            </form>




            <script>
                $("#btnInsert").click(() => {
                    insert();
                });


                function goPopup() {
                    var pop = window.open("/address/jusoPopup", "pop",
                        "width=570,height=420, scrollbars=yes, resizable=yes");
                }

                function jusoCallBack(roadFullAddr) {
                    $('#address').val(roadFullAddr);
                }



                function insert() {
                    let data = {
                        employeeName: $("#employeeName").val(),
                        employeeUsername: $("#employeeUsername").val(),
                        employeeLocation: $("#employeeLocation").val(),
                    };

                    $.ajax("/resume/insert", {
                        type: "POST",
                        dataType: "json", // 응답 데이터
                        data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                        headers: {
                            // http header에 들고갈 요청 데이터
                            "Content-Type": "application/json; charset=utf-8",
                        },
                    }).done((res) => {
                        if (res.code == 1) {
                            alert("가입 완료");
                            location.href = "/";
                        } else {
                            alert("가입에 실패하였습니다");
                        }
                    });
                }
            </script>
        </body>

        </html>