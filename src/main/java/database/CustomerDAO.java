package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Customer;
import model.JDBCUtil;

public class CustomerDAO {
    public ArrayList<Customer> data = new ArrayList<>();

    public ArrayList<Customer> SelectAll() {
        ArrayList<Customer> kQ = new ArrayList<Customer>();

        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM customer";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String codeCustomer = resultSet.getString("codeCustomer");
                String fullNameCustomer = resultSet.getString("fullNameCustomer");
                String usernameCustomer = resultSet.getString("usernameCustomer");
                String passwordCustomer = resultSet.getString("passwordCustomer");
                String sexCustomer = resultSet.getString("sexCustomer");
                String addressCustomer = resultSet.getString("addressCustomer");
                Date dateOfBirthCustomer = resultSet.getDate("dateOfBirthCustomer");
                String numberPhoneCustomer = resultSet.getString("numberPhoneCustomer");
                String mailCustomer = resultSet.getString("mailCustomer");
                String getNotificationsCustomer = resultSet.getString("getNotificationsCustomer");

                Customer customer = new Customer(codeCustomer, fullNameCustomer, usernameCustomer, passwordCustomer,
                        sexCustomer, addressCustomer, dateOfBirthCustomer, numberPhoneCustomer, mailCustomer,
                        getNotificationsCustomer);
                data.add(customer);
            }
            JDBCUtil.CloseConnection(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kQ;

    }

    public Customer SelectById(Customer customerInput) {
        Customer customerById = null;

        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM customer WHERE codeCustomer=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String codeCustomer = resultSet.getString("codeCustomer");
                String fullNameCustomer = resultSet.getString("fullNameCustomer");
                String usernameCustomer = resultSet.getString("usernameCustomer");
                String passwordCustomer = resultSet.getString("passwordCustomer");
                String sexCustomer = resultSet.getString("sexCustomer");
                String addressCustomer = resultSet.getString("addressCustomer");
                Date dateOfBirthCustomer = resultSet.getDate("dateOfBirthCustomer");
                String numberPhoneCustomer = resultSet.getString("numberPhoneCustomer");
                String mailCustomer = resultSet.getString("mailCustomer");
                String getNotificationsCustomer = resultSet.getString("getNotificationsCustomer");

                customerById = new Customer(codeCustomer, fullNameCustomer, usernameCustomer, passwordCustomer,
                        sexCustomer, addressCustomer, dateOfBirthCustomer, numberPhoneCustomer, mailCustomer,
                        getNotificationsCustomer);
            }

            JDBCUtil.CloseConnection(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerById;

    }

    public Customer SelectByIdUsernameAndPassword(Customer customerInput) {
        Customer customerById = null;

        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM customer WHERE usernameCustomer=? and passwordCustomer=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            System.out.println(customerInput.getUsernameCustomer() + " / " + customerInput.getPasswordCustomer());
            preparedStatement.setString(1, customerInput.getUsernameCustomer());
            preparedStatement.setString(2, customerInput.getPasswordCustomer());

            System.out.println(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String codeCustomer = resultSet.getString("codeCustomer");
                String fullNameCustomer = resultSet.getString("fullNameCustomer");
                String usernameCustomer = resultSet.getString("usernameCustomer");
                String passwordCustomer = resultSet.getString("passwordCustomer");
                String sexCustomer = resultSet.getString("sexCustomer");
                String addressCustomer = resultSet.getString("addressCustomer");
                Date dateOfBirthCustomer = resultSet.getDate("dateOfBirthCustomer");
                String numberPhoneCustomer = resultSet.getString("numberPhoneCustomer");
                String mailCustomer = resultSet.getString("mailCustomer");
                String getNotificationsCustomer = resultSet.getString("getNotificationsCustomer");

                customerById = new Customer(codeCustomer, fullNameCustomer, usernameCustomer, passwordCustomer,
                        sexCustomer, addressCustomer, dateOfBirthCustomer, numberPhoneCustomer, mailCustomer,
                        getNotificationsCustomer);
            }

            JDBCUtil.CloseConnection(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerById;
    }

    public boolean CheckUsernameCustomer(String usernameCustomer) {
        boolean kQ = false;
        try {

            Connection connection = JDBCUtil.getConnection();
            String sql = "SELECT * FROM customer WHERE usernameCustomer=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, usernameCustomer);

            System.out.println(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                kQ = true;
            }

            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kQ;
    }

    public boolean ChangedPasswordCustomer(Customer customerInput) {
        int kQ = 0;
        try {
            Connection connection = JDBCUtil.getConnection();

            String sql = "UPDATE customer " + " SET " + " passwordCustomer=?" + " WHERE codeCustomer=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getPasswordCustomer());
            preparedStatement.setString(2, customerInput.getCodeCustomer());// Dựa vào maKhachHang để changedPassword
            System.out.println(sql);
            kQ = preparedStatement.executeUpdate();

            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + kQ + " dòng bị thay đổi!");

            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kQ > 0;
    }

    public int UpdateInforCustomer(Customer customerInput) {
        int kQ = 0;
        try {

            Connection connection = JDBCUtil.getConnection();
            String sql = "UPDATE customer " + " SET " + " fullNameCustomer=?" + ", sexCustomer=?"
                    + ", addressCustomer=?" + ", dateOfBirthCustomer=?" + ", numberPhoneCustomer=?"
                    + ", mailCustomer=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getFullNameCustomer());
            preparedStatement.setString(2, customerInput.getSexCustomer());
            preparedStatement.setString(3, customerInput.getAddressCustomer());
            preparedStatement.setDate(4, customerInput.getDateOfBirthCustomer());
            preparedStatement.setString(5, customerInput.getNumberPhoneCustomer());
            preparedStatement.setString(6, customerInput.getMailCustomer());
            // preparedStatement.setBoolean(9, customerInput.getGetNotificationCustomer());
            // Bước 3: thực thi câu lệnh SQL

            System.out.println(sql);
            kQ = preparedStatement.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + kQ + " dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kQ;
    }

    public boolean ChangePasswordCustomer(Customer customerInput) {
        int kQ = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection connection = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "UPDATE customer " + " SET " + " passwordCustomer=?" + " WHERE codeCustomer=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getPasswordCustomer());
            preparedStatement.setString(2, customerInput.getCodeCustomer());
            // Bước 3: thực thi câu lệnh SQL

            System.out.println(sql);
            kQ = preparedStatement.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + kQ + " dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kQ > 0;
    }

    public int UpdateCustomer(Customer customerInput) {
        int kQ = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection connection = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "UPDATE customer " + " SET " + ", fullNameCustomer=?" + " usernameCustomer=?"
                    + ", passwordCustomer=?"
                    + ", sexCustomer=?"
                    + ", addressCustomer=?" + ", dateOfBirthCustomer=?" + ", numberPhoneCustomer=?" + ", mailCustomer=?"
                    + ", getNotificationsCustomer=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getFullNameCustomer());
            preparedStatement.setString(2, customerInput.getUsernameCustomer());
            preparedStatement.setString(3, customerInput.getPasswordCustomer());
            preparedStatement.setString(4, customerInput.getSexCustomer());
            preparedStatement.setString(5, customerInput.getAddressCustomer());
            preparedStatement.setDate(6, customerInput.getDateOfBirthCustomer());
            preparedStatement.setString(7, customerInput.getNumberPhoneCustomer());
            preparedStatement.setString(8, customerInput.getMailCustomer());
            preparedStatement.setString(9, customerInput.getGetNotificationCustomer());

            System.out.println(sql);
            kQ = preparedStatement.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + kQ + " dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kQ;
    }

    public int InsertCustomer(Customer customerInput) {
        int kQ = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection connection = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "INSERT INTO customer (codeCustomer, fullNameCustomer, usernameCustomer, passwordCustomer, sexCustomer, addressCustomer, dateOfBirthCustomer, numberPhoneCustomer, mailCustomer, getNotificationCustomer)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getCodeCustomer());
            preparedStatement.setString(2, customerInput.getFullNameCustomer());
            preparedStatement.setString(3, customerInput.getUsernameCustomer());
            preparedStatement.setString(4, customerInput.getPasswordCustomer());
            preparedStatement.setString(5, customerInput.getSexCustomer());
            preparedStatement.setString(6, customerInput.getAddressCustomer());
            preparedStatement.setDate(7, customerInput.getDateOfBirthCustomer());
            preparedStatement.setString(8, customerInput.getNumberPhoneCustomer());
            preparedStatement.setString(9, customerInput.getMailCustomer());
            preparedStatement.setString(10, customerInput.getGetNotificationCustomer());

            // Bước 3: thực thi câu lệnh SQL
            kQ = preparedStatement.executeUpdate();
            // Bước 4:
            System.out.println("Ban Da Thuc Thi: " + sql);
            System.out.println("Co " + kQ + " Dong Bi Thay Doi!");
            // Bước 5:
            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kQ;
    }

    public int InsertAllCustomer(ArrayList<Customer> arr) {
        int dem = 0;
        for (Customer customer : arr) {
            dem += this.InsertCustomer(customer);
        }
        return dem;
    }

    public int DeleteCustomer(Customer customerInput) {
        int kQ = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection connection = JDBCUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "DELETE from customer " + " WHERE codeCustomer=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerInput.getCodeCustomer());

            // Bước 3: thực thi câu lệnh SQL
            System.out.println(sql);
            kQ = preparedStatement.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + kQ + " dòng bị thay đổi!");

            // Bước 5:
            JDBCUtil.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kQ;
    }

}
