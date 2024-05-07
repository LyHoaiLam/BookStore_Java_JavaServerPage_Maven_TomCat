package model;

public class DetailsOrder {
    private String codeDetailsOrder;
    private Order codeOrder;
    private Product codeProduct;
    private double count;
    private double originalPrice;
    private double discount;
    private double vat;
    private double totalMoney;

    public void setCodeDetailsOrder(String codeDetailsOrder) {
        this.codeDetailsOrder = codeDetailsOrder;
    }

    public String getCodeDetailsOrder() {
        return codeDetailsOrder;
    }

    public void setCodeOrder(Order codeOrder) {
        this.codeOrder = codeOrder;
    }

    public Order getCodeOrder() {
        return codeOrder;
    }

    public void setCodeProduct(Product codeProduct) {
        this.codeProduct = codeProduct;
    }

    public Product getCodeProduct() {
        return codeProduct;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getVat() {
        return vat;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public DetailsOrder() {

    }

    public DetailsOrder(String codeDetailsOrder, Order codeOrder, Product codeProduct,
            double count, double originalPrice, double discount, double vat,
            double totalMoney) {
        this.setCodeDetailsOrder(codeDetailsOrder);
        this.setCodeOrder(codeOrder);
        this.setCodeProduct(codeProduct);
        this.setCount(discount);
        this.setOriginalPrice(originalPrice);
        this.setDiscount(discount);
        this.setVat(vat);
        this.setTotalMoney(totalMoney);
    }

}
