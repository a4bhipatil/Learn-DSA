package DoublyLL;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
public class DLL {
    Node head;
    Node tail;
    public void insertfirst(int data){
        Node nn=new Node(data);
        nn.next=head;
        nn.prev=null;
        if(head!=null) {
            head.prev = nn;
        }
        head = nn;
    }
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
    public Node find(int data){
        Node find=head;
        while(find!=null){
            if(find.data==data){
                return find;
            }
            find=find.next;
        }
        return null;
    }
    public void insertatposition(int after,int data){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node nn=new Node(data);
        nn.next=p.next;
        p.next=nn;
        nn.prev=p;
        if(nn.next!=null) {
            nn.next.prev = nn;
        }
    }
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.data+" ");
            last=temp;
            temp=temp.next;
        }
        System.out.println();
        System.out.println("print in reverse");
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.prev;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DLL list=new DLL();
        list.insertfirst(10);
        list.insertfirst(30);
        list.insertfirst(50);
        list.insertfirst(70);
        list.insertfirst(90);
        list.insertlast(100);
        list.insertatposition(30,200);
        list.display();
    }
}
