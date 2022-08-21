import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void lengthOfLongestSubstringExample1() {
    assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb"));
  }
  @Test
  void lengthOfLongestSubstringExample2() {
    assertEquals(1, sol.lengthOfLongestSubstring("bbbbb"));
  }
  @Test
  void lengthOfLongestSubstringExample3() {
    assertEquals(3, sol.lengthOfLongestSubstring("pwwkew"));
  }
}