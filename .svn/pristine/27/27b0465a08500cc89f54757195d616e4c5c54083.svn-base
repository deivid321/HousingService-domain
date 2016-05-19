package com.deivydas.voroneckis.database;

import com.deivydas.voroneckis.domain.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vdeiv
 */
public interface IRoomDatabase {
   List<Room> read() throws DatabaseException;
   void add(Room room) throws DatabaseException;
   void delete(long id) throws DatabaseException;
   void update(Room room) throws DatabaseException;
   Room getRoomById(long id);
   void closeConnection() throws DatabaseException;
}
