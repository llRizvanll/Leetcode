package leetjava;

import java.util.HashSet;

/*
    Contains Duplicate
    https://leetcode.com/problems/contains-duplicate/
    **
        Given an array of integers, find if the array contains any duplicates.

        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

        Example 1:

        Input: [1,2,3,1]
        Output: true
        Example 2:

        Input: [1,2,3,4]
        Output: false
        Example 3:

        Input: [1,1,1,3,3,4,3,2,4,2]
        Output: true
    **
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num :
                nums) {
            if (set.contains(num))  return true;
            else
                set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
