package SlidingWindow.BruteForcse;
import java.util.*;
public class MaximumConsicativeOnes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int maxlength=0;
        for(int i=0; i<n; i++){
            int zeros=0;
            for(int j=i; j<n; j++){
                if(a[j]==0){
                    zeros++;
                }if(zeros<=k){
                    int len=j-i+1;
                    maxlength=Math.max(maxlength,len);
                }else{
                    break;
                }
            }
        }
        System.out.println(maxlength);
    }
}
