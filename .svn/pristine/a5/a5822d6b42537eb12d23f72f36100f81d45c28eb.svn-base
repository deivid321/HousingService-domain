/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.deivydas.voroneckis.domain.Neighborhood;
import com.deivydas.voroneckis.domain.Room;
import com.deivydas.voroneckis.domain.Student;
import com.deivydas.voroneckis.service.HousingFacade;
import com.deivydas.voroneckis.service.IHousingFacade;
import java.util.ArrayList;

/**
 *
 * @author vdeiv
 */
public class TestFacade {

    public static void main(String[] args) {//TODO Exceptions
        Room room = new Room();
        IHousingFacade facade = new HousingFacade("JSP");

        //facade.addRoom(room);
        Student student = new Student();
        student.setName("Vardenis");
        //facade.addStudent(student);
        facade.addRoom(room);
        facade.addStudent(student);
        room.setNeighborhood(Neighborhood.EAST);
        room.settleNewStudent(student);
        facade.updateRoom(room);
        facade.updateStudent(student);
        

        //Room room2 = new Room();
        //facade.updateRoom(room);
        //ArrayList<Room> roomList = (ArrayList<Room>) facade.getRoomsList();
        //facade.removeRoom(room);
        //facade.updateStudent(student);
        //  System.out.print(facade.getRoomsList());
    }
}
