package com.TestProject.Controller;

import com.TestProject.model.Login;
import com.TestProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LoginController {


    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/students/emailPassword")
    public List<Object> getEmailPassword(){
        List<Object> emailPassword = studentRepository.getEmailAndPassword();
        return emailPassword;
    }


    @PostMapping ("/login/{email}/{password}")
    public void login(@PathVariable("email")String email, @PathVariable("password") String password){
        Login login = new Login(email, password);
        List<Object> getemailStudent = new ArrayList<>();
        getemailStudent = studentRepository.getEmailAndPassword();
        for(Object s:getemailStudent){
            if(login.equals(s)){
                System.out.println("Login Successfull");
            }else

                System.out.println("Login Not successfull");
        }
    }
}
