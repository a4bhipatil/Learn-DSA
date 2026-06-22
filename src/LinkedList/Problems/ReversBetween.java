package LinkedList.Problems;
class revers{
    Node head;
    Node tail;
    int size;
    revers(){
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
    public Node reversbetween(Node head,int left,int right){
        if(head==null && left==right){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        for(int i=1; i<left; i++){
            prev=prev.next;
        }
        Node curr=prev.next;
        Node temp=curr;
        Node prevNode=null;
        for(int i=0; i<right-left+1; i++){
            Node next=curr.next;
            curr.next=prevNode;
            prevNode=curr;
            curr=next;
        }
        prev.next=prevNode;
        temp.next=curr;
        return dummy.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class ReversBetween {
    public static void main(String[] args){
        revers list=new revers();
        revers.Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);
        list.head=head;
        head = list.reversbetween(head, 2, 4);
        list.display();

//        revers.Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
    }
}
