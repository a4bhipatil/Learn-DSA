package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int sum(int n){
        int digits=0;
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
