package org.example3;

public class Factorial {
    public static void main(String[] args){

        int number = 5;
        int change = number;

        System.out.println(factorial(number));

    }
    public static int factorial(int a){
        if(a==0)
            return 1;

        return a*factorial(a-1);
    }
}
