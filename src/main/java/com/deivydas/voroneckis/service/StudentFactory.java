/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.service;

import com.deivydas.voroneckis.database.DatabaseException;
import com.deivydas.voroneckis.database.IRoomDatabase;
import com.deivydas.voroneckis.database.IStudentDatabase;
import com.deivydas.voroneckis.database.RoomMemoryDatabase;
import com.deivydas.voroneckis.database.SqlRoomDatabase;
import com.deivydas.voroneckis.database.SqlStudentDatabase;
import com.deivydas.voroneckis.database.StudentMemoryDatabase;
import com.deivydas.voroneckis.domain.DomainException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vdeiv
 */
public class StudentFactory {

    private static IStudentDatabase studentDatabase;

    public StudentFactory(String databaseType) {
        try {
            switch (databaseType) {
                case "JSP":
                    studentDatabase = new SqlStudentDatabase("HousingPU");
                    break;
                case "FAKE":
                    studentDatabase = new StudentMemoryDatabase();
                    break;
                default:
                    throw new DomainException("The database type was not recognized");
            }
        } catch (DatabaseException ex) {
            Logger.getLogger(HouseFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public IStudentDatabase getStudentDatabase() {
        return studentDatabase;
    }
}
