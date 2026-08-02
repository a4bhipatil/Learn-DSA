package SlidingWindow;

import java.util.Scanner;

public class NumOfSubstringin3Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] lastseen={-1,-1,-1};
        int count=0;
        for(int i=0; i<s.length(); i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1&&lastseen[1]!=-1&&lastseen[2]!=-1){
                count=count+(1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2])));
            }
        }
        System.out.println(count);
    }
}
