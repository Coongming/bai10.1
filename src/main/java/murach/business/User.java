package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String firstName;
    private String lastName;

    // Constructor mặc định (không tham số)
    public User() {}

    // Constructor mới nhận 3 tham số
    public User(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters và setters của bạn
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String v) { this.firstName = v; }
    public String getLastName() { return lastName; }
    public void setLastName(String v) { this.lastName = v; }
}