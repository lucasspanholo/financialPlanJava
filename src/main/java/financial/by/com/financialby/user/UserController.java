package financial.by.com.financialby.user;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/{id}")
    public UserData buscarUser(UUID id){
        return new UserData(id,"lucas","lucas@mail.com");
    }
}
