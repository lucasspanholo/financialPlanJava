package financial.by.com.financialby.user;

import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.UUID;


public class UserData {


    @Id
    private UUID id;
    private String name;
    private String email;
    private String password;

//CONSTRUTOR
    public UserData(UUID id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}