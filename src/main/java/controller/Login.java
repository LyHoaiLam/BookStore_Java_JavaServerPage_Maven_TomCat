package controller;

import java.io.IOException;
import java.util.Random;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.CustomerDAO;
import model.Customer;

@WebServlet("/websitebookjsp")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String actions = request.getParameter("actions");
        if (actions.equals("login-bookstorejavajsp")) {
            Login(request, response);
        } else if (actions.equals("logout-bookstorejavajsp")) {
            Logout(request, response);
        } else if (actions.equals("register-bookstorejavajsp")) {
            Register(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void Login(HttpServletRequest request, HttpServletResponse response) {
        try {

            String usernameCustomer = request.getParameter("usernameCustomer");
            String passwordCustomer = request.getParameter("passwordCustomer");

            Customer customer = new Customer();
            customer.setUsernameCustomer(usernameCustomer);
            customer.setPasswordCustomer(passwordCustomer);

            CustomerDAO customerDAO = new CustomerDAO();
            Customer customer2 = customerDAO.SelectByIdUsernameAndPassword(customer);
            String url = "";
            if (customer2 != null) {
                HttpSession session = request.getSession();
                session.setAttribute("customer2", customer2);
                url = "/Customer/Success.jsp";
            } else {
                request.setAttribute("baoLoi", "Tên đăng nhập hoặc mật khẩu không đúng!");
                url = "/Customer/Failed.jsp";
            }

            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession sesson = request.getSession();
            sesson.invalidate();
            String url = request.getScheme() + "://" + request.getServerName() + ":"
                    + request.getServerPort() + request.getContextPath();
            response.sendRedirect(url + "/Home.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Register(HttpServletRequest request, HttpServletResponse response) {
        try {
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
            } else {
                passwordCustomer = againPasswordCustomer;
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
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
