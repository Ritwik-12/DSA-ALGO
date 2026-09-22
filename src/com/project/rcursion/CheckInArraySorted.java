package com.project.rcursion;

public class CheckInArraySorted {
    public static void main(String[] args){

        int[] arr={10,20,30,40,60,50};

        System.out.println(isSorted(arr,arr.length));

    }

    public static boolean isSorted(int [] arr,int n){

        if(n==0 || n==1)
            return true;

        if(arr[n-1]>arr[n-2])
            return isSorted(arr,n-1);

        return false;
    }
}
