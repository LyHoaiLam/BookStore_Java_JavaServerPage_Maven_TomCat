package model;

public class Product {
    private String codeProduct;
    private String nameProduct;
    private Author codeAuthor;
    private int publishingYearProduct;
    private double importPricesProduct;
    private double priceProduct;
    private int theNumberOfProduts;
    private Category codeCategory;
    private String languageProduct;
    private String descriptionProduct;

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setCodeAuthor(Author codeAuthor) {
        this.codeAuthor = codeAuthor;
    }

    public Author getCodeAuthor() {
        return codeAuthor;
    }

    public void setPublishingYearProduct(int publishingYearProduct) {
        this.publishingYearProduct = publishingYearProduct;
    }

    public int getPublishingYearProduct() {
        return publishingYearProduct;
    }

    public void setImportPricesProduct(double importPricesProduct) {
        this.importPricesProduct = importPricesProduct;
    }

    public double getImportPricesProduct() {
        return importPricesProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setTheNumberOfProduts(int theNumberOfProduts) {
        this.theNumberOfProduts = theNumberOfProduts;
    }

    public int getTheNumberOfProduts() {
        return theNumberOfProduts;
    }

    public void setCodeCategory(Category codeCategory) {
        this.codeCategory = codeCategory;
    }

    public Category getCodeCategory() {
        return codeCategory;
    }

    public void setLanguageProduct(String languageProduct) {
        this.languageProduct = languageProduct;
    }

    public String getLanguageProduct() {
        return languageProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public Product() {

    }

    public Product(String codeProduct, String nameProduct, Author codeAuthor,
            int publishingYearProduct, double importPricesProduct, double priceProduct,
            int theNumberOfProduts, Category codeCategory, String languageProduct, String descriptionProduct) {

        this.setCodeProduct(codeProduct);
        this.setNameProduct(nameProduct);
        this.setCodeAuthor(codeAuthor);
        this.setPublishingYearProduct(publishingYearProduct);
        this.setImportPricesProduct(importPricesProduct);
        this.setPriceProduct(priceProduct);
        this.setTheNumberOfProduts(theNumberOfProduts);
        this.setCodeCategory(codeCategory);
        this.setLanguageProduct(languageProduct);
        this.setDescriptionProduct(descriptionProduct);
    }

}
