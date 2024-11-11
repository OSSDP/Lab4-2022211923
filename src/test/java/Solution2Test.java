import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {
    Solution2 solution2 = new Solution2();

    @Test
    public void test1() {
        String s = "";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("", result);
    }

    @Test
    public void test2() {
        String s = "a";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("a", result);
    }

    @Test
    public void test3() {
        String s = "aaaaaaaa";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("a", result);
    }

    @Test
    public void test4() {
        String s = "absdrf";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("absdrf", result);
    }

    @Test
    public void test5() {
        String s = "aaghayby";
        String result = solution2.removeDuplicateLetters(s);
        assertEquals("aghby", result);
    }
}