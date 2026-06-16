package LinkedList;
class LinkL{
    Node head;
    Node tail;
    int size;
    LinkL(){
        this.size=0;
    }
    public void InsertAtFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void InsertAtLast(int data){
        if(tail==null){
            InsertAtFirst(data);
            return;
        }
        Node last=new Node(data);
        tail.next=last;
        tail=last;
        size++;
    }
    public void InsertAtPosition(int data,int index){
        if(index==0){
            InsertAtFirst(data);
            return;
        }
        if(index==size){
            InsertAtLast(data);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;

        }
        Node position=new Node(data,temp.next);
        temp.next=position;
        size++;
    }
    public int  deletatposition(int index){
        if(index==0){
//            return deletefirst();
        }
        if(index==size-1){
//            return deletelast();
        }
        Node prev=get(index-1);
        int data=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return data;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("end");
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
public class InsertAtIndexLL {
    public static void main(String[] args){
        LinkL list=new LinkL();list.InsertAtFirst(30);
        list.InsertAtFirst(20);
        list.InsertAtFirst(10);
        list.InsertAtFirst(40);
        list.InsertAtLast(99);
        list.Display();
        list.InsertAtPosition(50,3);
        list.Display();
        list.deletatposition(3);
        list.Display();
    }
}
