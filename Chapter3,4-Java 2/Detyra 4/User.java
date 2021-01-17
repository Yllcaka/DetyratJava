
public class User {
    // 1.Atributet
    private int id;
    private String email;
    private String password;
    private Boolean isActive;

    // Konstruktori dhe inicializimi
    public User(int id, String email, String password, Boolean isActive) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    // Get and Set
    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "ID:" + id + " Email:" + email + " Password: " + password + " Is Active: " + isActive;
    }

}