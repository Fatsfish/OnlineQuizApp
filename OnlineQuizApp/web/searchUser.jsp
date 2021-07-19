<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.onlinequizapp.daos.UserDAO"%>
<%@page import="java.util.List"%>
<%@page import="org.onlinequizapp.dtos.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid">
    <h1 class="h3 mb-2 text-gray-800">User Management</h1>
    <p class="mb-4">${requestScope.DELETE_ERROR}</p>
    <c:if test="${not empty param.search}">
        <form action="MainController">
            <p>Search</p> <input class="text" type="text" name="search" value="${param.search}"/>
            <input type="submit" name="action" value="Search"/>
        </form>
    </c:if>
    <c:if test="${empty param.search}">
        <form action="MainController">
            <p>Search</p> <input class="text" type="text" name="search" value=""/>
            <input type="submit" name="action" value="Search"/>
        </form>
    </c:if>
    <c:if test="${requestScope.LIST_USER != null && not empty requestScope.LIST_USER}">                       
        <table width="100%" cellspacing="0">
            <thead>
                <tr>
                    <th>No</th>
                    <th>User ID</th>
                    <th>Full Name</th>
                    <th>Role ID</th>
                    <th>Password</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th>No</th>
                    <th>User ID</th>
                    <th>Full Name</th>
                    <th>Role ID</th>
                    <th>Password</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </tfoot>
            <tbody>
                <c:forEach var="user" varStatus="counter" items="${requestScope.LIST_USER}">
                <form action="MainController">
                    <tr>
                        <td>${counter.count}</td>
                        <td>${user.userID}</td>
                        <td>${user.fullname}</td>
                        <td>${user.role}</td>
                        <td>${user.password}</td>
                        <td
                            <input type="hidden" name="search" value="${param.search}"/>
                            <input type="hidden" name="userID" value="${user.userID}"/>
                            <input type="hidden" name="roleID" value="${user.role}"/>
                            <input type="submit" name="action" value="Delete"/>
                        </td>
                        <td>
                            <input type="submit" name="action" value="Update"/>
                            <input type="hidden" name="userID" value="${user.userID}"/>
                            <input type="hidden" name="fullName" value="${user.fullname}"/>
                            <input type="hidden" name="roleID" value="${user.role}"/>
                            <input type="hidden" name="search" value="${param.search}"/>
                        </td>
                </form>
                </tr>
                </tbody>
            </c:forEach>         
        </table>
    </c:if>
</div>



