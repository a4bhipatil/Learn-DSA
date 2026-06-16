package LinkedList;
class Linked{
    Node head;
    Node tail;
    int size;
    Linked(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void insert(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("end");
    }
}
public class LinkedList{
    public static void main(String[] args){
        Linked list=new Linked();
        list.insert(30);
        list.insert(50);
        list.insert(60);
        list.insert(100);
        list.display();
    }
}