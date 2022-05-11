import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class HealthCalcTest {
    @Test
    public void testUVRatingEqu() {
        assertTrue("-1 - invalid", "-".equals(HealthCalc.uvRating(-1)));
        assertTrue("2 - low", "low".equals(HealthCalc.uvRating(2)));
        assertTrue("4 - moderate", "moderate".equals(HealthCalc.uvRating(4)));
        assertTrue("6 - high", "high".equals(HealthCalc.uvRating(6)));
        assertTrue("8 - very high", "very high".equals(HealthCalc.uvRating(8)));
        assertTrue("11 - extreme", "extreme".equals(HealthCalc.uvRating(11)));
    }
    @Test
    public void testUVRatingBva() {
        assertTrue("invalid - low", "-".equals(HealthCalc.uvRating(-1)));
        assertTrue("invalid - low", "low".equals(HealthCalc.uvRating(0)));

        assertTrue("low - moderate", "low".equals(HealthCalc.uvRating(2)));
        assertTrue("low - moderate", "moderate".equals(HealthCalc.uvRating(3)));

        assertTrue("moderate - high", "moderate".equals(HealthCalc.uvRating(5)));
        assertTrue("moderate - high", "high".equals(HealthCalc.uvRating(6)));

        assertTrue("high - very high", "high".equals(HealthCalc.uvRating(7)));
        assertTrue("high - very high", "very high".equals(HealthCalc.uvRating(8)));

        assertTrue("very high - extreme", "very high".equals(HealthCalc.uvRating(10)));
        assertTrue("very high - extreme", "extreme".equals(HealthCalc.uvRating(11)));
    }
}