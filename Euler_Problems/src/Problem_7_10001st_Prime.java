//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

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
