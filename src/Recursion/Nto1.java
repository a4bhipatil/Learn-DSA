package Recursion;

import java.util.Scanner;

public class Nto1 {

    //concept
    static void pass(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pass(--n);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
        //for reverse printing
        //fun(n-1);
        //System.out.println(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);
    }
}
