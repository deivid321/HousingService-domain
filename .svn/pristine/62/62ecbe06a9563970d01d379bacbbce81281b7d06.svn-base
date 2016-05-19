/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.database;

import com.deivydas.voroneckis.database.IStudentDatabase;
import com.deivydas.voroneckis.domain.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author vdeiv
 */
public class StudentMemoryDatabase implements IStudentDatabase {

    private static Map<Long, Student> studentMap = new HashMap<Long, Student>();
    long idNumber = 0;

    @Override
    public List<Student> read() {
        return new ArrayList(studentMap.values());
    }

    @Override
    public void add(Student student) {
        studentMap.put(idNumber, student);
        student.setId(idNumber);
        idNumber++;
    }

    @Override
    public void delete(long id) {
        studentMap.remove(id);
    }

    @Override
    public void update(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
