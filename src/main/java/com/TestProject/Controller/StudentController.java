package com.TestProject.Controller;

import com.TestProject.Model.Address;
import com.TestProject.Model.ResponseMessage;
import com.TestProject.Model.Student;
import com.TestProject.Repository.AddressRepository;
import com.TestProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;


    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        System.out.println("Heloooooooooooooo");
        studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List studentList = new ArrayList();
       studentList =  studentRepository.findAll();
       return studentList;
    }



    @DeleteMapping("/student/{id}")
    ResponseEntity<ResponseMessage> deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Success Delete"));
    }

    @GetMapping("/student/{firstname}")
    public List<Student> getByFirstNam(@PathVariable("firstname") String firstname){
return studentRepository.getAllByFirstName(firstname);
    }

    @GetMapping("/student2/{lastname}")
    public List<Student> getByLastNam(@PathVariable("lastname") String firstname){
        return studentRepository.getByLastName(firstname);
    }

    @GetMapping("/student/{firstname}/{lastname}")
    public List<Student> findByIndex(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname){
        return studentRepository.findByIndex(firstname, lastname);
    }

    @GetMapping("/studentMail/{email}")
    ResponseEntity<String> checkByMail(@PathVariable("email") String email){
       boolean check = studentRepository.isExistByEmail(email);
      if (check) {
          return  ResponseEntity.ok("Student with email '" + email + "' Exists");
      }
      else {
          return ResponseEntity.notFound().build();
      }

    }
}

