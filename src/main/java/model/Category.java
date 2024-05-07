package model;

public class Category {
    private String codeCategoty;
    private String nameCategory;

    public void setCodeCategoty(String codeCategoty) {
        this.codeCategoty = codeCategoty;
    }

    public String getCodeCategoty() {
        return codeCategoty;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public Category() {

    }

    public Category(String codeCategory, String nameCategory) {
        this.setCodeCategoty(codeCategory);
        this.setNameCategory(nameCategory);
    }
}
