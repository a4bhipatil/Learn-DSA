package Search;
import java.util.*;
class Search{
    public void Binary(int[] a,int s,int e,int target){
        boolean isAscending=a[0]<a[e];
        while(s<=e){
            int m=(s+e)/2;
            if(a[m]==target){
                System.out.println(m);
                return;
            }
            if(isAscending){
                if(target<a[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                if(target>a[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }
        System.out.println(-1);
    }
}
public class BinarySearchOnAscOrDisc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Search s=new Search();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        s.Binary(a,0,n-1,k);
    }
}
