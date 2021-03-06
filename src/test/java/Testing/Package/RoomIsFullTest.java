/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Package;

import com.deivydas.voroneckis.service.HousingFacade;
import com.deivydas.voroneckis.domain.Room;
import com.deivydas.voroneckis.domain.Student;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author vdeiv
 */
@RunWith(Parameterized.class)
public class RoomIsFullTest {
    static int counter = 0;
    static HousingFacade housingService;
    static Room room;
    Student student;
    Boolean result;

    @BeforeClass
    public static void initialize() {
        housingService = new HousingFacade("FAKE");
        room = new Room();
        housingService.addRoom(room);
        room.setMaxStudents(5);
        housingService.updateRoom(room); //Not neccessary now.
    }

    public RoomIsFullTest(Student student, Boolean expectedResult) {
        this.student = student;
        this.result = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection students() {
        return Arrays.asList(new Object[][]{
            {new Student(), false},
            {new Student(), false},
            {new Student(), false},
            {new Student(), false},
            {new Student(), true}
        });
    }
    
    @Test
   public void testStudentSettlement() {
      System.out.println("Student number: " + counter);
      counter++;
      housingService.addStudent(this.student);
      housingService.addStudentToRoom(room.getId(), student.getId());
      System.out.println("Room free space: " + room.getFreeSpace());
      assertEquals(result, room.getFreeSpace()==0);
   }

}
