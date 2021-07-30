/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.onlinequizapp.daos.ClassDAO;
import org.onlinequizapp.daos.CourseDAO;
import org.onlinequizapp.daos.LectureDAO;
import org.onlinequizapp.dtos.ClassDTO;
import org.onlinequizapp.dtos.CourseDTO;
import org.onlinequizapp.dtos.LectureDTO;

@WebServlet(name = "LectureCreateController", urlPatterns = { "/LectureCreateController" })
public class LectureCreateController extends HttpServlet {

    private static final String SUCCESS = "lectureAdd.jsp";
    private static final String ERROR = "error.jsp";

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        String check = request.getParameter("check");
        CourseDAO dao1 = new CourseDAO();
        List<CourseDTO> list = null;
        List<ClassDTO> list1 = null;
        try {
            list = dao1.getListCourse("");
        } catch (SQLException e) {
            log("Error at CategorySearchController: " + e.toString());
        } finally {
            if (list != null) {
                request.setAttribute("LIST_COURSE", list);
            }
        }
        try {
            ClassDAO dao = new ClassDAO();
            list1 = dao.getList("");

        } catch (SQLException e) {
            log("Error at ClassSearchController: " + e.toString());
        } finally {
            if (list1 != null) {
                request.setAttribute("LIST_CLASS", list1);
                url = SUCCESS;
            }
        }
        if (check.equals("lecture")) {
            LectureDTO classDTO = new LectureDTO("", "", "", "", "", "");
            try {
                String lectureName = request.getParameter("Name");
                String status = request.getParameter("status");
                String description = request.getParameter("description");
                String courseID = request.getParameter("courseID");
                String classID = request.getParameter("classID");
                if (status == null) {
                    status = "0";
                } else if (status.equals("on")) {
                    status = "1";
                } else {
                    status = "0";
                }
                boolean flag = true;
                if (lectureName.length() > 250 || lectureName.length() < 1) {
                    flag = false;
                    classDTO.setLectureName("Lecture Name must be [1-250]");
                }
                if (description.length() > 250 || description.length() < 1) {
                    flag = false;
                    classDTO.setLectureName("Lecture Name must be [1-250]");
                }
                if (flag) {
                    LectureDAO dao = new LectureDAO();
                    LectureDTO cate = new LectureDTO("", courseID, lectureName, classID, description, status);
                    dao.insert(cate);
                    request.setAttribute("CREATE_SUCCESS", "Create Success!");
                    url = SUCCESS;

                } else {
                    request.setAttribute("CREATE_ERROR", "Create Fail!");
                    url = SUCCESS;
                }
            } catch (Exception e) {
                log("Error at CreateController: " + e.toString());
                if (e.toString().contains("duplicate")) {
                    classDTO.setClassID("Lecture Name duplicate!");
                    request.setAttribute("ERROR", classDTO);
                }
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }
        } else {
            request.getRequestDispatcher(url).forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LectureCreateController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LectureCreateController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
