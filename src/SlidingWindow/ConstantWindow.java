package SlidingWindow;
import java.util.*;
public class ConstantWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //It will find the maximum sum in the array of k length;
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=a[i];
        }
        int maxsum=sum;
        while(r<n-1){
            sum=sum-a[l];
            l++;
            r++;
            sum=sum+a[r];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
