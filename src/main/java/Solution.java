import java.util.HashMap;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int maxLen = 0, start = 0, sLen = s.length();
    HashMap<Character, Integer> hitMap = new HashMap<>();
    for (int end = 0; end < sLen; end++) {
      char ch = s.charAt(end);
      if (hitMap.containsKey(ch) && hitMap.get(ch) >= start) {
        start = hitMap.get(ch) + 1;
      }
      hitMap.put(ch, end);
      maxLen = Math.max(maxLen, end - start + 1);
      if (start + maxLen >= sLen) {
        break;
      }
    }
    return maxLen;
  }
}
