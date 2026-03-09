package com.leetcode.practice;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Problem22Test {

    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    private void captureOutput() {
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    private void restoreOutput() {
        System.setOut(originalOut);
    }

    private String getOutput() {
        return outContent.toString().trim();
    }

    @Test
    public void testSingleSubarrayWithSum() {
        captureOutput();
        Problem22.function(new int[]{1, 7, 3, 9}, 10);
        restoreOutput();
        String output = getOutput();
        assertEquals("7 3", output);
    }

    @Test
    public void testMultipleSubarraysWithSum() {
        captureOutput();
        Problem22.function(new int[]{1, 2, 3, 4, 5}, 5);
        restoreOutput();
        String output = getOutput();
        assertTrue(output.contains("2 3") || output.contains("5"));
    }

    @Test
    public void testNoSubarrayWithSum() {
        captureOutput();
        Problem22.function(new int[]{1, 2, 3}, 20);
        restoreOutput();
        String output = getOutput();
        assertEquals("", output);
    }

    @Test
    public void testEntireArrayAsSubarray() {
        captureOutput();
        Problem22.function(new int[]{1, 2, 3, 4}, 10);
        restoreOutput();
        String output = getOutput();
        assertEquals("1 2 3 4", output);
    }

    @Test
    public void testSingleElementArray() {
        captureOutput();
        Problem22.function(new int[]{5}, 5);
        restoreOutput();
        String output = getOutput();
        assertEquals("5", output);
    }

    @Test
    public void testSingleElementNoMatch() {
        captureOutput();
        Problem22.function(new int[]{5}, 10);
        restoreOutput();
        String output = getOutput();
        assertEquals("", output);
    }

    @Test
    public void testAllElementsMatch() {
        captureOutput();
        Problem22.function(new int[]{1, 1, 1, 1}, 2);
        restoreOutput();
        String output = getOutput();
        assertFalse(output.isEmpty());
    }

    @Test
    public void testZeroAsTarget() {
        captureOutput();
        Problem22.function(new int[]{1, 2, 3}, 0);
        restoreOutput();
        String output = getOutput();
        assertEquals("", output);
    }

    @Test
    public void testLargeNumbers() {
        captureOutput();
        Problem22.function(new int[]{100, 200, 300, 400}, 500);
        restoreOutput();
        String output = getOutput();
        assertEquals("100 200 200", output.contains("100") ? output : "");
    }

    @Test
    public void testConsecutiveSums() {
        captureOutput();
        Problem22.function(new int[]{2, 2, 2, 2}, 4);
        restoreOutput();
        String output = getOutput();
        assertFalse(output.isEmpty());
    }

}