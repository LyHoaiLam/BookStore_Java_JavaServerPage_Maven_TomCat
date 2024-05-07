package model;

import java.sql.Date;

public class Order {
    private String codeOrder;
    private Customer codeCustomer;
    private String buyerAddress;
    private String receiverAddress;
    private String statusOrder;
    private String totalPaymentAmount;
    private Date orderDateOrder;
    private Date deliveryDateOrder;

    public void setCodeOrder(String codeOrder) {
        this.codeOrder = codeOrder;
    }

    public String getCodeOrder() {
        return codeOrder;
    }

    public void setCodeCustomer(Customer codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public Customer getCodeCustomer() {
        return codeCustomer;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setOrderDateOrder(Date orderDateOrder) {
        this.orderDateOrder = orderDateOrder;
    }

    public Date getDeliveryDateOrder() {
        return deliveryDateOrder;
    }

    public void setDeliveryDateOrder(Date deliveryDateOrder) {
        this.deliveryDateOrder = deliveryDateOrder;
    }

    public Date getOrderDateOrder() {
        return orderDateOrder;
    }

    public Order() {

    }

    public Order(String codeOrder, Customer codeCustomer, String buyerAddress,
            String receiverAddress, String statusOrder, String totalPaymentAmount,
            Date orderDateOrder, Date deliveryDateOrder) {
        this.setCodeOrder(codeOrder);
        this.setCodeCustomer(codeCustomer);
        this.setBuyerAddress(buyerAddress);
        this.setReceiverAddress(receiverAddress);
        this.setStatusOrder(statusOrder);
        this.setTotalPaymentAmount(totalPaymentAmount);
        this.setOrderDateOrder(orderDateOrder);
        this.setDeliveryDateOrder(deliveryDateOrder);
    }
}
