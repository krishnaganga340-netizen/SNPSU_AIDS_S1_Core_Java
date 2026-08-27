package com.snpsu.SearchingSortingalgorithm;

public class BubbleSort {
    public static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1 ] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 0, 8, 3, 6, 12};
        int[] result = BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.println(result[i]);

        }
    }
}
