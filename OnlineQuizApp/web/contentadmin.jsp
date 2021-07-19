<%-- 
    Document   : contentadmin
    Created on : Jul 19, 2021, 7:00:18 PM
    Author     : User-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setAttribute("action", request.getParameter("page"));%>
<c:choose>
    <c:when test="${action eq 'course'}">
        <jsp:include page="course.jsp"/>
    </c:when>
    <c:when test="${action eq 'course-create'}">
        <jsp:include page="courseCreate.jsp"/>
    </c:when>
    <c:when test="${action eq 'blog'}">
        <jsp:include page="blog.jsp"/>
    </c:when>
    <c:when test="${action eq 'blog-create'}">
        <jsp:include page="blogCreate.jsp"/>
    </c:when>
    <c:when test="${action eq 'quiz'}">
        <jsp:include page="quiz.jsp"/>
    </c:when>
    <c:when test="${action eq 'quiz-create'}">
        <jsp:include page="quizCreate.jsp"/>
    </c:when>
    <c:when test="${action eq 'score'}">
        <jsp:include page="quizCreate.jsp"/>
    </c:when>
        <c:when test="${action eq 'user'}">
        <jsp:include page="searchUser.jsp"/>
    </c:when>
    <c:otherwise>
        <jsp:include page="404admin.jsp"/>
    </c:otherwise>
</c:choose>
