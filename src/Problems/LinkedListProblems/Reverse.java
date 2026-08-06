package Problems.LinkedListProblems;

import java.util.*;
class LL{
    Node head;
    Node tail;
    int size;
    LL(){
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
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public void invers(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
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
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int data=sc.nextInt();
            list.insert(data);
        }
        list.display();
        list.invers();
        list.display();
    }
}