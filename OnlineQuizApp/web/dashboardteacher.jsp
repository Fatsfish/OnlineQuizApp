<%-- 
    Document   : dashboardteacher
    Created on : Jul 19, 2021, 2:11:01 PM
    Author     : Mr Hien Khoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Teacher Dashboard</title>

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

        <c:if test="${sessionScope.LOGIN_USER.role =='T' || sessionScope.LOGIN_USER.role =='T1'}">
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-icon">
                    <i class="fas fa-chalkboard-teacher"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Teacher</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="index.html">
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
                    aria-expanded="true" aria-controls="collapseCourses">
                    <i class="fas fa-fw fa-book"></i>
                    <span>Courses</span>
                </a>
                <div id="collapseCourses" class="collapse" aria-labelledby="headingCourses" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Courses:</h6>
                        <a class="collapse-item" href="buttons.html">All Courses</a>
                        <a class="collapse-item" href="cards.html">My Courses</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Create:</h6>
                        <a class="collapse-item" href="404.html">Create Course</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Quizzes Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseQuizzes"
                    aria-expanded="true" aria-controls="collapseQuizzes">
                    <i class="fas fa-fw fa-edit"></i>
                    <span>Quizzes</span>
                </a>
                <div id="collapseQuizzes" class="collapse" aria-labelledby="headingQuizzes"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Quizzes:</h6>
                        <a class="collapse-item" href="utilities-color.html">All Quizzes</a>
                        <a class="collapse-item" href="utilities-border.html">My Quizzes</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Create:</h6>
                        <a class="collapse-item" href="404.html">Create Quiz</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Students -->
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="fas fa-fw fa-user-graduate"></i>
                    <span>Students</span></a>
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
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseBlogs" aria-expanded="false"
                    aria-controls="collapseBlogs">
                    <i class="fas fa-fw fa-users"></i>
                    <span>Blogs</span>
                </a>
                <div id="collapseBlogs" class="collapse" aria-labelledby="headingBlogs"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Blogs:</h6>
                        <a class="collapse-item" href="#">All Blogs</a>
                        <a class="collapse-item" href="#">My Blogs</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Create:</h6>
                        <a class="collapse-item" href="404.html">Create Blog</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Charts -->
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="fas fa-fw fa-trophy"></i>
                    <span>Ranking</span></a>
            </li>

            <!-- Nav Item - Tables -->
            <li class="nav-item">
                <a class="nav-link" href="tables.html">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Tables</span></a>
            </li>
            

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Others
            </div>

            <!-- Nav Item - Billing -->
            <li class="nav-item">
                <a class="nav-link" href="billing.html">
                    <i class="fas fa-fw fa-receipt"></i>
                    <span>Billing</span></a>
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
                                <a class="dropdown-item" href="#">
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

                    <!-- Page Heading -->
                    <h1 class="h3 mb-4 text-gray-800">Blank Page</h1>

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

</body>

</html>
