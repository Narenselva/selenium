package com.workout;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void printSum(int[][] arr){
	int row = arr.length;
	int column = arr.length;
	  //Logic to calculate sum of diagonal1
int sumOfDiagonal1=0;
  for (int i = 0, j =0; i< row && j < column; i++, j++) {
        sumOfDiagonal1= sumOfDiagonal1 + arr[i][j];
       
        
        
   }

    //Logic to calculate sum of diagonal2

    int sumOfDiagonal2=0;
    for (int i=0,j=column-1 ; i<row && j>=0 ; i++, j--) {
          sumOfDiagonal2= sumOfDiagonal2 + arr[i][j];
           
    }
	System.out.println(Math.abs(sumOfDiagonal1)-Math.abs(sumOfDiagonal2));
    
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        printSum(a);
    }
}
