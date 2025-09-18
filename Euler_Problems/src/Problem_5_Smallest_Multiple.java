// Project Euler - Problem 5
// https://projecteuler.net/problem=1
// Task: Find smallest multiple.

import java.lang.System;

public class Problem_5_Smallest_Multiple {
    public static void main(String[] args){
        int num=1;
        int i=1;
        while(i<=20){
            if(num%i==0){
                i=i+1;
            }
            else{
                num=num+1;
                i=1;
            }
        }
        System.out.println(num);
    }
}
