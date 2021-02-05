package jtraining.common.collections;

public class Payload {
    private String email;
    private String password;

    public Payload() {
        email = "";
        password = "";
    }

    public Payload(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format("{Email: %s, Password: %s}", email, password);
    }
}
