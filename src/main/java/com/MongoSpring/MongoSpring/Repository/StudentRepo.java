package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
                                                    //Type - primary key type
public interface StudentRepo extends MongoRepository<Student, Integer> {
}
