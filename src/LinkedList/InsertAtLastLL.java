//package LinkedList;
//class LinkedList{
//    Node head;
//    Node tail;
//    int size;
//    LinkedList(){
//        this.size=0;
//    }
//    public void InsertAtFirst(int data){
//        Node nn=new Node(data);
//        nn.next=head;
//        head=nn;
//        if(tail==null){
//            tail=head;
//        }
//        size+=1;
//    }
//    public void InsertAtLast(int data){
//        if(tail==null){
//            InsertAtFirst(data);
//            return;
//        }
//        Node LastNode=new Node(data);
//        tail.next=LastNode;
//        tail=LastNode;
//        size++;
//    }
//    public void Display(){
//        Node temp=head;
//        while(temp!=null) {
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }
//    }
//    public class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//        Node(int data,Node next){
//            this.data=data;
//            this.next=next;
//        }
//    }
//}
//public class InsertAtLastLL {
//    public static void main(String[] args){
//        LinkedList list=new LinkedList();
//        list.InsertAtFirst(30);
//        list.InsertAtFirst(20);
//        list.InsertAtFirst(10);
//        list.InsertAtFirst(10);
//        list.InsertAtLast(99);
//        list.Display();
//    }
//}
