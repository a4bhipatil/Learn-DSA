package SlidingWindow.BruteForcse;

import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int maxlength=0;
        for(int i=0; i<n-1; i++){
            int sum=0;
            for(int j=i; j<n-1; j++){
                sum=sum+a[j];
                if(sum<=k){
                    maxlength=Math.max(maxlength,j-i+1);
                }else if(sum>k){
                    break;
                }
            }
        }
        System.out.println(maxlength);
    }
}
