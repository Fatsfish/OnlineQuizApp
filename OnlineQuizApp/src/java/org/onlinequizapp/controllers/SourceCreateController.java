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

import org.onlinequizapp.daos.LectureDAO;
import org.onlinequizapp.daos.SourceDAO;
import org.onlinequizapp.dtos.LectureDTO;
import org.onlinequizapp.dtos.SourceDTO;

/**
 *
 * @author User-PC
 */
@WebServlet(name = "SourceCreateController", urlPatterns = { "/SourceCreateController" })
public class SourceCreateController extends HttpServlet {

    private static final String FILE_MUST_BE_1_250 = "File's link must be [1-250]";
    private static final String SUCCESS = "sourceAdd.jsp";
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
        String function = request.getParameter("function");
        List<LectureDTO> list1 = null;
        try {
            LectureDAO dao = new LectureDAO();
            list1 = dao.getList("");

        } catch (SQLException e) {
            log("Error at ClassSearchController: " + e.toString());
        } finally {
            if (list1 != null) {
                request.setAttribute("LIST_LECTURE", list1);
            }
        }
        if (function.equals("source")) {
            SourceDTO source = new SourceDTO("", "", "", "", "", "", "");
            try {
                String lectureID = request.getParameter("lectureID");
                String fileDoc = request.getParameter("fileDoc");
                String filePic = request.getParameter("filePic");
                String fileVid = request.getParameter("fileVid");
                String reference = request.getParameter("reference");
                String status = request.getParameter("status");
                if (status == null) {
                    status = "0";
                } else if (status.equals("on")) {
                    status = "1";
                } else {
                    status = "0";
                }
                boolean flag = true;
                if (fileDoc.length() > 250 || fileDoc.length() < 1) {
                    flag = false;
                    source.setFileDoc(FILE_MUST_BE_1_250);
                }
                if (filePic.length() > 250 || filePic.length() < 1) {
                    flag = false;
                    source.setFilePic(FILE_MUST_BE_1_250);
                }
                if (fileVid.length() > 250 || fileVid.length() < 1) {
                    flag = false;
                    source.setFileVid(FILE_MUST_BE_1_250);
                }
                if (!(status.equals("1")) && !(status.equals("0"))) {
                    flag = false;
                    source.setStatus("Status must be 0 or 1");
                }
                if (flag) {
                    SourceDAO dao = new SourceDAO();
                    SourceDTO course = new SourceDTO("", lectureID, fileDoc, filePic, fileVid, reference, status);
                    dao.insert(course);
                    request.setAttribute("CREATE_SUCCESS", "Create Success!");
                    url = SUCCESS;
                } else {
                    request.setAttribute("CREATE_ERROR", "Create Fail!");
                    url = SUCCESS;
                }
            } catch (Exception e) {
                log("Error at CreateController: " + e.toString());
                if (e.toString().contains("duplicate")) {
                    source.setSourceID("Source duplicate!");
                    request.setAttribute("ERROR", source);
                }
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
            }
        } else {
            request.getRequestDispatcher(SUCCESS).forward(request, response);
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
