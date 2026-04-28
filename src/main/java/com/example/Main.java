package com.example;

/**
 * 程序入口 —— 冒泡排序演示
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13, 33, 48, 22};

        System.out.println("原始数据: ");
        BubbleSort.printArray(data);

        BubbleSort.sort(data);

        System.out.println("排序结果: ");
        BubbleSort.printArray(data);

        System.out.println("是否有序: " + BubbleSort.isSorted(data));
    }
}
