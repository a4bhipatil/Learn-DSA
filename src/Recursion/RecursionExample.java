    package Recursion;

    import java.util.Scanner;
    //for this one the space complexity is 0(1)
    public class RecursionExample {
        public static void fun(int n){
            if(n==0){
                return;
            }
            fun(n-1);
            System.out.print(n);
        }
        public static void funrev(int n){
            if(n==0){
                return;
            }
            System.out.print(n);
            funrev(n-1);
        }
        public static void funboth(int n){
            if(n==0){
                return;
            }
            System.out.print(n);
            funboth(n-1);
            System.out.print(n);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
    //        funrev(n);
    //        fun(n);
            funboth(n);
        }
    }
