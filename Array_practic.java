package DSA.Arrar;

import java.util.Arrays;

public class Array_practic {

    public static void main(String[] args) {

        /* Que 1 :- Write a Java program to sum values of an array. */
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int sum = 0;
        for (int i : arr) {
            sum += i;

        }
        System.out.println("The sum of array is: " + sum);

        /*
         * Que 2 :- Write a Java program to find the maximum and minimum value of an
         * array.
         * 
         * 
         * int arr [] = {44, 2 , 65, 3, -20, 65, -25, 69};
         * 
         * findMinMax(arr);
         * }
         * public static void findMinMax(int arr []){
         * 
         * int Min = arr[0]; // in starting min is 44
         * int Max = arr[0]; // in starting max is 44
         * 
         * for(int i=1; i<arr.length; i++){ // we check condition for frist number 2
         * if(arr[i] <Min){ // we check 2<44 true then
         * Min = arr[i]; // min = 2
         * }
         * if(arr[i]>Max){ // we check 2<44 false then
         * // max = 44 not update
         * Max = arr[i];
         * }
         * }
         * System.out.println("This array min number is "+Min);
         * System.out.println("This array Max number is "+Max);
         * }
         */

        /*
         * Que 3 :-Write a Java program to reverse an array of integer values.
         * int arr []= {4,5,6,8,9,14};
         * System.out.println("Before reverse"+Arrays.toString(arr));
         * arrayReverse(arr);
         * System.out.println("After reverse"+Arrays.toString(arr));
         * }
         * 
         * public static void arrayReverse(int arr[]){
         * // Initialize two pointers: one at the start and one at the end of the array
         * int st =0;
         * int end = arr.length-1;
         * // Loop until the pointers meet or cross each other
         * while(st<end){
         * // Use a temporary variable to store the value of st
         * int temp = arr[st];
         * arr[st] = arr[end]; // Assign the value of end to st
         * arr[end] = temp; // Assign the value of temp to end
         * // Move to the next pair
         * st++;
         * end--;
         * }
         */

    }
}
