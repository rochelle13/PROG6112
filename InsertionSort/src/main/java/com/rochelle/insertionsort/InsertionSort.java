/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.insertionsort;

/**
 *
 * @author 27790
 */
public class InsertionSort {

    //meyhod to sort array usinf insertion sort
    public static void insertionSort(int[] arr) {

        int j, temp;
        /*
        moves elements of the array that are greater than the temp 
        value to one position ahead of their current position
         */
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
    }

    // method to print array 
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] scores = {78, 92, 45, 60, 89, 55, 100, 5, 3, 25, 79, 64, 32, 46, 52, 107, 204, 1};

        System.out.println("Before sorting:");
        printArray(scores);

        insertionSort(scores);

        System.out.println("After sorting:");
        printArray(scores);

    }
}
