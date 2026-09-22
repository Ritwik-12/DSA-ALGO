package com.project.backtracking;

public class ShdokuSolver {
    public static void main(String[] args){

        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        shdokuSolver(board,0,0);

        //printin the solved board

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean shdokuSolver(int[][] board,int row,int col){

        //base case

        if(row==9)
            return true;

        // we reaced an end of a column ,  so we need to start from
        //the next row first cell
        if(col==9)
            return shdokuSolver(board,row+1,0);


        //if its a non zero number then we dont need to do anything
        //simply call it for the next cell
        if(board[row][col]!=0)
            return shdokuSolver(board,row,col+1);

        for(int i=1;i<=9;i++){
            if(isShudokuvalid(board,row,col,i)){
                board[row][col]=i;
                if(shdokuSolver(board,row,col+1)) return true;
                board[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isShudokuvalid(int[][] board,int row,int col,int num){


        for(int i=0;i<9;i++){
            if(board[row][i]==num)
                return false;
            if(board[i][col]==num)
                return false;
        }

        int gridRow=row/3;
        int gridCol= col/3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int cellRow=3*gridRow+i;
                int cellCol=3*gridCol+j;

                if(board[cellRow][cellCol]==num)
                    return false;
            }
        }
        return true;
    }
}
