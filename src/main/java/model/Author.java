package model;

import java.sql.Date;
import java.util.Objects;

public class Author {
    private String codeAuthor;
    private String fullNameAuthor;
    private Date dayOfBirthAuthor;
    private String storyAuthor;

    public void setCodeAuthor(String codeAuthor) {
        this.codeAuthor = codeAuthor;
    }

    public String getCodeAuthor() {
        return codeAuthor;
    }

    public void setFullNameAuthor(String fullNameAuthor) {
        this.fullNameAuthor = fullNameAuthor;
    }

    public String getFullNameAuthor() {
        return fullNameAuthor;
    }

    public void setDayOfBirthAuthor(Date dayOfBirthAuthor) {
        this.dayOfBirthAuthor = dayOfBirthAuthor;
    }

    public Date getDayOfBirthAuthor() {
        return dayOfBirthAuthor;
    }

    public void setStoryAuthor(String storyAuthor) {
        this.storyAuthor = storyAuthor;
    }

    public String getStoryAuthor() {
        return storyAuthor;
    }

    public Author(String codeAuthor, String fullNameAuthor, Date dayOfBirthAuthor, String tieuSu) {
        this.setCodeAuthor(codeAuthor);
        this.setFullNameAuthor(fullNameAuthor);
        this.setDayOfBirthAuthor(dayOfBirthAuthor);
        this.setStoryAuthor(codeAuthor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return Objects.equals(getCodeAuthor(), author.getCodeAuthor());
    }

    @Override
    public String toString() {
        return "Code Author: " + getCodeAuthor() + ", Full Name Author: "
                + getFullNameAuthor() + ", Day Of Birth: " + getDayOfBirthAuthor()
                + ", Story Author: " + getStoryAuthor();
    }
}
