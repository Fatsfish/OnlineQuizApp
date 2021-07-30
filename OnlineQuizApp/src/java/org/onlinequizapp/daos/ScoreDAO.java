/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.onlinequizapp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.onlinequizapp.dtos.ScoreDTO;
import org.onlinequizapp.utils.DBUtils;

/**
 *
 * @author User-PC
 */
public class ScoreDAO {

    public ScoreDTO getListS(String search, String id) throws SQLException {
        ScoreDTO listQuiz = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "Select QuizID, UserID, StartTime, EndTime, Mark " + "from tblScore "
                        + "WHERE quizID like ? and userID like ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                stm.setString(2, id);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String QuizID = rs.getString("QuizID");
                    String questionID = rs.getString("userID");
                    Timestamp STime = rs.getTimestamp("StartTime");
                    Timestamp ETime = rs.getTimestamp("EndTime");
                    String Mark = rs.getString("Mark");
                    listQuiz = new ScoreDTO(QuizID, questionID, STime, ETime, Mark);

                }
            }

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }

        }
        return listQuiz;
    }

    public boolean deleteS(String ID, String QID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "DELETE tblScore " + "Where QuizID=? and UserID=? ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, ID);
                stm.setString(2, QID);
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }

        }
        return check;
    }

    public boolean updateS(ScoreDTO quiz) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPdaTE tblSccore SET StartTime=?, EndTime=?, Mark=? " + " Where QuizID=? and UserID=? ";
                stm = conn.prepareStatement(sql);
                stm.setTimestamp(1, quiz.getStartTime());
                stm.setTimestamp(1, quiz.getEndTime());
                stm.setString(2, quiz.getMark());
                stm.setString(3, quiz.getQuizID());
                stm.setString(4, quiz.getUserID());
                check = stm.executeUpdate() > 0 ? true : false;
            }

        } catch (Exception e) {

        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public void insertS(ScoreDTO quiz) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO tblScore(QuizID, UserID, StartTime,EndTime, Mark ) "
                        + " VALUES(\'?\',\'?\',\'?\',\'?\',\'?\')";
                stm = conn.prepareStatement(sql);
                stm.setString(1, quiz.getQuizID());
                stm.setString(2, quiz.getUserID());
                stm.setTimestamp(3, quiz.getStartTime());
                stm.setTimestamp(4, quiz.getEndTime());
                stm.setString(5, quiz.getMark());

            }
        } catch (Exception e) {

        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public List<ScoreDTO> getList(String search) throws SQLException {
        List<ScoreDTO> listScore = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "Select QuizID, Name, userID, startTime, endTime, Mark "
                        + " from tblScore WHERE UserID like ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String QuizID = rs.getString("quizID");
                    String UserID = rs.getString("userID");
                    Timestamp StartTime = rs.getTimestamp("startTime");
                    Timestamp EndTime = rs.getTimestamp("endTime");
                    String Mark = rs.getString("mark");
                    if (listScore == null) {
                        listScore = new ArrayList<>();
                    }
                    listScore.add(new ScoreDTO(QuizID, UserID, StartTime, EndTime, Mark));

                }
            }

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }

        }
        return listScore;
    }

}
