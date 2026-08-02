package SlidingWindow;
import java.util.*;
public class FruitToBasket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0; right<n; right++){
            map.put(a[right],map.getOrDefault(a[right],0)+1);
            while(map.size()>k){
                map.put(a[left],map.get(a[left])-1);
                if(map.get(a[left])==0){
                    map.remove(a[left]);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}
