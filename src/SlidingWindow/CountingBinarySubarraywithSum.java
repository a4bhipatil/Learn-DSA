package SlidingWindow;

import java.util.Scanner;

public class CountingBinarySubarraywithSum {
    public static int fun(int[] num,int g){
        int l=0,r=0,sum=0,count=0;
        if(g<0){
            return 0;
        }
        while(r<num.length){
            sum=sum+num[r];
            while(sum>g){
                sum=sum-num[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        int g=sc.nextInt();
        int ans=fun(num,g)-fun(num,g-1);
        System.out.println(ans);
    }
}
