<%--
    Document   : categoryAdd
    Created on : Jul 19, 2021, 9:20:29 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.onlinequizapp.daos.CategoryDAO"%>
<%@page import="java.util.List"%>
<%@page import="org.onlinequizapp.dtos.CategoryDTO"%>
<%@page import="org.onlinequizapp.dtos.CategoryBlogDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin - Dashboard</title>

        <!-- Custom fonts for this template-->
        <link href="Dashboard/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="Dashboard/css/sb-admin-2.min.css" rel="stylesheet">




    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <c:if test="${sessionScope.LOGIN_USER.role =='AD'}">
                <jsp:include page="sidebarAdmin.jsp"></jsp:include>
            </c:if>
            <c:if test="${sessionScope.LOGIN_USER.role =='T' || sessionScope.LOGIN_USER.role =='T1'}">
                <jsp:include page="sidebarTeacher.jsp"></jsp:include>
            </c:if>
            <c:if test="${sessionScope.LOGIN_USER.role =='S' || sessionScope.LOGIN_USER.role =='S1'}">
                <jsp:include page="sidebarStudent.jsp"></jsp:include>
            </c:if>



            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>

                        <!-- Topbar Search -->


                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">

                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->

                            <!-- Dropdown - Messages -->


                            <!-- Nav Item - Alerts -->

                            <!-- Dropdown - Alerts -->


                            <!-- Nav Item - Messages -->


                            <div class="topbar-divider d-none d-sm-block"></div>

                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">${sessionScope.LOGIN_USER.fullname}</span>
                                    <img class="img-profile rounded-circle"
                                         src="Dashboard/img/undraw_profile.svg">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                     aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="user-profile.jsp">
                                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Profile
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <div class="container">
                            <div class="d-sm-flex align-items-center justify-content-between mb-4">
                                <h1 class="h3 mb-0 text-gray-800">Create Blog</h1>
                            </div>
                            <div style="color: green" class="h5 mt-3">
                                <p class="mb-4">${requestScope.CREATE_BLOG_SUCCESS}</p>
                            </div>
                            <div style="color: red" class="h5 mt-3" >
                                <p class="mb-4">${requestScope.CREATE_BLOG_ERROR}</p>
                            </div>
                            <a href="CategorySearchController?cate=2&check=Blog&search=" class="btn btn-primary mb-3"/>Filter Category</a>
                            <form action="BlogCreateController">
                                <div class="mb-3">
                                    <label for="BlogTitle" class="form-label">Blog Title</label>
                                    <input type="text" class="form-control" name="Title" id="blogTitle">
                                </div>
                                <div>
                                    <select name="BlogCategory"  class="form-control" aria-label="Default select example">
                                        <option selected>Choose category</option>
                                        <c:if test="${requestScope.LIST_BLOG_CATEGORY != null && not empty requestScope.LIST_BLOG_CATEGORY }">
                                            <c:forEach var="blogC" varStatus="counter" items="${requestScope.LIST_BLOG_CATEGORY}">
                                                <c:if test="${blogC.status==1}">
                                                    <option value="${blogC.categoryID}">${blogC.categoryName}</option>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="content" class="form-label">Blog Content</label>
                                    <textarea class="form-control" id="BlogContent" name="content" rows="3"></textarea>
                                </div>
                                <div class="mb-3">
                                    <label for="Image" class="form-label">Upload picture (optional)</label>
                                    <input class="form-control" type="text" placeholder="Please input picture's url" name="Image" id="blogImg">
                                </div>
                                <div class="mb-3 form-check">
                                    <input type="checkbox" class="form-check-input" id="status" name="status">
                                    <label class="form-check-label" >Active</label><br>
                                </div>
                                <div>
                                    <input type="hidden" name="check" value="blogCreate" class="form-check-input" id="check">
                                    <button type="submit" class="btn btn-primary">Create</button>
                                    <c:if test="${sessionScope.LOGIN_USER.role =='AD'}">
                                        <a class="btn btn-danger" href="dashboardadmin.jsp" role="button">Cancel</a>
                                    </c:if>
                                    <c:if test="${sessionScope.LOGIN_USER.role =='T' || sessionScope.LOGIN_USER.role =='T1' }">
                                        <a class="btn btn-danger" href="dashboardteacher.jsp" role="button">Cancel</a>
                                    </c:if>
                                    <c:if test="${sessionScope.LOGIN_USER.role =='S' || sessionScope.LOGIN_USER.role =='S1' }">
                                        <a class="btn btn-danger" href="dashboardstudent.jsp" role="button">Cancel</a>
                                    </c:if>                                   
                                </div>
                            </form>
                        </div>


                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Online Quiz App 2021</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="LogoutController">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="Dashboard/vendor/jquery/jquery.min.js"></script>
        <script src="Dashboard/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="Dashboard/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="Dashboard/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="Dashboard/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="Dashboard/js/demo/chart-area-demo.js"></script>
        <script src="Dashboard/js/demo/chart-pie-demo.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>

</html>
