package com.project.rcursion;

import java.sql.SQLOutput;

public class Recursion1 {


    static void main(String[] args) {
//        int result=sum(5);
//        System.out.println(result);
//
//        int res=nthFibonaci(5);
//        System.out.println(res);
       // nNaturalNum(5);

//        for(int i=0;i<6;i++){
//            System.out.println(nthFibonaci(i));
//        }

//        int ans =ncr(5,3);
//        System.out.println(ans);

//        int ans =josephus(5,3);
//        System.out.println(ans);

        //System.out.println(ncr(2,0));

       // System.out.println(countOccurence("ababbabac","aba",0));

        int[] arr ={10,20,40,30};

        System.out.println(isSorted(arr,4));

    }

    //print n natural number using recursion

    static void nNaturalNum(int n){

        if(n==1) {
            System.out.println(n);
            return;
        }
        nNaturalNum(n-1);

        System.out.println(n);


    }


    static int sum(int n){

        //base case
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return sum(n-1)+n;
    }

    //fibonacii

    static int nthFibonaci(int n){

        if(n==0 ||n==1) {

            return n;
        }


       return  nthFibonaci(n-1)+nthFibonaci(n-2);
    }

    //nCr  -- nCr = n-1Cr-1 +n-1Cr


//    static int ncr(int n,int r){
//
//
//        //edge case
//
//        if(r>n)
//            return 0;
//        if (n==r || r==0)
//            return 1;
//
//       return ncr(n-1,r-1)+ncr(n-1,r);
//    }

    static int josephus(int n,int k ){

        //base case

        if(n==1)
             return 0;

        return (josephus(n-1,k)+k)%n;
    }


    //find occuernce of a string into another string

//    public static int countOccurence(String text,String word,int index){
//
//        //basce case
//        //if the index  > word.length in the text then there is no occurence
//
//        if(index>(text.length()-word.length()))
//            return 0;
//
//        if(text.substring(index,index+word.length()).equals(word)){
//            return 1+countOccurence(text,word,index+1);
//        }
//
//        return countOccurence(text,word,index+1);
//
//    }


    //check if array is sorted

    public static boolean isSorted(int arr[],int n){

        //base case
        if(n==0 || n==1)
             return true;

        if(arr[n-1]>=arr[n-2])
            return isSorted(arr,n-1);


       return false;
    }



}
