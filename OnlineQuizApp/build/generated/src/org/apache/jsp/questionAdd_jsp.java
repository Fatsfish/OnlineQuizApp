package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.onlinequizapp.daos.CategoryDAO;
import java.util.List;
import org.onlinequizapp.dtos.CategoryDTO;

public final class questionAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Admin - Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"Dashboard/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"Dashboard/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Wrapper -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar - Brand -->\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon\">\r\n");
      out.write("                        <i class=\"fas fa-crown\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">Admin</div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Dashboard -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"dashboardadmin.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                        <span>Dashboard</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                <div class=\"sidebar-heading\">\r\n");
      out.write("                    Learn\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Courses Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseCourses\"\r\n");
      out.write("                       aria-expanded=\"false\" aria-controls=\"collapseCourses\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-book\"></i>\r\n");
      out.write("                        <span>Courses</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapseCourses\" class=\"collapse\" aria-labelledby=\"headingCourses\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">Courses:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"all-course.html\">All Courses</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"course.jsp\">My Courses</a>\r\n");
      out.write("                            <div class=\"collapse-divider\"></div>\r\n");
      out.write("                            <h6 class=\"collapse-header\">Create:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"courseAdd.jsp\">Create Course</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Quizzes Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseQuizzes\"\r\n");
      out.write("                       aria-expanded=\"false\" aria-controls=\"collapseQuizzes\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-edit\"></i>\r\n");
      out.write("                        <span>Quizzes</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapseQuizzes\" class=\"collapse\" aria-labelledby=\"headingQuizzes\"\r\n");
      out.write("                         data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">Quizzes:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"all-quiz.html\">All Quizzes</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"quiz.jsp\">My Quizzes</a>\r\n");
      out.write("                            <div class=\"collapse-divider\"></div>\r\n");
      out.write("                            <h6 class=\"collapse-header\">Create:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"quizAdd.html\">Create Quiz</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Marks -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("                        <span>Marks</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                <div class=\"sidebar-heading\">\r\n");
      out.write("                    Community\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Blogs Collapse Menu -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseBlogs\"\r\n");
      out.write("                       aria-expanded=\"false\" aria-controls=\"collapseBlogs\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-users\"></i>\r\n");
      out.write("                        <span>Blogs</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div id=\"collapseBlogs\" class=\"collapse\" aria-labelledby=\"headingBlogs\"\r\n");
      out.write("                         data-parent=\"#accordionSidebar\">\r\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                            <h6 class=\"collapse-header\">Blogs:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"all-blog.html\">All Blogs</a>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"blog.jsp\">My Blogs</a>\r\n");
      out.write("                            <div class=\"collapse-divider\"></div>\r\n");
      out.write("                            <h6 class=\"collapse-header\">Create:</h6>\r\n");
      out.write("                            <a class=\"collapse-item\" href=\"blogAdd.html\">Create Blog</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Charts -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"ranking.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-trophy\"></i>\r\n");
      out.write("                        <span>Ranking</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"search.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("                        <span>User Management</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Content Wrapper -->\r\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Main Content -->\r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar -->\r\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Topbar Search -->\r\n");
      out.write("                        <form\r\n");
      out.write("                            class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\r\n");
      out.write("                                       aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                <div class=\"input-group-append\">\r\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                        <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Topbar Navbar -->\r\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                            <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - User Information -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.LOGIN_USER.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    <img class=\"img-profile rounded-circle\"\r\n");
      out.write("                                         src=\"Dashboard/img/undraw_profile.svg\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - User Information -->\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Profile\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Settings\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Activity Log\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Logout\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Begin Page Content -->\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Page Heading -->\r\n");
      out.write("                        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("                            <h1 class=\"h3 mb-0 text-gray-800\">Question Add</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <a href=\"CategorySearchController?cate=1&check=Question&search=\" class=\"btn btn-primary mb-3\"/>Filter Category</a>\r\n");
      out.write("                            <form action=\"QuestionCreateController\">\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"questionName\" class=\"form-label\">Your question</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"Name\" class=\"form-control\" id=\"questionName\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <select name=\"categoryID\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("                                        <option selected>Choose category</option>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"Answer1\" class=\"form-label\">Answer 1</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"answer1\" class=\"form-control\" id=\"Answer1\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"Answer2\" class=\"form-label\">Answer 2</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"answer2\" class=\"form-control\" id=\"Answer2\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"Answer3\" class=\"form-label\">Answer 3</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"answer3\" class=\"form-control\" id=\"Answer3\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"Answer4\" class=\"form-label\">Answer 4 </label>\r\n");
      out.write("                                    <input type=\"text\" name=\"answer4\" class=\"form-control\" id=\"Answer4\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"QuestionDesc\" class=\"form-label\">Description</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" id=\"QuestionDesc\" name=\"description\" rows=\"3\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    <select name=\"answer\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("                                        <option selected>Choose Right Answer</option>\r\n");
      out.write("                                        <option value=\"1\">Answer 1</option>\r\n");
      out.write("                                        <option value=\"2\">Answer 2</option>\r\n");
      out.write("                                        <option value=\"3\">Answer 3</option>\r\n");
      out.write("                                        <option value=\"4\">Answer 4</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3 form-check\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"status\" class=\"form-check-input\" id=\"status\">\r\n");
      out.write("                                    <label class=\"form-check-label\" for=\"status\">Active</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" name=\"function\" value=\"question\" class=\"form-check-input\" id=\"status\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Create</button>\r\n");
      out.write("                                <a href=\"dashboardadmin.jsp\" class=\"btn btn-danger\">Cancel</a>\r\n");
      out.write("                            </form></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.container-fluid -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Footer -->\r\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                    <div class=\"container my-auto\">\r\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                            <span>Copyright &copy; Online Quiz App 2021</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Scroll to Top Button-->\r\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Logout Modal-->\r\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("             aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"LogoutController\">Logout</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript-->\r\n");
      out.write("        <script src=\"Dashboard/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"Dashboard/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scripts for all pages-->\r\n");
      out.write("        <script src=\"Dashboard/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level plugins -->\r\n");
      out.write("        <script src=\"Dashboard/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level custom scripts -->\r\n");
      out.write("        <script src=\"Dashboard/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("        <script src=\"Dashboard/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.LIST_QUIZ_CATEGORY != null && not empty requestScope.LIST_QUIZ_CATEGORY}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("category");
    _jspx_th_c_forEach_0.setVarStatus("counter");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.LIST_QUIZ_CATEGORY}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" - ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.LIST_QUIZ_CATEGORY != null && not empty requestScope.LIST_QUIZ_CATEGORY}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                       \r\n");
        out.write("                            <table class=\"table table-bordered table-hover\" width=\"100%\" cellspacing=\"0\">\r\n");
        out.write("                                <h4>Quiz Category</h4>\r\n");
        out.write("                                <thead>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <th>No</th>\r\n");
        out.write("                                        <th>Category ID</th>\r\n");
        out.write("                                        <th>Category Name</th>\r\n");
        out.write("                                        <th>Status</th>\r\n");
        out.write("                                        <th>Level</th>\r\n");
        out.write("                                        <th>Description</th>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </thead>\r\n");
        out.write("\r\n");
        out.write("                                <tbody>\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("         \r\n");
        out.write("                            </table>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_1.setVar("category");
    _jspx_th_c_forEach_1.setVarStatus("counter");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.LIST_QUIZ_CATEGORY}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.level}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    </tbody>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
