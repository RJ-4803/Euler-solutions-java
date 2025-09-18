//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

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
