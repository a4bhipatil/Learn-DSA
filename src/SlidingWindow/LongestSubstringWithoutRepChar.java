package SlidingWindow;

import java.util.Scanner;

public class LongestSubstringWithoutRepChar {
    public void Maximumpoint(String s){
        int[] hash=new int[256];
        int l=0,r=0,maxlength=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxlength=Math.max(maxlength,len);
            hash[s.charAt(r)]=r;
            r++;
        }
        System.out.println(maxlength);
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LongestSubstringWithoutRepChar m=new LongestSubstringWithoutRepChar();
        m.Maximumpoint(s);
    }
}
