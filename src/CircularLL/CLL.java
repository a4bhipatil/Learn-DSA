package CircularLL;
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
public class CLL {
    Node head;
    Node tail;
    public void insert(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        tail.next=nn;
        nn.next=head;
        tail=nn;
    }
    public void delete(int data){
        Node temp=head;
        if(temp==null){
            return;
        }
        if(temp.data==data){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=temp.next;
            if(n.data==data){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);
    }
    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.data+"--> ");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.println();
    }
    public static void main(String[] args){
        CLL list=new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.delete(30);
        list.display();
    }
}
