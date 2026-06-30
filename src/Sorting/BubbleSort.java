package Sorting;

import java.util.Scanner;

class Sort{
    public void Bubble(int[] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Sort s=new Sort();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        s.Bubble(a);
    }
}
