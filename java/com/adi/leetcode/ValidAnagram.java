package com.adi.leetcode;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            addToMap(mapS, s.charAt(i));
            addToMap(mapT, t.charAt(i));
        }

        return mapS.equals(mapT);

    }

    public void addToMap(Map<Character, Integer> map, char c) {
        if (map.get(c) == null) {
            map.put(c, 1);
        } else {
            map.put(c, (map.get(c)+ 1));
        }
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("vancarb", "caravan"));
    }
}


