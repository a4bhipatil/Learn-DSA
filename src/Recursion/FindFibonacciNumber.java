package Recursion;

import java.util.Scanner;

public class FindFibonacciNumber {
    static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fibo(n);
        System.out.println(ans);
    }
}
