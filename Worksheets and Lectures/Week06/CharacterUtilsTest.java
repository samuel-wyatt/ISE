public class CharacterUtilsTest {
    public static void main(String args[]) {
        testCharCase();
        testSubstr();
    }

    public static void testCharCase() {
        assert true == CharacterUtils.charCase(true, 'A');
        assert false == CharacterUtils.charCase(true, 'a');

        assert false == CharacterUtils.charCase(false, 'B');
        assert true == CharacterUtils.charCase(false, 'b');

        assert false == CharacterUtils.charCase(true, '-');
        assert false == CharacterUtils.charCase(false, '/');
    }

    public static void testSubstr() {
        assert "abc".equals(CharacterUtils.substr("abc", "abc")) : "abc + abc";
        assert "ab".equals(CharacterUtils.substr("abc", "ab")) : "abc + ab";
        assert "abc".equals(CharacterUtils.substr("abc", "abcd")) : "abc + abcd";
        assert "".equals(CharacterUtils.substr("hello", "goodbye")) : "hello + goodbye";
    }
}