package Sorting;

import java.util.Scanner;

class Search{
    public void Sort(int[] a){
        for(int i=0; i<=a.length-2; i++){
            int min=i;
            for(int j=i; j<=a.length-1; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Search s=new Search();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        s.Sort(a);
    }
}
