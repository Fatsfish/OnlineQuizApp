package org.onlinequizapp.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paypal.base.rest.PayPalRESTException;

import org.onlinequizapp.daos.BillingDAO;
import org.onlinequizapp.daos.PayPalDAO;
import org.onlinequizapp.daos.UserDAO;
import org.onlinequizapp.dtos.CartDTO;
import org.onlinequizapp.dtos.OrderDTO;
import org.onlinequizapp.dtos.PayPalDetail;
import org.onlinequizapp.dtos.UserDTO;

@WebServlet("/authorize_payment")
public class PayPalAuthorizePayment extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public PayPalAuthorizePayment() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String product = request.getParameter("product");
        String subtotal = request.getParameter("subtotal");
        String shipping = request.getParameter("shipping");
        String tax = request.getParameter("tax");
        String total = request.getParameter("total");
        HttpSession session = request.getSession(true);
        UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
        CartDTO cart = (CartDTO) session.getAttribute("CART");
        OrderDTO dto = null;
        if (cart == null) {
            cart = new CartDTO();
        }
        UserDAO test = new UserDAO();
        if (user == null) {
            try {
                user = test.checkLogin("james", "123456");
            } catch (SQLException ex) {
                Logger.getLogger(PayPalAuthorizePayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (user != null) {
            dto = new OrderDTO(user.getUserID(), "CURRENT_TIMESTAMP", total);
        }
        BillingDAO dao = new BillingDAO();
        try {
            dao.insert(dto);
        } catch (SQLException ex) {
            Logger.getLogger(PayPalAuthorizePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            product = dao.getID();
        } catch (SQLException ex) {
            Logger.getLogger(PayPalAuthorizePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dao.insertDetail(cart);
        } catch (SQLException ex) {
            Logger.getLogger(PayPalAuthorizePayment.class.getName()).log(Level.SEVERE, null, ex);
        }

        PayPalDetail orderDetail = new PayPalDetail(product, subtotal, shipping, tax, total);
        try {
            PayPalDAO paymentServices = new PayPalDAO();
            String approvalLink = paymentServices.authorizePayment(orderDetail);
            response.sendRedirect(approvalLink);

        } catch (PayPalRESTException ex) {
            request.setAttribute("errorMessage", ex.getMessage());
            ex.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
