/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.bubblesort;

/**
 *
 * @author 27790
 */
public class BubbleSort {

    //Method that performs bubblesort on an array
    public static void bubbleSort(int[] arr) {
        int i, j, temp;
        int k = arr.length - 1;
        //outer loop used for each pass
        for (i = 0; i < arr.length - 1; i++) {
            //Inner loop used for comparing each pair
            for (j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swaps elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            k--;
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

        bubbleSort(scores);

        System.out.println("After sorting:");
        printArray(scores);
    }

}
