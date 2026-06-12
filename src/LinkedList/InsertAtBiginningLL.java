package LinkedList;
import java.util.*;
class LL{
    Node head;
    Node tail;

    int size;
    LL(){
        this.size=0;
    }
    public void InsertAtFirst(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public int deleteFirst(){
        int data=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("end");
    }
    public class Node{
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
}
public class InsertAtBiginningLL {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        list.InsertAtFirst(30);
        list.InsertAtFirst(20);
        list.InsertAtFirst(10);
        list.InsertAtFirst(80);
        System.out.println(list.deleteFirst());
        list.display();
    }

}
