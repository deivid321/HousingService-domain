/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.service;

import com.deivydas.voroneckis.domain.Room;
import com.deivydas.voroneckis.domain.Student;
import java.util.List;

/**
 *
 * @author vdeiv
 */
public interface IHousingFacade {

    void addRoom(Room room);

    void addStudent(Student student);

    void addStudentToRoom(long roomId, long studentId);

    Room getRoom(long id);

    List<Room> getRoomsList();

    Student getStudent(long id);

    List<Student> getStudentsList();

    boolean isRoomFree(long roomId);

    int numberOfFreeSpace(long roomId);

    void removeRoom(Room room);

    void removeStudent(Student student);

    void unSettleStudentFromRoom(long roomId, long studentId);

    void updateRoom(Room room);

    void updateStudent(Student student);
    
}
