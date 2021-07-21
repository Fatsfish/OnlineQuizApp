<%-- 
    Document   : updateBlog
    Created on : Jul 20, 2021, 2:44:37 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <title>Update blog</title>
    </head>
    <body>

        <div class="container">
            <h1>Update blog</h1>
            <form action="BlogUpdateController">
                <div class="mb-3">
                    <label for="blogTitle" class="form-label">Blog Title</label>
                    <input type="text" class="form-control" id="blogTitle">
                </div>
                <select name="BlogCategory"  class="form-select" aria-label="Default select example">
                    <option selected>Choose category</option>
                    <c:if test="${sessionScope.LIST_BLOG_CATEGORY != null && not empty sessionScope.LIST_BLOG_CATEGORY }">
                        <c:forEach var="blogC" varStatus="counter" items="${sessionScope.LIST_BLOG_CATEGORY}">
                            <form action="CategorySearchController">
                                <option value="${blogC.categoryID}">${blogC.categoryName}</option>
                            </form>
                        </c:forEach>
                    </c:if>

                </select>
                <div class="mb-3">
                    <label for="BlogContent" class="form-label">Blog Content</label>
                    <textarea class="form-control" id="BlogContent" rows="3"></textarea>
                </div>
                <div class="mb-3">
                    <label for="formFile" class="form-label">Upload picture (optional)</label>
                    <input class="form-control" type="file" id="formFile">
                </div>
                <input type="checkbox" class="form-check-input" id="status">
                <label class="form-check-label" for="status">Active</label><br>
                <button type="submit" class="btn btn-primary">Create</button>
                <button type="submit" class="btn btn-danger">Cancel</button>
        </div>

    </form>
</div>


<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
-->
</body>
</html>