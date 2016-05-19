package com.deivydas.voroneckis.domain;

import com.deivydas.voroneckis.domain.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-17T22:03:08")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> country;
    public static volatile SingularAttribute<Student, String> gender;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile SingularAttribute<Student, String> university;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> age;
    public static volatile SingularAttribute<Student, Room> room;

}