/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.onlinequizapp.daos.CategoryDAO;
import org.onlinequizapp.daos.ClassDAO;
import org.onlinequizapp.daos.EmailDAO;
import org.onlinequizapp.daos.QuizDAO;
import org.onlinequizapp.daos.UserDAO;
import org.onlinequizapp.dtos.CategoryBlogDTO;
import org.onlinequizapp.dtos.CategoryDTO;
import org.onlinequizapp.dtos.ClassDTO;
import org.onlinequizapp.dtos.QuizDTO;
import org.onlinequizapp.dtos.UserDTO;
import org.onlinequizapp.dtos.UserError;

/**
 *
 * @author User-PC
 */
@WebServlet(name = "QuizCreateController", urlPatterns = {"/QuizCreateController"})
public class QuizCreateController extends HttpServlet {

    private static final String SUCCESS = "quizAdd.jsp";
    private static final String ERROR = "error.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        String check = request.getParameter("check");
        List<ClassDTO> list = null;
        HttpSession session = request.getSession();
        String LogID = "";
        if (session.getAttribute("LOGIN_USER") != null) {
            LogID = ((UserDTO) session.getAttribute("LOGIN_USER")).getUserID();
        }
        try {
            ClassDAO dao = new ClassDAO();
            list = dao.getList("");
            if (list != null) {
                request.setAttribute("LIST_CLASS", list);
                url = SUCCESS;
            }
        } catch (SQLException e) {
            log("Error at ClassSearchController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
        if (check.equals("quiz")) {
            QuizDTO categoryDTO = new QuizDTO("", "", "", "", "", "", "", "");
            try {
                String Name = request.getParameter("Name");
                String description = request.getParameter("description");
                String status = request.getParameter("status");
                String classID = request.getParameter("classID");
                String mark = request.getParameter("mark");
                if (status == null) {
                    status = "0";
                } else if (status.equals("on")) {
                    status = "1";
                } else {
                    status = "0";
                }
                boolean flag = true;
                if (Name.length() > 250 || Name.length() < 1) {
                    flag = false;
                    categoryDTO.setName("Name must be [1-250]");
                }
                if (description.length() > 250 || description.length() < 1) {
                    flag = false;
                    categoryDTO.setDescription("Description must be [1-250]");
                }
                if (flag) {
                    QuizDAO dao = new QuizDAO();
                    categoryDTO.setAuthorID(LogID);
                    categoryDTO.setClassID(classID);
                    categoryDTO.setDescription(description);
                    categoryDTO.setName(Name);
                    categoryDTO.setStatus(status);
                    categoryDTO.setTotalMark(mark);
                    categoryDTO.setNumberOfQuestions("0");
                    dao.insertQ(categoryDTO);
                    request.setAttribute("CREATE_Q_SUCCESS", "Create Success!");
                    url = SUCCESS;
                } else {
                    request.setAttribute("CREATE_Q_ERROR", "Create Fail!");
                    url = SUCCESS;
                }
            } catch (Exception e) {
                log("Error at CreateController: " + e.toString());
                if (e.toString().contains("duplicate")) {
                    categoryDTO.setQuizID("Category Name duplicate!");
                    request.setAttribute("ERROR", categoryDTO);
                };
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
