/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp.Functions;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import swp.util.DBHelper;

/**
 *
 * @author Admin
 */
public class FunctionDAO implements Serializable {

    public boolean checkLogin(String email, String password)
            throws NamingException, SQLException {

        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            //connect to db
            con = DBHelper.makeConnection();

            if (con != null) {
                //make call to db
                String sql = "Select email "
                        + "From QuizApp "//database name here, change if db name change
                        + "Where email =? And password =?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();

                //check if user exist in db
                if (rs.next()) {
                    return true;
                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean registerUser(String firstName, String lastName, String email, String password)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            //make connection
            con = DBHelper.makeConnection();
            if (con != null) {
                //call db
                String sql = "Insert QuizApp "//db name change if needed
                        + "(email, firstName, lastName, password) "
                        + "Values (?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, firstName);
                stm.setString(3, lastName);
                stm.setString(4, password);
                
                //check if changes were made in db
                int rowEffect = stm.executeUpdate();

                if (rowEffect > 0) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean resetPassword(String email, String password)
            throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = DBHelper.makeConnection();
            
            if(con != null){
                //call db
                String sql = "Update QuizApp " //db name change if needed
                        +"Set password =? "
                        +"Where email =?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setString(2, email);
                
                //check if changes were made in db
                int rowEffect = stm.executeUpdate();
                
                if(rowEffect > 0) return true;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
