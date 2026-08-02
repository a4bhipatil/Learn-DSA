package SlidingWindow;

import java.util.Scanner;

public class BetterSolution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0,r=0,sum=0,maxlength=0;
        while(r<n){
            sum+=a[r];
            while(sum>k){
                sum=sum-a[l];
                l=l+1;
            }
            if(sum<=k){
                maxlength=Math.max(maxlength,r-l+1);
            }
            r=r+1;
        }
        System.out.println(maxlength);
    }
}
