package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 冒泡排序单元测试
 */
class BubbleSortTest {

    @Test
    void testNormalArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {5, 3, 8, 3, 9, 1, 5};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 8, 9}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
    }

    @Test
    void testNullArray() {
        BubbleSort.sort(null);
        // 不应抛出异常
    }

    @Test
    void testTwoElements() {
        int[] arr = {2, 1};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    void testAllSameValues() {
        int[] arr = {7, 7, 7, 7, 7};
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr);
    }

    @Test
    void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 1000 - i;
        }
        BubbleSort.sort(arr);
        assertTrue(BubbleSort.isSorted(arr));
        assertEquals(1, arr[0]);
        assertEquals(1000, arr[999]);
    }
}
