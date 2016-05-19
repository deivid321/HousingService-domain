/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.service;

import com.deivydas.voroneckis.database.DatabaseException;
import com.deivydas.voroneckis.domain.DomainException;
import com.deivydas.voroneckis.database.RoomMemoryDatabase;
import com.deivydas.voroneckis.database.IStudentDatabase;
import com.deivydas.voroneckis.database.SqlRoomDatabase;
import com.deivydas.voroneckis.database.SqlStudentDatabase;
import com.deivydas.voroneckis.database.StudentMemoryDatabase;
import com.deivydas.voroneckis.database.IRoomDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vdeiv
 */
public class HouseFactory {
    
   private static IRoomDatabase houseDatabase;
   
   public HouseFactory(String databaseType){
       try {
           switch (databaseType) {
               case "JSP":
                   houseDatabase = new SqlRoomDatabase("HousingPU");
                   break;
               case "FAKE":
                   houseDatabase = new RoomMemoryDatabase();
                   break;
               default: throw new DomainException("The database type was not recognized");
           }
       } catch (DatabaseException ex) {
           Logger.getLogger(HouseFactory.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
  public IRoomDatabase getHouseDatabase(){
      return houseDatabase;
  }
  
}
