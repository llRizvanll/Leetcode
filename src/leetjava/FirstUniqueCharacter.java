package leetjava;

import java.util.HashMap;

/*

First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

https://leetcode.com/problems/first-unique-character-in-a-string/

 */
public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!map.containsKey(letter)){
                map.put(letter,i);
            }
            else
                map.put(letter,-1);
        }

        int min = Integer.MAX_VALUE;
        for (char c : map.keySet()){
            if (map.get(c) > -1 && map.get(c) < min){
                min = map.get(c);
            }
        }


        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {

    }
}
