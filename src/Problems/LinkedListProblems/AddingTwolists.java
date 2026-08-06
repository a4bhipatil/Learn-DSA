package Problems.LinkedListProblems;

import java.util.*;
class LL3{
    Node head;
    Node tail;
    int size;
    LL3(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void insert(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public LL3 add(LL3 list1,LL3 list2){
        if(list1==null&&list2==null){
            return null;
        }
        Node first=list1.head;
        Node sec=list2.head;
        LL3 list=new LL3();
        while(first!=null && sec!=null){
            int sum=0;
            if(first!=null){
                sum+=first.data;
                first=first.next;
            }
            if(sec!=null){
                sum+=sec.data;
                sec=sec.next;
            }
            list.insert(sum);
        }
        return list;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class AddingTwolists{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL3 list1=new LL3();
        LL3 list2=new LL3();
        int n1=sc.nextInt();
        for(int i=0; i<n1; i++){
            list1.insert(sc.nextInt());
        }
        int n2=sc.nextInt();
        for(int i=0; i<n2; i++){
            list2.insert(sc.nextInt());
        }
        list1.display();
        list2.display();
        LL3 list=new LL3();
        LL3 ans=list.add(list1,list2);
        ans.display();
    }
}