package SlidingWindow.BruteForcse;
import java.util.*;
public class FruitIntoBasket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int maxlength=0;
        for(int i=0; i<n; i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i; j<n; j++){
                set.add(a[j]);
                if(set.size()<=2){
                    maxlength=Math.max(maxlength,j-i+1);
                }else{
                    break;
                }
            }
        }
        System.out.println(maxlength);
    }
}
