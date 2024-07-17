package org.otus;

import java.util.Arrays;

/**
 * @author Sergei on 16.07.2024 17:00.
 * @project Default (Template) Project
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Домашнее задание #30-----------------");
        int[] arr = {1, 2, 1, 2, 2};
        System.out.println(Arrays.toString(arr));
        printArr(arr);
        printArr(searchFirstOne(arr));
        System.out.println();

        int[] arr1 = {1, 2, 1, 2, 2, 2, 2};
        printArr(arr1);
        printArr(searchFirstOne(arr1));
        System.out.println();

        try {
            int[] arr2 = {2, 2, 2, 2};
            printArr(arr2);
            printArr(searchFirstOne(arr2));
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println("\n");


        int[] arr3 = {1, 2};
        printArr(arr3);
        System.out.println(searchOneAndTwo(arr3));
        System.out.println();

        int[] arr4 = {1, 1};
        printArr(arr4);
        System.out.println(searchOneAndTwo(arr4));
        System.out.println();

        int[] arr5 = {1, 3};
        printArr(arr5);
        System.out.println(searchOneAndTwo(arr5));
        System.out.println();

        int[] arr6 = {1, 2, 2, 1};
        printArr(arr6);
        System.out.println(searchOneAndTwo(arr6));
        System.out.println();

    }

    public static int[] searchFirstOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                int[] newArr = new int[arr.length - i - 1];
                for (int j = i + 1; j < arr.length; j++) {
                    newArr[arr.length - j - 1] = arr[j];
                }
                return newArr;
            }
        }
        throw new RuntimeException("Единиц не найдено");
    }


    public static boolean isNotContainsSomethingDifferentFromOneOrTwo(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 || arr[i] != 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(final int[] arr, final int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchOneAndTwo(int[] arr) {
        return contains(arr, 1) && contains(arr, 2) && isNotContainsSomethingDifferentFromOneOrTwo(arr);
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
