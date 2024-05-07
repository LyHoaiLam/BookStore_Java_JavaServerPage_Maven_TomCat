package model;

import java.sql.Date;

public class Customer {
    private String codeCustomer;
    private String fullNameCustomer;
    private String usernameCustomer;
    private String passwordCustomer;
    private String sexCustomer;
    private String addressCustomer;
    private Date dateOfBirthCustomer;
    private String numberPhoneCustomer;
    private String mailCustomer;
    private String getNotificationCustomer;

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setFullNameCustomer(String fullNameCustomer) {
        this.fullNameCustomer = fullNameCustomer;
    }

    public String getFullNameCustomer() {
        return fullNameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setSexCustomer(String sexCustomer) {
        this.sexCustomer = sexCustomer;
    }

    public String getSexCustomer() {
        return sexCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setDateOfBirthCustomer(Date dateOfBirthCustomer) {
        this.dateOfBirthCustomer = dateOfBirthCustomer;
    }

    public Date getDateOfBirthCustomer() {
        return dateOfBirthCustomer;
    }

    public void setNumberPhoneCustomer(String numberPhoneCustomer) {
        this.numberPhoneCustomer = numberPhoneCustomer;
    }

    public String getNumberPhoneCustomer() {
        return numberPhoneCustomer;
    }

    public void setMailCustomer(String mailCustomer) {
        this.mailCustomer = mailCustomer;
    }

    public String getMailCustomer() {
        return mailCustomer;
    }

    public void setGetNotificationCustomer(String getNotificationCustomer) {
        this.getNotificationCustomer = getNotificationCustomer;
    }

    public String getGetNotificationCustomer() {
        return getNotificationCustomer;
    }

    public Customer() {

    }

    public Customer(String codeCustomer, String fullNameCustomer, String usernameCustomer, String passwordCustomer,
            String sexCustomer, String addressCustomer, Date dateOfBirthCustomer, String numberPhoneCustomer,
            String mailCustomer, String getNotificationCustomer) {

        this.setCodeCustomer(codeCustomer);
        this.setFullNameCustomer(fullNameCustomer);
        this.setUsernameCustomer(usernameCustomer);
        this.setPasswordCustomer(passwordCustomer);
        this.setSexCustomer(sexCustomer);
        this.setAddressCustomer(addressCustomer);
        this.setDateOfBirthCustomer(dateOfBirthCustomer);
        this.setNumberPhoneCustomer(numberPhoneCustomer);
        this.setMailCustomer(mailCustomer);
        this.setGetNotificationCustomer(getNotificationCustomer);
    }

}
