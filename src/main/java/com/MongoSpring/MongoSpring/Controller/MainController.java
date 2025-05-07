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

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id) { //will pick the Student body to make the request
        return studentRepo.findById(id).orElse(null);

    }

    @GetMapping("/fetchStudents")
    public List<Student> fetchStudents() { //will pick the Student body to make the request
        return studentRepo.findAll();

    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentRepo.deleteById(id);
    }

    @PutMapping("/updateStudent") //Here is posting data
    public void updateStudent(@RequestBody Student student) { //will pick the Student body to make the request
        Student data = studentRepo.findById(student.getRno()).orElse(null);

        if(data != null) {
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentRepo.save(data);
        }
    }


}
