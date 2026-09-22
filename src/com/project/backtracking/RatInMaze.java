package com.project.backtracking;

public class RatInMaze {
    static void main() {

        int[][] arr={{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        boolean[][] visited=new boolean[4][4];
        String path="";

        ratInMaze(arr,4,4,0,0,visited,path);
    }

    public static boolean isValid(int[][] arr,int m,int n,boolean[][] visited,int i,int j ){

        if(i>=0 && i<m && j>=0 && j<n &&arr[i][j]==1 && !visited[i][j]){
            return true;
        }
        return false;
    }



    public static void ratInMaze(int [][]arr,int m,int n,int i,int j,boolean[][] visited,String path){

        //base case

        if(i==m-1 && j==n-1) {
            System.out.println(path);
            return;
        }

        //DLRU
        if(isValid(arr,m,n,visited,i+1,j)){
            visited[i+1][j]=true;
            ratInMaze(arr,m,n,i+1,j,visited,path+'D');
            visited[i+1][j]=false;
        }

        if(isValid(arr,m,n,visited,i,j-1)){
            visited[i][j-1]=true;
            ratInMaze(arr,m,n,i,j-1,visited,path+'L');
            visited[i][j-1]=false;
        }

        if(isValid(arr,m,n,visited,i,j+1)){
            visited[i][j+1]=true;
            ratInMaze(arr,m,n,i,j+1,visited,path+'R');
            visited[i][j+1]=false;
        }

        if(isValid(arr,m,n,visited,i-1,j)){
            visited[i-1][j]=true;
            ratInMaze(arr,m,n,i-1,j,visited,path+'U');
            visited[i-1][j]=false;
        }


    }
}
