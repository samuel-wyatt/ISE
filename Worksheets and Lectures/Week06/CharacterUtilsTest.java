import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class CharacterUtilsTest {
    @Test
    public static void testCharCase() {
        assertTrue("true, A", CharacterUtils.charCase(true, 'A'));
        assertFalse("true, a", CharacterUtils.charCase(true, 'a'));

        assertTrue("false, b", CharacterUtils.charCase(false, 'b'));
        assertFalse("false, B", CharacterUtils.charCase(false, 'B'));

        assertFalse("true, -", CharacterUtils.charCase(true, '-'));
        assertFalse("false, /", CharacterUtils.charCase(false, '/'));
    }

    @Test
    public static void testSubstr() {
        assertTrue("abc + abc", "abc".equals(CharacterUtils.substr("abc", "abc")));
        assertTrue("abc + ab", "ab".equals(CharacterUtils.substr("abc", "ab")));
        assertTrue("abc + abcd", "abc".equals(CharacterUtils.substr("abc", "abcd")));
        assertTrue("hello + goodbye", "hello".equals(CharacterUtils.substr("hello", "goodbye")));
    }
}