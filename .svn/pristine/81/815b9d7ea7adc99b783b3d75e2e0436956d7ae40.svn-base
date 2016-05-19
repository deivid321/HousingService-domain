package Testing.Package;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.deivydas.voroneckis.database.IRoomDatabase;
import com.deivydas.voroneckis.database.RoomMemoryDatabase;
import com.deivydas.voroneckis.domain.Student;
import com.deivydas.voroneckis.domain.NegativeOrNullNumberException;
import com.deivydas.voroneckis.domain.Room;
import com.deivydas.voroneckis.service.HousingFacade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.then;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 *
 * @author vdeiv
 */
public class HousingFacadeMockTest {

    private Room room;
    private Student student;
    private HousingFacade housingFacade;

    @Mock
    private IRoomDatabase roomsDao;
    
    @Before
    public void setUp() {
        System.out.println("The tests are starting");
        initMocks(this);
        housingFacade = new HousingFacade("FAKE");
        housingFacade.setHouseDatabase(roomsDao);
        room = new Room();
        housingFacade.addRoom(room);
        when(roomsDao.getRoomById(0)).thenReturn(room);
        student = new Student();
        housingFacade.addStudent(student);
    }
    
    @Test
    public void getRoom_RoomGotCorrectly(){
        //when(roomsDao.getRoomById(0)).thenReturn(room); //TODO: Why it's not working without this?
        //assertEquals(room, roomsDao.getRoomById(0));
        Room room = housingFacade.getRoom(0);
        verify(roomsDao).getRoomById(0);
    }
    
    @Test
    public void addRoom_RoomAddedCorrectly() throws NegativeOrNullNumberException{
        //when(roomsDao.update(room));
        //room = housingFacade.getRoomsList().get(0);
        //room.setNumberOfMaxStudents(3);
        housingFacade.addRoom(new Room());
        //then(roomsDao).should().update(room);
        verify(roomsDao).add(room);
    }
    /*
    @Test
    public void updateRoom_RoomUpdatedCorrectly() throws NegativeOrNullNumberException{
        //when(roomsDao.update(room));
        //Room room = housingFacade.getRoomsList().get(0);
        //room.setNumberOfMaxStudents(3);
        housingFacade.updateRoom(this.room);
        //then(roomsDao).should().update(room);
        verify(roomsDao).update(room);
    }
    */
}
