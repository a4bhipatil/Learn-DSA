package Problems.LinkedListProblems;
import java.util.*;
class LL4{
    Node head;
    Node tail;
    int size;
    LL4(){
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
    public void inverse(){
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
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("end");
    }
}
public class InverseList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL4 list=new LL4();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            list.insert(sc.nextInt());
        }
//        list.inverse();
        list.display();
    }
}
