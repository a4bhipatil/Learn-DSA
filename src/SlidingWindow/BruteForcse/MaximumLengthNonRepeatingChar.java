package SlidingWindow.BruteForcse;

import java.util.*;
public class MaximumLengthNonRepeatingChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int maxlength=0;
        for(int i=0; i<s.length(); i++){
            int[] hash=new int[256];
            for(int j=0; j<s.length(); j++){
                if(hash[s.charAt(j)]==1){
                    break;
                }
                int length=j-i+1;
                maxlength=Math.max(maxlength,length);
                hash[s.charAt(j)]=1;
            }
        }
        System.out.println(maxlength);
    }
}