package SlidingWindow;
import java.util.*;
public class LongestsubstringatMostKchar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        HashMap <Character,Integer> map=new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}
