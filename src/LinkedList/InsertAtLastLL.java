package LinkedList;
class List{
    Node head;
    Node tail;
    int size;
    List(){
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
    public void InsertAtLast(int data){
        if(tail==null){
            InsertAtFirst(data);
            return;
        }
        Node LastNode=new Node(data);
        tail.next=LastNode;
        tail=LastNode;
        size++;
    }
    public int deletfirst(){
        int data=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }
    public int DeletLast(){
        if(size<=1){
            return deletfirst();
        }
        Node secondLast=get(size-2);
        int data=tail.data;
        tail=secondLast;
        tail.next=null;
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
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public class Node{
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
}
public class InsertAtLastLL {
    public static void main(String[] args){
        List list=new List();
        list.InsertAtFirst(30);
        list.InsertAtFirst(20);
        list.InsertAtFirst(10);
        list.InsertAtFirst(10);
        list.InsertAtLast(99);
        list.Display();
        System.out.println();
        list.DeletLast();
        list.Display();
    }
}
