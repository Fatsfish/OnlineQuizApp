/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.onlinequizapp.daos.BlogDAO;
import org.onlinequizapp.dtos.BlogDTO;

/**
 *
 * @author User-PC
 */
@WebServlet(name = "BlogUpdateController", urlPatterns = { "/BlogUpdateController" })
public class BlogUpdateController extends HttpServlet {

    private static final String SUCCESS = "BlogSearchController";
    private static final String ERROR = "updateBlog.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        String check = request.getParameter("check");
        if (check.equals("confirm")) {
            BlogDTO blogDTO = new BlogDTO("", "", "", "", "", "", "");
            try {
                String authorID = request.getParameter("authorID");
                String blogID = request.getParameter("BlogID");
                String title = request.getParameter("Title");
                String content = request.getParameter("content");
                String image = request.getParameter("Image");
                String blogCategoryID = request.getParameter("BlogCategory");
                String status = request.getParameter("status");
                boolean flag = true;
                if (status == null) {
                    status = "0";
                } else if (status.equals("on")) {
                    status = "1";
                } else {
                    status = "0";
                }
                if (content.length() < 1) {
                    flag = false;
                    blogDTO.setContent("You must enter something to post ");
                }
                if (blogCategoryID == null || blogCategoryID.isEmpty()) {
                    flag = false;
                    blogDTO.setCategoryID("Please choose a category");
                }
                if (flag) {
                    BlogDAO dao = new BlogDAO();
                    BlogDTO dto = new BlogDTO(blogID, title, authorID, blogCategoryID, content, image, status);

                    dao.update(dto);
                    if (dao.update(dto)) {
                        request.setAttribute("UPDATE_BLOG_SUCCESS", "Update");
                        url = SUCCESS;
                    } else {
                        request.setAttribute("UPDATE_BLOG_ERROR", "Update fail");
                    }

                } else {
                    request.setAttribute("UPDATE_BLOG_ERROR", "Update fail");
                }
            } catch (Exception e) {
                log(e.toString());
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }

        } else if (check.equals("updateBlog")) {

            request.getRequestDispatcher(ERROR).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
