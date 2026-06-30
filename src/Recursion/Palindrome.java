package Recursion;

import java.util.Scanner;

public class Palindrome {
    static int rev=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        rev=rev*10+rem;
        reverse(n/10);
    }
    static boolean pal(int n){
        rev=0;
        reverse(n);
        return n==rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(pal(n)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
