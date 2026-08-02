package SlidingWindow.BruteForcse;
import java.util.*;
public class LongestRepCharReplacement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int maxlength=0;
        for(int i=0; i<s.length(); i++){
            int[] a=new int[26];
            int max=0;
            for(int j=i; j<s.length(); j++){
                a[s.charAt(j)-'A']++;
                max=Math.max(max,a[s.charAt(j)-'A']);
                int changes=(j-i+1)-max;
                if(changes<=k){
                    maxlength=Math.max(maxlength,j-i+1);
                }else{
                    break;
                }
            }
        }
        System.out.println(maxlength);
    }
}
