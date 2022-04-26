public class UniAdminTest {
    public static void main(String args[]) {
        testCalcGradeEqu();
        testCalcGradeBva();
    }

    public static void testCalcGradeEqu() {
        assert "".equals(UniAdmin.calcGrade(-10)) : "n < 0";

        assert "F".equals(UniAdmin.calcGrade(45)) : "n < 50";

        assert "5".equals(UniAdmin.calcGrade(55)) : "50-59";

        assert "6".equals(UniAdmin.calcGrade(65)) : "60-69";
        
        assert "7".equals(UniAdmin.calcGrade(75)) : "70-79";
        
        assert "8".equals(UniAdmin.calcGrade(85)) : "80-89";

        assert "9".equals(UniAdmin.calcGrade(95)) : "90-99";

        assert "10".equals(UniAdmin.calcGrade(100)) : "n = 100";
    }

    public static void testCalcGradeBva() {
        assert "".equals(UniAdmin.calcGrade(-1)) : "n < 0";
        assert "F".equals(UniAdmin.calcGrade(0)) : "n = 0";

        assert "F".equals(UniAdmin.calcGrade(49)) : "n < 50";
        assert "5".equals(UniAdmin.calcGrade(50)) : "n = 50";

        assert "5".equals(UniAdmin.calcGrade(59)) : "n < 60";
        assert "6".equals(UniAdmin.calcGrade(60)) : "n = 60";
        
        assert "6".equals(UniAdmin.calcGrade(69)) : "n < 70";
        assert "7".equals( UniAdmin.calcGrade(70)) : "n = 70";
        
        assert "7".equals(UniAdmin.calcGrade(79)) : "n < 80";
        assert "8".equals(UniAdmin.calcGrade(80)) : "n = 80";
        
        assert "8".equals(UniAdmin.calcGrade(89)) : "n < 90";
        assert "9".equals(UniAdmin.calcGrade(90)) : "n = 90";
        
        assert "9".equals(UniAdmin.calcGrade(99)) : "n < 100";
        assert "10".equals(UniAdmin.calcGrade(100)) : "n = 100";   
    }
}
