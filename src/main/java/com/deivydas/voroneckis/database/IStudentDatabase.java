/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.database;

import com.deivydas.voroneckis.domain.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vdeiv
 */
public interface IStudentDatabase {
   List<Student> read() throws DatabaseException;
   void add(Student student) throws DatabaseException;
   void delete(long id) throws DatabaseException;
   void update(Student student) throws DatabaseException;
   Student getStudentById(long id);
   void closeConnection() throws DatabaseException;
}
