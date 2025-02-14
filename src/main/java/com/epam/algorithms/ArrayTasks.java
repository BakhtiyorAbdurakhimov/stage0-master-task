package com.epam.algorithms;

public class ArrayTasks {
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        return java.util.Arrays.stream(arr).filter(num -> num > 0).toArray();
    }

    public int[][] sortRaggedArray(int[][] arr) {
        java.util.Arrays.sort(arr, (a, b) -> Integer.compare(a.length, b.length));
        for (int[] subArray : arr) {
            java.util.Arrays.sort(subArray);
        }
        return arr;
    }
}