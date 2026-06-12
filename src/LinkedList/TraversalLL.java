package LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class TraversalLL {
    static Node head,temp;
    public static void insertion(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            temp=newNode;
        }
        else{
            temp.next=newNode;
            temp=newNode;
        }
    }
    public static void display(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int data=sc.nextInt();
            insertion(data);
        }
        display();
    }
}
