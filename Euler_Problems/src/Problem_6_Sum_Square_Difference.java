// Project Euler - Problem 6
// https://projecteuler.net/problem=1
// Task: Find the sum square difference.

import java.lang.System;

public class Problem_6_Sum_Square_Difference {
    public static void main(String[] args){
        int sumSqr,sqrSumTotal,sqrSum;

        sumSqr=0;
        sqrSumTotal=0;

        for(int i=1;i<=100;i++){

            sumSqr=sumSqr+i*i;
            sqrSumTotal=sqrSumTotal+i;

        }
        sqrSum=sqrSumTotal*sqrSumTotal;
        int sqrSumDif=sqrSum-sumSqr;
        System.out.println("Square of sum: "+sqrSum);
        System.out.println("Sum of square: "+sumSqr);
        System.out.println("Sum square diffrence: "+sqrSumDif);

    }
}
