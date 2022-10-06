<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>

        <h3> 카테고리 테스트 </h3>

        <ul>
            <li><a href="/">전체보기</a></li>
            <li><a href="/notice/search?jobCode=1">프론트엔드</a></li>
            <li><a href="/notice/search?jobCode=2">백엔드</a></li>
            <li><a href="/notice/search?jobCode=3">풀스택</a></li>
            <li><a href="/notice/search?jobCode=4">안드로이드</a></li>
            <li><a href="/notice/search?jobCode=5">IOS</a></li>
        </ul>

        <table border="1" class="table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>이름</th>
                    <th>개장일</th>
                    <th>수정</th>
                    <th>test</th>
                    <th>test</th>
                    <th>test</th>
                    <th>test</th>
                    <th>test</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="noticeListPS" items="${noticeListPS}">
                    <tr>
                        <td>${noticeListPS.noticeTitle}</td>
                        <td>${noticeListPS.noticeConame}</td>
                        <td>${noticeListPS.noticeTask}</td>
                        <td>${noticeListPS.noticeQual}</td>
                        <td>${noticeListPS.noticePosition}</td>
                        <td>${noticeListPS.noticeSal}</td>
                        <td>${noticeListPS.noticePeriod}</td>
                        <td><a href=#>이것은 어쩌고입니다</a></td>
                        <td><a href=#>이것은 사진입니다</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>