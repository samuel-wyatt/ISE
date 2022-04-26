public class HouseCalcTest {
    public static void main(String args[]) {
        testRoomVolumeEqu();
        testRoomVolumeBva();
    }

    public static void testRoomVolumeEqu() {
        assert 30 == HouseCalc.roomVolume(2, 3, 5) : "W=2, L=3, H=5";
        assert 0 == HouseCalc.roomVolume(1, 3, 5) : "W=1, L=3, H=5";
        assert 0 == HouseCalc.roomVolume(1, 1, 5) : "W=1, L=1, H=5";
        assert 0 == HouseCalc.roomVolume(1, 1, 1) : "W=1, L=1, H=1";
        assert 0 == HouseCalc.roomVolume(2, 1, 5) : "W=2, L=1, H=5";
        assert 0 == HouseCalc.roomVolume(2, 1, 1) : "W=2, L=1, H=1";
        assert 0 == HouseCalc.roomVolume(2, 3, 1) : "W=2, L=3, H=1";
    }

    public static void testRoomVolumeBva() {
        assert 0 == HouseCalc.roomVolume(1.9, 10, 10) : "W=1.9" ;
        assert 200 == HouseCalc.roomVolume(2, 10, 10) : "W=2";

        assert 0 == HouseCalc.roomVolume(10, 2.4, 10) : "L=2.4";
        assert 250 == HouseCalc.roomVolume(10, 2.5, 10) : "L=2.5";
    
        assert 0 == HouseCalc.roomVolume(10, 10, 2.9) : "H=2.9";
        assert 300 == HouseCalc.roomVolume(10, 10, 3) : "H=3";
    }
}