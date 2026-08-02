package SlidingWindow;
import java.util.*;

public class SubarrayWithKdifferentInteger {
    public static int fun(int[] n,int k){
        int l=0,r=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n.length){
            map.put(n[r],map.getOrDefault(n[r],0)+1);
            while(map.size()>k){
                map.put(n[l],map.get(n[l])-1);
                if(map.get(n[l])==0){
                    map.remove(n[l]);
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] n=new int[a];
        for(int i=0; i<a; i++){
            n[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=fun(n,k)-fun(n,k-1);
        System.out.println(ans);
    }
}
