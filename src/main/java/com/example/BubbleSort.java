package com.example;

/**
 * 冒泡排序算法实现（含优化版本）
 *
 * 时间复杂度：
 *   - 最好情况：O(n) —— 已有序时，一轮扫描后提前退出
 *   - 最坏情况：O(n²) —— 逆序排列
 *   - 平均情况：O(n²)
 *
 * 空间复杂度：O(1) —— 原地排序
 * 稳定性：稳定
 */
public class BubbleSort {

    /**
     * 对整型数组进行升序排序（带 swapped 优化）
     *
     * @param arr 待排序数组
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 每轮结束后，最后 i 个元素已就位，无需再比较
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // 如果本轮没有发生交换，说明数组已有序，提前结束
            if (!swapped) break;
        }
    }

    /**
     * 交换数组中两个元素
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    /**
     * 判断数组是否已按升序排列
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    // ===== 测试方法 =====
    public static void main(String[] args) {
        System.out.println("=== 冒泡排序演示 ===\n");

        // 测试用例 1：正常情况
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("测试 1 - 排序前: ");
        printArray(arr1);
        sort(arr1);
        System.out.println("排序后: ");
        printArray(arr1);
        System.out.println("是否有序: " + isSorted(arr1) + "\n");

        // 测试用例 2：已有序数组
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("测试 2 - 已有序数组: ");
        printArray(arr2);
        sort(arr2);
        System.out.println("排序后: ");
        printArray(arr2);
        System.out.println("是否有序: " + isSorted(arr2) + "\n");

        // 测试用例 3：包含重复元素
        int[] arr3 = {5, 3, 8, 3, 9, 1, 5};
        System.out.println("测试 3 - 含重复元素: ");
        printArray(arr3);
        sort(arr3);
        System.out.println("排序后: ");
        printArray(arr3);
        System.out.println("是否有序: " + isSorted(arr3) + "\n");

        // 测试用例 4：逆序数组
        int[] arr4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("测试 4 - 逆序数组: ");
        printArray(arr4);
        sort(arr4);
        System.out.println("排序后: ");
        printArray(arr4);
        System.out.println("是否有序: " + isSorted(arr4) + "\n");

        // 测试用例 5：单元素数组
        int[] arr5 = {42};
        System.out.println("测试 5 - 单元素数组: ");
        printArray(arr5);
        sort(arr5);
        System.out.println("排序后: ");
        printArray(arr5);
        System.out.println("是否有序: " + isSorted(arr5) + "\n");

        // 测试用例 6：空数组
        int[] arr6 = {};
        System.out.println("测试 6 - 空数组: ");
        printArray(arr6);
        sort(arr6);
        System.out.println("排序后: ");
        printArray(arr6);
        System.out.println("是否有序: " + isSorted(arr6) + "\n");

        System.out.println("=== 演示结束 ===");
    }
}
