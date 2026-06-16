package DoublyLL;

public class Practice {
    Node head;
    Node tail;
    public void insertlast(int data){
        Node nn=new Node(data);
        Node last=head;
        nn.next=null;
        if(head==null){
            nn.prev=null;
            head=nn;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=nn;
        nn.prev=last;
    }
}
