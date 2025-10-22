package com.adi.leetcode;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateChecker = new HashSet<>();

        for (int num: nums) {
            System.out.println(num);
            if (!duplicateChecker.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println(solution.hasDuplicate(new int[]{1,2,3,1}));
        System.out.println(solution.hasDuplicate(new int[]{1,2,3,4}));
        System.out.println(solution.hasDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}