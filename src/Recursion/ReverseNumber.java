package Recursion;

import java.util.Scanner;

public class ReverseNumber {
//    static int sum=0;
//    static void revers(int n){
//        if(n==0){
//            return;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        revers(n/10);
//    }
    static int revers1(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        revers(n);
        System.out.println(revers1(n));
    }
}
