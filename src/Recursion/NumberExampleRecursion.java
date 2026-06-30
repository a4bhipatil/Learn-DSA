package Recursion;

public class NumberExampleRecursion {
    public static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursion call
        //if you are calling function again and again,you can treat it as seperate call in the stack
        //this is the tail recursion
        //this is the last function call
        print(n+1);
    }
    public static void main(String[] args){
        print(1);
    }
}
