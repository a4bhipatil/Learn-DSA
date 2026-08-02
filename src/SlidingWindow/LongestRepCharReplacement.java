package SlidingWindow;

import java.util.Scanner;

public class LongestRepCharReplacement {
    public static void fun(String s,int k){
        int l=0,r=0,maxlength=0,maxfr=0;
        int[] a=new int[26];
        while(r<s.length()){
            a[s.charAt(r)-'A']++;
            maxfr=Math.max(maxfr,a[s.charAt(r)-'A']);
            //If()
            while((r-l+1)-maxfr>k){
                a[s.charAt(l)-'A']--;
                maxfr=0;
                for(int i=0; i<a.length; i++){
                    maxfr=Math.max(maxfr,a[i]);
                }
                l++;
            }
            if((r-l+1)-maxfr<=k){
                maxlength=Math.max(maxlength,r-l+1);
            }
            r++;
        }
        System.out.println(maxlength);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        fun(s,k);
    }
    /// example
    // inp=AABABBA
    //OUT 5
}
