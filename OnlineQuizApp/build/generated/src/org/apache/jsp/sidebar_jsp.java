package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("                <div class=\"sidebar-brand-icon\">\n");
      out.write("                    <i class=\"fas fa-crown\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">Admin</div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Dashboard -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"dashboardadmin.jsp\">\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                    <span>Dashboard</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("            <!-- Heading -->\n");
      out.write("            <div class=\"sidebar-heading\">\n");
      out.write("                Learn\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Courses Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseCourses\"\n");
      out.write("                   aria-expanded=\"false\" aria-controls=\"collapseCourses\">\n");
      out.write("                    <i class=\"fas fa-fw fa-book\"></i>\n");
      out.write("                    <span>Courses</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseCourses\" class=\"collapse\" aria-labelledby=\"headingCourses\" data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">Courses:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"all-course.html\">All Courses</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"course.jsp\">My Courses</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"lecture.jsp\">My Lectures</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"source.jsp\">My Resources</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"class.jsp\">My Classes</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Create:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"courseAdd.jsp\">Create Course</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"lectureAdd.jsp\">Create Lecture</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"sourceAdd.jsp\">Create Resource</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"classAdd.jsp\">Create Class</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Quizzes Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseQuizzes\"\n");
      out.write("                   aria-expanded=\"false\" aria-controls=\"collapseQuizzes\">\n");
      out.write("                    <i class=\"fas fa-fw fa-edit\"></i>\n");
      out.write("                    <span>Quizzes</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseQuizzes\" class=\"collapse\" aria-labelledby=\"headingQuizzes\"\n");
      out.write("                     data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">Quizzes:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"question.jsp\">All Question</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"all-quiz.html\">All Quizzes</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"quiz.jsp\">My Quizzes</a>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Create:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"quizAdd.html\">Create Quiz</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"questionAdd.jsp\">Create Question</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Marks -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Marks</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Category Collapse Menu -->\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseCategories\"\n");
      out.write("                   aria-expanded=\"false\" aria-controls=\"collapseCategories\">\n");
      out.write("                    <i class=\"fas fa-fw fa-list\"></i>\n");
      out.write("                    <span>Categories</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseCategories\" class=\"collapse\" aria-labelledby=\"headingQuizzes\"\n");
      out.write("                     data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">Categories:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"all-category.jsp\">All Categories</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Create:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"categoryAdd.jsp\">Create Quiz Category</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"categoryBlogAdd.jsp\">Create Blog Category</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("            <!-- Heading -->\n");
      out.write("            <div class=\"sidebar-heading\">\n");
      out.write("                Community\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Blogs Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseBlogs\"\n");
      out.write("                   aria-expanded=\"false\" aria-controls=\"collapseBlogs\">\n");
      out.write("                    <i class=\"fas fa-fw fa-users\"></i>\n");
      out.write("                    <span>Blogs</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseBlogs\" class=\"collapse\" aria-labelledby=\"headingBlogs\"\n");
      out.write("                     data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">Blogs:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"all-blog.html\">All Blogs</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"blog.jsp\">My Blogs</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Create:</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"create-blog.jsp\">Create Blog</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Charts -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"ranking.jsp\">\n");
      out.write("                    <i class=\"fas fa-fw fa-trophy\"></i>\n");
      out.write("                    <span>Ranking</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"search.jsp\">\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("                    <span>User Management</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("</body>\n");
      out.write("\n");
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
}
