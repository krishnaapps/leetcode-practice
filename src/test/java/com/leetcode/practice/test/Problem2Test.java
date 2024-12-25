package com.leetcode.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.leetcode.practice.Problem2;

public class Problem2Test {

    @DisplayName("Problem2Test.testInput1()")
    @Test
    void testInput1() {
    	int[] nums = {2,3,4};
		int target = 6;
		int[] result = Problem2.twoSum(nums,target);
        assertEquals(nums[result[0]]+nums[result[1]], target);
    }
    
    @DisplayName("Problem2Test.testInput2()")
    @Test
    void testInput2() {
    	int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = Problem2.twoSum(nums,target);
        assertEquals(nums[result[0]]+nums[result[1]], target);
    }
    
    @DisplayName("Problem2Test.testInput3()")
    @Test
    void testInput3() {
    	int[] nums = {-1,0};
		int target = -1;
		int[] result = Problem2.twoSum(nums,target);
        assertEquals(nums[result[0]]+nums[result[1]], target);
    }
    

}
