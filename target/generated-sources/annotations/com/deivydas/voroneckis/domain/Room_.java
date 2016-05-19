package com.deivydas.voroneckis.domain;

import com.deivydas.voroneckis.domain.Neighborhood;
import com.deivydas.voroneckis.domain.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-17T22:03:08")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, Integer> area;
    public static volatile SingularAttribute<Room, Integer> roomNumber;
    public static volatile SingularAttribute<Room, Float> lng;
    public static volatile SingularAttribute<Room, String> street;
    public static volatile ListAttribute<Room, Student> studentList;
    public static volatile SingularAttribute<Room, Integer> houseNumber;
    public static volatile SingularAttribute<Room, Integer> maxStudents;
    public static volatile SingularAttribute<Room, String> fullName;
    public static volatile SingularAttribute<Room, Neighborhood> neighborhood;
    public static volatile SingularAttribute<Room, Boolean> free;
    public static volatile SingularAttribute<Room, Float> lat;

}