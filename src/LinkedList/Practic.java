package LinkedList;
class Link{
    Node head;
    Node tail;
    int size;
    Link(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void InsertAtFirst(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public int deletefirst(){
        int data=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }
    public void InsertLastNode(int data){
        if(tail==null){
            InsertAtFirst(data);
            return;
        }
        Node LastNode=new Node(data);
        tail.next=LastNode;
        tail=LastNode;
        size++;
    }
    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast=get(size-2);
        int data=tail.data;
        tail=secondLast;
        tail.next=null;
        size--;
        return data;
    }
    public void insertatposition(int data,int index){
        if(index==0){
            InsertAtFirst(data);
            return;
        }
        if(index==size){
            InsertLastNode(data);
            return;
        }
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        Node position=new Node(data,temp.next);
        temp.next=position;
        size++;
    }
    public int deletatposition(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int data=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return data;
    }
    public Node find(int data){
        Node node=head;
        while(node!=null){
            if(node.data==data){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Practic{
    public static void main(String[] args){
        Link list=new Link();
        list.InsertAtFirst(1);
        list.InsertAtFirst(25);
        list.InsertAtFirst(50);
        list.InsertAtFirst(75);
        list.InsertLastNode(100);
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.deleteLast();
//        list.display();
        list.display();
        System.out.println(list.deletatposition(2));
        list.display();
    }
}