package Problems.LinkedListProblems;
import java.util.*;
class pal{
    Node head;
    Node tail;
    int size;
    pal(){
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
    public void insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    public Node middle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node revers(Node node){
        Node prev=null;
        Node curr=node;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=middle();
        Node secondh=revers(mid);
        Node first=head;
        Node second=secondh;
        boolean ans=true;
        while(second!=null){
            if(first.data!=second.data){
                ans=false;
                break;
            }
            first=first.next;
            second=second.next;
        }
        revers(secondh);
        return ans;
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
public class PalindromChecking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        pal list=new pal();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            list.insert(sc.nextInt());
        }
        System.out.println(list.palindrome());
        list.display();
    }
}
