package com.MongoSpring.MongoSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //indication that we give to Spring boot that his is going to be our document or tablename in our mongodb compass
@Data //Lombok and reduces the use of having Getters Setters Constructors initializing etc..
@NoArgsConstructor  //
@AllArgsConstructor // basically for initializing this value
public class Student {

    @Id // primary key
    private Integer rno;

    private String name;

    private String address;

    public Integer getRno() {
        return this.rno;
    }
    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
