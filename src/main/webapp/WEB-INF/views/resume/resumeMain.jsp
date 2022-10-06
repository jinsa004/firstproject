<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>

        <h3> 카테고리 테스트 </h3>

        <ul>
            <li><a href="/company">전체보기</a></li>
            <li><a href="/company/resume?jobCode=1">프론트엔드</a></li>
            <li><a href="/company/resume?jobCode=2">백엔드</a></li>
            <li><a href="/company/resume?jobCode=3">풀스택</a></li>
            <li><a href="/company/resume?jobCode=4">안드로이드</a></li>
            <li><a href="/company/resume?jobCode=5">IOS</a></li>
        </ul>

        <table border="1" class="table">
            <thead>
                <tr>
                    <th>제목</th>
                    <th>지원자id</th>
                    <th>직군</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="resumeListPS" items="${resumeListPS}">
                    <tr>
                        <td><a href=#>${resumeListPS.resumeName}</a></td>
                        <td>${resumeListPS.employeeId}</td>
                        <td>${resumeListPS.jobName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>