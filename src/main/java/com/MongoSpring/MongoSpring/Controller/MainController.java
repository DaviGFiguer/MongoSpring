package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.Student;
import com.MongoSpring.MongoSpring.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // defining our API parts
public class MainController {

@Autowired    //Acts as a dependency injection
StudentRepo studentRepo;//Repository is used to store or insert or fetch data form our mongodbcompass

    @PostMapping("/addStudent") //Here is posting data
    public void addStudent(@RequestBody Student student) { //will pick the Student body to make the request
        studentRepo.save(student);

    }

}
