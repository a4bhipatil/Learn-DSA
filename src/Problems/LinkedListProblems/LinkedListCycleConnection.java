package Problems.LinkedListProblems;

import java.util.*;
class LL2{
    Node head;
    Node tail;
    int size;
    LL2(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(){

        }
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
    public void connect(int index){
        Node node=get(index);
        tail.next=node;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(int index){
        Node start=get(index);
        Node temp=head;
        boolean visited=false;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            if(temp==start){
                if(visited){
                    break;
                }
                visited=true;
            }
            temp=temp.next;
        }
        System.out.println("(back to "+start.data+")");
    }
}
public class LinkedListCycleConnection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL2 list=new LL2();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            list.insert(sc.nextInt());
        }
        int k=sc.nextInt();
        list.connect(k);
        list.display(k);
    }
}