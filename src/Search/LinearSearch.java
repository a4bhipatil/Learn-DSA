package Search;
import java.util.*;
class Linear{
    public void Search(int[] a,int x){
        for(int i=0; i<a.length; i++){
            if(a[i]==x) {
                System.out.println("index of " + i + "=" + a[i]);
                return;
            }
        }
        System.out.println("Not found");
    }
}
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Linear l=new Linear();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        l.Search(a,k);
    }
}
