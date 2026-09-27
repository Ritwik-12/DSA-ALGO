package com.project.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {

    static void main() {
        int[] arr={1,2,3};
       permutation(arr,arr.length);

    }

    public static void permutation(int[] arr,int n){

        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        permutationHelper(arr,0,n-1);

    }
    public static void permutationHelper(int[] arr,int l,int r){

        //base case
        if(l==r){
            printArray(arr);
            return;
        }

        for(int i=l;i<=r;i++){
            swap(arr,l,i);
            permutationHelper(arr,l+1,r);
            swap(arr,l,i);
        }

    }
    public static void swap(int[] arr,int l,int i){

        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
    }

    public static void printArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
