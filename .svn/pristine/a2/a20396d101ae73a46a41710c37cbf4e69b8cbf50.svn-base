package com.deivydas.voroneckis.domain;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vdeiv
 */
@Entity
public class Student extends com.deivydas.voroneckis.domain.Entity {
    @NotNull
    @Size(min=1,max=20)
    private String name;
    @NotNull
    @Size(min=1, max=20)
    private String surname;
    @NotNull
    @Min(1) @Max(130)
    private int age;
    @NotNull @Size(min=1,max=50)
    private String university;
    @NotNull
    @Size(min=1,max=30)
    private String country;
    @NotNull @Size(min=1,max=1)
    private String gender="M";
    
    @ManyToOne
    private Room room;
    
    public void setRoom(Room room){
        this.room = room;
    }
    public Room getRoom(){
        return room;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public boolean equals(Student object) {
        if (this.getId() != null)
            return this.getId().equals(object.getId());
        else return false;
  }
    
}
