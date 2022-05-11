import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class HouseCalcTest {
    @Test
    public void testRoomVolumeEqu() {
        assertEquals("W=2, L=3, H=5", 30, HouseCalc.roomVolume(2, 3, 5));
        assertEquals("W=1, L=3, H=5", 0, HouseCalc.roomVolume(1, 3, 5));
        assertEquals("W=1, L=1, H=5", 0, HouseCalc.roomVolume(1, 1, 5));
        assertEquals("W=1, L=1, H=1", 0, HouseCalc.roomVolume(1, 1, 1));
        assertEquals("W=2, L=1, H=5", 0, HouseCalc.roomVolume(2, 1, 5));
        assertEquals("W=2, L=1, H=1", 0, HouseCalc.roomVolume(2, 1, 1));
        assertEquals("W=2, L=3, H=1", 0, HouseCalc.roomVolume(2, 3, 1));
    }
    @Test
    public void testRoomVolumeBva() {
        assertEquals("W = 1.9", 0, HouseCalc.roomVolume(1.9, 10, 10));
        assertEquals("W = 2", 200, HouseCalc.roomVolume(2, 10, 10));

        assertEquals("L = 2.4", 0, HouseCalc.roomVolume(10, 2.4, 10));
        assertEquals("L = 2.5", 250, HouseCalc.roomVolume(10, 2.5, 10));
    
        assertEquals("H = 2.9", 0, HouseCalc.roomVolume(10, 10, 2.9));
        assertEquals("H = 3", 300, HouseCalc.roomVolume(10, 10, 3));
    }
}