// Project Euler - Problem 7
// https://projecteuler.net/problem=1
// Task: Find the 10 001st prime.

import java.lang.System;

public class Problem_7_10001st_Prime {
    public static void main(String[] args){
        int num=3;
        for(int j=1;j<=10000;j++){
            for(int i=2;i<=(num-1);i++){
                if(num%i!=0){

                }
                else{
                    num=num+1;
                    i=2;
                }
            }
            num=num+1;
        }
        System.out.print(num-1);

    }
}
