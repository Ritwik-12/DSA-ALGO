package com.project.rcursion;

public class RecursionBasic {

    public static void main(String []args){
       fun(5);
    }

    static void fun(int n){

        if(n>0) {
            System.out.println("hello world!");

            fun(n - 1);
        }
    }
}
