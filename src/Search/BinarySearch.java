package Search;

import java.util.Scanner;

class Binary{
    public void search(int[] a,int s,int e,int target) {
        while (s <= e) {
            int mid = (s+e) / 2;
            if (a[mid] == target) {
                System.out.println(mid);
                return;
            }
            if (target < a[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Binary s=new Binary();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        s.search(a,0,n-1,target);

    }
}
