package com.leetcode.practice.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.leetcode.practice.Problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1Test {

    @DisplayName("Problem1Test.testInput1()")
    @Test
    void testInput1() {
    	System.out.println("This test method should be run");
    	int[] nums = {3,2,4};
		int target = 6;
		int[] result = Problem1.twoSum(nums,target);
        assertEquals(nums[result[0]]+nums[result[1]], target);
    }

}
