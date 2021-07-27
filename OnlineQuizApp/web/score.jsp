<%-- 
    Document   : score
    Created on : Jul 25, 2021, 9:15:28 PM
    Author     : Mr Hien Khoa
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.onlinequizapp.daos.ScoreDAO"%>
<%@page import="java.util.List"%>
<%@page import="org.onlinequizapp.dtos.ScoreDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Online Quiz App - Search</title>

        <!-- Custom fonts for this template -->
        <link href="Dashboard/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="Dashboard/css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="Dashboard/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <c:if test="${sessionScope.LOGIN_USER.role =='AD'}">
                <!-- Sidebar -->
                <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                    <!-- Sidebar - Brand -->
                    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                        <div class="sidebar-brand-icon">
                            <i class="fas fa-crown"></i>
                        </div>
                        <div class="sidebar-brand-text mx-3">Admin</div>
                    </a>

                    <!-- Divider -->
                    <hr class="sidebar-divider my-0">

                    <!-- Nav Item - Dashboard -->
                    <li class="nav-item">
                        <a class="nav-link" href="dashboardadmin.jsp">
                            <i class="fas fa-fw fa-tachometer-alt"></i>
                            <span>Dashboard</span></a>
                    </li>

                    <!-- Divider -->
                    <hr class="sidebar-divider">

                    <!-- Heading -->
                    <div class="sidebar-heading">
                        Learn
                    </div>

                    <!-- Nav Item - Courses Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseCourses"
                           aria-expanded="false" aria-controls="collapseCourses">
                            <i class="fas fa-fw fa-book"></i>
                            <span>Courses</span>
                        </a>
                        <div id="collapseCourses" class="collapse" aria-labelledby="headingCourses" data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Courses:</h6>
                                <a class="collapse-item" href="all-course.html">All Courses</a>
                                <a class="collapse-item" href="course.jsp">My Courses</a>
                                <div class="collapse-divider"></div>
                                <h6 class="collapse-header">Create:</h6>
                                <a class="collapse-item" href="courseAdd.jsp">Create Course</a>
                            </div>
                        </div>
                    </li>

                    <!-- Nav Item - Quizzes Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseQuizzes"
                           aria-expanded="false" aria-controls="collapseQuizzes">
                            <i class="fas fa-fw fa-edit"></i>
                            <span>Quizzes</span>
                        </a>
                        <div id="collapseQuizzes" class="collapse" aria-labelledby="headingQuizzes"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Quizzes:</h6>
                                <a class="collapse-item" href="all-quiz.html">All Quizzes</a>
                                <a class="collapse-item" href="quiz.jsp">My Quizzes</a>
                                <div class="collapse-divider"></div>
                                <h6 class="collapse-header">Create:</h6>
                                <a class="collapse-item" href="quizAdd.html">Create Quiz</a>
                            </div>
                        </div>
                    </li>


                    <!-- Nav Item - Marks -->
                    <li class="nav-item">
                        <a class="nav-link" href="charts.html">
                            <i class="fas fa-fw fa-chart-area"></i>
                            <span>Marks</span></a>
                    </li>

                    <!-- Nav Item - Category Collapse Menu -->

                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseCategories"
                           aria-expanded="false" aria-controls="collapseCategories">
                            <i class="fas fa-fw fa-edit"></i>
                            <span>Categories</span>
                        </a>
                        <div id="collapseCategories" class="collapse" aria-labelledby="headingQuizzes"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Categories:</h6>
                                <a class="collapse-item" href="all-category.jsp">All Categories</a>
                                <div class="collapse-divider"></div>
                                <h6 class="collapse-header">Create:</h6>
                                <a class="collapse-item" href="categoryAdd.jsp">Create Quiz Category</a>
                                <a class="collapse-item" href="categoryBlogAdd.jsp">Create Blog Category</a>
                            </div>
                        </div>
                    </li>

                    <!-- Divider -->
                    <hr class="sidebar-divider">

                    <!-- Heading -->
                    <div class="sidebar-heading">
                        Community
                    </div>


                    <!-- Nav Item - Blogs Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseBlogs"
                           aria-expanded="false" aria-controls="collapseBlogs">
                            <i class="fas fa-fw fa-users"></i>
                            <span>Blogs</span>
                        </a>
                        <div id="collapseBlogs" class="collapse" aria-labelledby="headingBlogs"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Blogs:</h6>
                                <a class="collapse-item" href="all-blog.html">All Blogs</a>
                                <a class="collapse-item" href="blog.jsp">My Blogs</a>
                                <div class="collapse-divider"></div>
                                <h6 class="collapse-header">Create:</h6>
                                <a class="collapse-item" href="blogAdd.html">Create Blog</a>
                            </div>
                        </div>
                    </li>

                    <!-- Nav Item - Charts -->
                    <li class="nav-item">
                        <a class="nav-link" href="ranking.jsp">
                            <i class="fas fa-fw fa-trophy"></i>
                            <span>Ranking</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="search.jsp">
                            <i class="fas fa-fw fa-table"></i>
                            <span>User Management</span></a>
                    </li>

                    <!-- Divider -->
                    <hr class="sidebar-divider d-none d-md-block">

                    <!-- Sidebar Toggler (Sidebar) -->
                    <div class="text-center d-none d-md-inline">
                        <button class="rounded-circle border-0" id="sidebarToggle"></button>
                    </div>

                </ul>
                <!-- End of Sidebar -->
            </c:if>
            <c:if test="${sessionScope.LOGIN_USER.role =='T' || sessionScope.LOGIN_USER.role =='T1'}">
                <jsp:include page="sidebarTeacher.jsp"></jsp:include>
            </c:if>

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <form class="form-inline">
                            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                <i class="fa fa-bars"></i>
                            </button>
                        </form>

                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">


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
                                    <a class="dropdown-item" href="user-profile.html">
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



                        <h1 class="h3 mb-2 text-gray-800" >View Score</h1>
                        <div style="color: red" class="h5 mt-3" >
                            <p class="mb-4">${requestScope.DELETE_ERROR}</p>
                        </div>
                        <div style="color: green" class="h5 mt-3">
                            <p class="mb-4">${requestScope.DELETE_SUCCESS}</p>
                            <p class="mb-4">${requestScope.UPDATE_SUCCESS}</p>
                        </div>
                        <c:if test="${not empty param.search}">
                            <form class="row g-3" action="ScoreSearchController">
                                <div class="col-auto">
                                    <input type="hidden" name="check" value="Search" class="form-check-input" id="check">
                                    <input class="form-control" type="text" name="search" placeholder="Search.." value="${param.search}"/>
                                </div>
                                <div class="col-auto">
                                    <input type="submit" class="btn btn-primary mb-3" value="Search"/>
                                </div>
                            </form>
                        </c:if>
                        <c:if test="${empty param.search}">
                            <form class="row g-3" action="ScoreSearchController">
                                <div class="col-auto">
                                    <input type="hidden" name="check" value="Search" class="form-check-input" id="check">
                                    <input class="form-control" type="text" name="search" placeholder="Search.." value=""/>
                                </div>
                                <div class="col-auto">
                                    <input type="submit" class="btn btn-primary mb-3" value="Search"/>
                                </div>
                            </form>
                        </c:if>

                        <c:if test="${requestScope.LIST_SCORE != null && not empty requestScope.LIST_SCORE}">                       
                            <table class="table table-bordered table-hover" width="100%" cellspacing="0">
                                <h4>List of all Scores</h4>
                                <thead>
                                    <tr class="text-center">
                                        <th>No</th>
                                        <th>Quiz ID</th>
                                        <th>User ID</th>
                                        <th>Start Time</th>
                                        <th>End Time</th>
                                        <th>Mark</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="lop" varStatus="counter" items="${requestScope.LIST_SCORE}">
                                        <tr>
                                            <td>${counter.count}</td>
                                            <td>${lop.quizID}</td>
                                            <td>${lop.userID}</td>
                                            <td>${lop.startTime}</td>
                                            <td>${lop.endTime}</td>
                                            <td>${lop.mark}</td>
                                        </tr>
                                    </tbody>
                                </c:forEach>         
                            </table>
                        </c:if><br>
                    </div>
                    <!--</div>
                </div>
                </div>        
                /.container-fluid -->

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
                            <span aria-hidden="true">X</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="login.html">Logout</a>
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
        <script src="Dashboard/vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="Dashboard/vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="Dashboard/js/demo/datatables-demo.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


    </body>

</html>
