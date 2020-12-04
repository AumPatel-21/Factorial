package com.company;

public class Factorial {
    public static int calcFactorial(int n){
        int m = 1;
        for(int j = 1; j <= n; j++){
            j = j * m;
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFactorial(4));
    }
}
