package SlidingWindow.BruteForcse;

import java.util.Scanner;

public class NumOfSubStringIn3Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++){
            int[] a=new int[3];
            for(int j=i; j<s.length(); j++){
                a[s.charAt(j)-'a']=1;
                if(a[0]+a[1]+a[2]==3){
                    //for optimal brute force we should also use like this
                    //count = count+(s.length()-j); break;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
