package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CustomerDAO;
import model.Customer;

@WebServlet(name = "Register", urlPatterns = { "/regis-ter" })
public class Register extends HttpServlet {

    public Register() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullNameCustomer = request.getParameter("fullNameCustomer");
        String usernameCustomer = request.getParameter("usernameCustomer");
        String passwordCustomer = request.getParameter("passwordCustomer");
        String againPasswordCustomer = request.getParameter("againPasswordCustome");
        String sexCustomer = request.getParameter("sexCustomer");
        String addressCustomer = request.getParameter("addressCustomer");
        String dateOfBirthCustomer = request.getParameter("dateOfBirthCustomer");
        String numberPhoneCustomer = request.getParameter("numberPhoneCustomer");
        String mailCustomer = request.getParameter("mailCustomer");
        String getNotificationsCustomer = request.getParameter("getNotificationsCustomer");

        // Giữ lại thông tin user nhập nếu có lỗi (không bắt user nhập lại từ đầu)
        request.setAttribute("fullNameCustomer", fullNameCustomer);
        request.setAttribute("usernameCustomer", usernameCustomer);
        request.setAttribute("sexCustomer", sexCustomer);
        request.setAttribute("addressCustomer", addressCustomer);
        request.setAttribute("dateOfBirthCustomer", dateOfBirthCustomer);
        request.setAttribute("numberPhoneCustomer", numberPhoneCustomer);
        request.setAttribute("mailCustomer", mailCustomer);
        request.setAttribute("getNotificationsCustomer", getNotificationsCustomer);

        String url = "";
        String baoLoi = "";
        CustomerDAO customerDAO = new CustomerDAO();
        if (customerDAO.CheckUsernameCustomer(usernameCustomer)) {
            baoLoi += "Ten Dang Nhap Da Ton Tai Vui Long Nhap Ten Khac.<br/>";
        }
        if (!passwordCustomer.equals(againPasswordCustomer)) {
            baoLoi += "Mat Khau Khong Khop.<br/>";
        }

        request.setAttribute("baoLoi", baoLoi);

        if (baoLoi.length() > 0) {
            url = "/Customer/Failed.jsp";
        } else {
            Random rd = new Random();
            String codeCustomer = System.currentTimeMillis() + rd.nextInt(1000) + "";
            Customer customer = new Customer(codeCustomer, fullNameCustomer, usernameCustomer,
                    againPasswordCustomer, sexCustomer, addressCustomer, Date.valueOf(dateOfBirthCustomer),
                    numberPhoneCustomer, mailCustomer, getNotificationsCustomer);
            customerDAO.InsertCustomer(customer);
            url = "/Customer/Success.jsp";
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
