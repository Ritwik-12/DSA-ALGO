package com.project.backtracking;

public class KnightTour {
    static void main(String[] args) {

        int[][] arr=new int[8][8];
        int n=arr.length;
        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=-1;
            }
        }

        arr[0][0]=0;

        int[] moveX={2,1,-1,-2,-2,-1,1,2};
        int[] moveY={1,2,2,1,-1,-2,-2,-1};

        knightTour(arr,n,0,0,moveX,moveY,1);

        //print the matrix

        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }

    public static boolean isValid(int[][] arr,int nextx,int nexty){

        int n=arr.length;
        if(nextx>=0 && nexty>=0 && nextx<n && nexty<n && arr[nextx][nexty]==-1){
            return true;
        }
        return false;
    }

    public static boolean knightTour(int[][] arr,int n,int curx,int cury,int[] moveX,int[] moveY,int step){

        //base case
        if(step==n*n)
            return true;

        for(int i=0;i<8;i++){
            int nextx=curx+moveX[i];
            int nexty=cury+moveY[i];

            if(isValid(arr,nextx,nexty)){
                arr[nextx][nexty]=step;
                boolean isTourCmpltByGoingThere=knightTour(arr,n,nextx,nexty,moveX,moveY,step+1);

                if(isTourCmpltByGoingThere==true) {
                    return true;
                }else{
                    arr[nextx][nexty]=-1;
                }

            }
        }

        return false;

    }
}
