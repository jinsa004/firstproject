<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>

        <h3> 카테고리 테스트 </h3>

        <ul>
            <li><a href="/">전체보기</a></li>
            <li><a href="/notice?jobCode=1">프론트엔드</a></li>
            <li><a href="/notice?jobCode=2">백엔드</a></li>
            <li><a href="/notice?jobCode=3">풀스택</a></li>
            <li><a href="/notice?jobCode=4">안드로이드</a></li>
            <li><a href="/notice?jobCode=5">IOS</a></li>
        </ul>

        <table border="1" class="table">
            <thead>
                <tr>
                    <th>공고제목</th>
                    <th>사진</th>
                    <th>회사명</th>
                    <th>업무</th>
                    <th>지원자격</th>
                    <th>포지션</th>
                    <th>연봉</th>
                    <th>마감일</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="noticeListPS" items="${noticeListPS}">
                    <tr>
                        <td><a href=#>${noticeListPS.noticeTitle}</a></td>
                        <td><a href=#>이것은 사진입니다</a></td>
                        <td>${noticeListPS.noticeConame}</td>
                        <td>${noticeListPS.noticeTask}</td>
                        <td>${noticeListPS.noticeQual}</td>
                        <td>${noticeListPS.noticePosition}</td>
                        <td>${noticeListPS.noticeSal}</td>
                        <td>${noticeListPS.noticePeriod}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>