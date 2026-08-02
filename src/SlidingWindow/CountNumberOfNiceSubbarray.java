package SlidingWindow;

import java.util.Scanner;

public class CountNumberOfNiceSubbarray {
    public static int fun1(int[] n,int g){
        return fun(n,g)-fun(n,g-1);
    }
    public static int fun(int[] n,int g){
        int l=0,r=0,sum=0,count=0;
        while(r<n.length){
            sum+=(n[r]%2);
            while(sum>g){
                sum-=(n[l]%2);
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count++;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] n=new int[k];
        for(int i=0; i<k; i++){
            n[i]=sc.nextInt();
        }
        int g=sc.nextInt();
        System.out.println(fun1(n,g));
    }
}
