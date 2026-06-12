//package LinkedList;
//class Linklist{
//    Node head;
//    Node tail;
//    int size;
//    Linklist(){
//        this.size=0;
//    }
//    public void InserAtBiginning(int data){
//        Node newNode=new Node(data);
//        newNode.next=head;
//        head=newNode;
//        if(tail==null){
//            tail=head;
//        }
//        size+=1;
//    }
//    public void Display(){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println("end");
//    }
//    public class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//        }
//        Node(int data,Node next){
//            this.data=data;
//            this.next=next;
//        }
//    }
//
//}
//public class Practic {
//    public static void main(String[] args){
//        Linklist list=new Linklist();
//        list.InserAtBiginning(50);
//        list.InserAtBiginning(40);
//        list.InserAtBiginning(10);
//        list.InserAtBiginning(5);
//        list.Display();
//    }
//}
