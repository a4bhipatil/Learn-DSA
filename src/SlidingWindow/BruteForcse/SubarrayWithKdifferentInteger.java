package SlidingWindow.BruteForcse;

import java.util.*;
public class SubarrayWithKdifferentInteger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int j=i; j<n; j++){
                map.put(a[j], map.getOrDefault(a[j], 0) + 1);
                if(map.size()==k){
                    count++;
                }else if(map.size()>k){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
//example
//5
//1 2 1 3 4
//3