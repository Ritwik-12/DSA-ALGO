package com.project.rcursion;

public class FindStringInAnother {
    public static void main(String[] args){

        String str="ababbabac";
        String word="aba";
        int ans=findString(str,word,0);
        System.out.println(ans);

    }


    public static int findString(String str,String word,int index){

        if(index>str.length()-word.length()){
            return 0;
        }

        if(str.substring(index,index+word.length()).equals(word)){
            return 1+findString(str,word,index+1);
        }

        return findString(str,word,index+1);


    }
}
