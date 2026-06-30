package Sorting;

import java.util.Scanner;

class Sort1{
    public void Insertion(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class InsertionSort {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        Sort1 s=new Sort1();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        s.Insertion(a);
    }
}
