package com.bridgelabz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountDistoncElements {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 2, 3, 5, 6, 1};
        Arrays.sort(arr);
        int count=1;
        System.out.println("distict elements in array" +"  ");
        for (int i=1; i<arr.length; i++){
            if (arr[i] != arr[i-1]) {
                System.out.println(arr[i] +" ");
                count++;
            }
        }
        System.out.println("count of distinct elements in array is" + count);
    }
}
