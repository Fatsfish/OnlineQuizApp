/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.onlinequizapp.daos.ClassDAO;
import org.onlinequizapp.daos.QuestionDAO;
import org.onlinequizapp.daos.QuizDAO;
import org.onlinequizapp.dtos.ClassDTO;
import org.onlinequizapp.dtos.QuestionDTO;
import org.onlinequizapp.dtos.QuizDTO;
import org.onlinequizapp.dtos.QuizDetailDTO;
import org.onlinequizapp.dtos.UserDTO;

/**
 *
 * @author User-PC
 */
@WebServlet(name = "QuizCreateController", urlPatterns = { "/QuizCreateController" })
public class QuizCreateController extends HttpServlet {

    private static final String ERROR_AT_CLASS_SEARCH_CONTROLLER = "Error at ClassSearchController: ";
    private static final String SUCCESS = "quizAdd.jsp";
    private static final String SUCCESS1 = "quizDetailAdd.jsp";
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        String check = request.getParameter("check");
        List<ClassDTO> list = null;
        List<QuestionDTO> list1 = null;
        List<QuizDTO> list2 = null;
        HttpSession session = request.getSession();
        String logID = "";
        if (session.getAttribute("LOGIN_USER") != null) {
            logID = ((UserDTO) session.getAttribute("LOGIN_USER")).getUserID();
        }
        try {
            ClassDAO dao = new ClassDAO();
            list = dao.getList("");

        } catch (SQLException e) {
            log(ERROR_AT_CLASS_SEARCH_CONTROLLER + e.toString());
        } finally {
            if (list != null) {
                request.setAttribute("LIST_CLASS", list);
            }
        }
        try {
            QuestionDAO dao1 = new QuestionDAO();
            list1 = dao1.getListQ("");
        } catch (SQLException e) {
            log(ERROR_AT_CLASS_SEARCH_CONTROLLER + e.toString());
        } finally {
            if (list1 != null) {
                request.setAttribute("LIST_QUESTION", list1);
            }
        }
        try {
            QuizDAO dao = new QuizDAO();
            list2 = dao.getListQ("");
        } catch (SQLException e) {
            log(ERROR_AT_CLASS_SEARCH_CONTROLLER + e.toString());
        } finally {
            if (list2 != null) {
                request.setAttribute("LIST_QUIZ", list2);
            }
        }
        if (check.equals("quiz")) {
            QuizDTO categoryDTO = new QuizDTO("", "", "", "", "", "", "", "");
            try {
                String name = request.getParameter("Name");
                String description = request.getParameter("description");
                String status = request.getParameter("status");
                String classID = request.getParameter("classID");
                if (status == null) {
                    status = "0";
                } else if (status.equals("on")) {
                    status = "1";
                } else {
                    status = "0";
                }
                boolean flag = true;
                if (name.length() > 250 || name.length() < 1) {
                    flag = false;
                    categoryDTO.setName("Name must be [1-250]");
                }
                if (description.length() > 250 || description.length() < 1) {
                    flag = false;
                    categoryDTO.setDescription("Description must be [1-250]");
                }
                if (flag) {
                    QuizDAO dao = new QuizDAO();
                    categoryDTO.setAuthorID(logID);
                    categoryDTO.setClassID(classID);
                    categoryDTO.setDescription(description);
                    categoryDTO.setName(name);
                    categoryDTO.setStatus(status);
                    categoryDTO.setTotalMark("0");
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
                }
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }
        } else if (check.equals("detail")) {
            QuizDetailDTO quiz = new QuizDetailDTO("", "", "", "");
            try {
                String quizID = request.getParameter("quizID");
                String questionID = request.getParameter("questionID");
                String time = request.getParameter("time");
                String mark = request.getParameter("mark");
                boolean flag = true;
                if (time.length() > 250 || time.length() < 1) {
                    flag = false;
                    quiz.setTime("Time must be [1-250]");
                }
                if (Integer.parseInt(mark) < 0) {
                    mark = "0";
                }
                if (Integer.parseInt(time) < 0) {
                    time = "0";
                }
                if (flag) {
                    QuizDAO dao = new QuizDAO();
                    quiz.setQuizID(quizID);
                    quiz.setQuestionID(questionID);
                    quiz.setTime(time);
                    quiz.setMark(mark);
                    dao.insertQD(quiz);
                    QuizDTO quiz1 = dao.getQ(quizID);
                    quiz1.setNumberOfQuestions(
                            String.format("%.2d", Integer.parseInt(quiz1.getNumberOfQuestions()) + 1));
                    quiz1.setTotalMark(
                            String.format("%.2f", (Integer.parseInt(quiz1.getTotalMark()) + Integer.parseInt(mark))));
                    dao.updateQ(quiz1);
                    request.setAttribute("CREATE_QD_SUCCESS", "Create Success!");
                    url = SUCCESS1;
                } else {
                    request.setAttribute("CREATE_QD_ERROR", "Create Fail!");
                    url = SUCCESS1;
                }
            } catch (Exception e) {
                log("Error at CreateController: " + e.toString());
                if (e.toString().contains("duplicate")) {
                    quiz.setQuizID("Category Name duplicate!");
                    request.setAttribute("ERROR", quiz);
                }
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }
        } else if (check.equals("quiz1")) {
            request.getRequestDispatcher(SUCCESS).forward(request, response);
        } else if (check.equals("quiz2")) {
            request.getRequestDispatcher(SUCCESS1).forward(request, response);
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
