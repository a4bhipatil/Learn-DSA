package Recursion;

import java.util.Scanner;

public class CountNoZeroes {
    static int Counter(int n){
        return Count(n,0);
    }
    //Spacial pattern ,how to pass a value to above calls
    static int Count(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return Count(n/10,c+1);
        }
        return Count(n/10,c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Counter(n));
    }
}
