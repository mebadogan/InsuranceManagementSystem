import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {
    String name;
    String surname;
    String email;
    String password;
    String occupation;
    int age;
    ArrayList<Address> addressList;
    Date lastLogin;

    public User(String name, String surname, String email, String password, String occupation, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastLogin() {
        return lastLogin.toString();
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = Date.from(Instant.now());
    }
}
