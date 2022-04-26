public class HealthCalcTest {
    public static void main(String args[]) {
        testUVRatingEqu();
        testUVRatingBva();
    }

    public static void testUVRatingEqu() {
        assert "-".equals(HealthCalc.uvRating(-1)) : "-1 - invalid";
        assert "low".equals(HealthCalc.uvRating(2)) : "2 - low";
        assert "moderate".equals(HealthCalc.uvRating(4)) : "4 - moderate";
        assert "high".equals(HealthCalc.uvRating(6)) : "6 - high";
        assert "very high".equals(HealthCalc.uvRating(8)) : "8 - very high";
        assert "extreme".equals(HealthCalc.uvRating(11)) : "11 - extreme";
    }

    public static void testUVRatingBva() {
        assert "-".equals(HealthCalc.uvRating(-1)) : "invalid - low";
        assert "low".equals(HealthCalc.uvRating(0)) : "invalid - low";
        
        assert "low".equals(HealthCalc.uvRating(2)) : "low - moderate";
        assert "moderate".equals(HealthCalc.uvRating(3)) : "low - moderate";

        assert "moderate".equals(HealthCalc.uvRating(5)) : "moderate - high";
        assert "high".equals(HealthCalc.uvRating(6)) : "moderate - high";

        assert "high".equals(HealthCalc.uvRating(7)) : "high - very high";
        assert "very high".equals(HealthCalc.uvRating(8)) : "high - very high";

        assert "very high".equals(HealthCalc.uvRating(10)) : "very high - extreme";
        assert "extreme".equals(HealthCalc.uvRating(11)) : "very high - extreme";
    }
}