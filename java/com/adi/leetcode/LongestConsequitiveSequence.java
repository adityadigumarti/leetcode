package com.adi.leetcode;

import java.util.HashSet;
import java.util.Set;
 
 class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        int maxSequence = 0;
        int currSequence = 0;
        int temp = 0;

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            currSequence = 1;
            if (!numSet.contains(num -1)) {
                temp = num + 1;
                while(numSet.contains(temp)) {
                    currSequence++;
                    temp++;

                }  
            }

            if (maxSequence < currSequence) {
                maxSequence = currSequence;
            }
        }

        return maxSequence;
        
    }

    public static void main(String[] args) {
        longestConsecutiveSequence solution = new longestConsecutiveSequence();
        System.out.println(solution.longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
