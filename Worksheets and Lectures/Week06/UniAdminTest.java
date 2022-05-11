import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class UniAdminTest {
    @Test
    public void testCalcGradeEqu() {
        assertEquals("n < 0", "", UniAdmin.calcGrade(-10));
        assertEquals("n < 50", "F", UniAdmin.calcGrade(45));
        assertEquals("50-59", "5", UniAdmin.calcGrade(55));
        assertEquals("60-69", "6", UniAdmin.calcGrade(65));
        assertEquals("70-79", "7", UniAdmin.calcGrade(75));
        assertEquals("80-89", "8", UniAdmin.calcGrade(85));
        assertEquals("90-99", "9", UniAdmin.calcGrade(95));
        assertEquals("100", "10", UniAdmin.calcGrade(100));
    }
    @Test
    public void testCalcGradeBva() {
        assertEquals("n < 0", "", UniAdmin.calcGrade(-1));
        assertEquals("n = 0", "F", UniAdmin.calcGrade(0));

        assertEquals("n < 50", "F", UniAdmin.calcGrade(49));
        assertEquals("n = 50", "5", UniAdmin.calcGrade(50));

        assertEquals("n < 60", "5", UniAdmin.calcGrade(59));
        assertEquals("n = 60", "6", UniAdmin.calcGrade(60));

        assertEquals("n < 70", "6", UniAdmin.calcGrade(69));
        assertEquals("n = 70", "7", UniAdmin.calcGrade(70));

        assertEquals("n < 80", "7", UniAdmin.calcGrade(79));
        assertEquals("n = 80", "8", UniAdmin.calcGrade(80));
        
        assertEquals("n < 90", "8", UniAdmin.calcGrade(89));
        assertEquals("n = 90", "9", UniAdmin.calcGrade(90));

        assertEquals("n < 100", "9", UniAdmin.calcGrade(99));
        assertEquals("n = 100", "10", UniAdmin.calcGrade(100)); 
    }
}