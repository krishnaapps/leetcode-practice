package com.leetcode.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem1Test {

    @Test
    public void testTwoSum_BasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problem1.twoSum(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum_DuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = Problem1.twoSum(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum_LargerArray() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = Problem1.twoSum(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

    @Test
    public void testTwoSum_NoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = Problem1.twoSum(nums, target);
        assertNull(result);
    }

    @Test
    public void testTwoSum1_BasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problem1.twoSum1(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum1_DuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = Problem1.twoSum1(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum1_LargerArray() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = Problem1.twoSum1(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

    @Test
    public void testTwoSum1_NoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = Problem1.twoSum1(nums, target);
        assertNull(result);
    }

    @Test
    public void testTwoSum2_BasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problem1.twoSum2(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum2_DuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = Problem1.twoSum2(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }

    @Test
    public void testTwoSum2_LargerArray() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = Problem1.twoSum2(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
    }

    @Test
    public void testTwoSum2_NoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = Problem1.twoSum2(nums, target);
        assertNull(result);
    }

    @Test
    public void testTwoSum2_SingleValidPair() {
        int[] nums = {1, 5, 7, 11};
        int target = 12;
        int[] result = Problem1.twoSum2(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertTrue((result[0] == 1 && result[1] == 3) || (result[0] == 3 && result[1] == 1));
    }

    @Test
    public void testTwoSum2_NegativeNumbers() {
        int[] nums = {-1, -2, -3, 5, 10};
        int target = 8;
        int[] result = Problem1.twoSum2(nums, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        int sum = nums[result[0]] + nums[result[1]];
        assertEquals(target, sum);
    }

    @Test
    public void testAllMethodsReturnSameResult() {
        int[] nums = {3, 2, 4};
        int target = 6;
        
        int[] result1 = Problem1.twoSum(nums, target);
        int[] result2 = Problem1.twoSum1(nums, target);
        int[] result2Result = Problem1.twoSum2(nums, target);
        
        // All should find a valid pair
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result2Result);
        
        // All should have length 2
        assertEquals(2, result1.length);
        assertEquals(2, result2.length);
        assertEquals(2, result2Result.length);
        
        // All should sum to target
        assertEquals(target, nums[result1[0]] + nums[result1[1]]);
        assertEquals(target, nums[result2[0]] + nums[result2[1]]);
        assertEquals(target, nums[result2Result[0]] + nums[result2Result[1]]);
    }
}