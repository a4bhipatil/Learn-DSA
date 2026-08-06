package Problems.LinkedListProblems;
import java.util.*;
class LL1{
    Node head;
    Node tail;
    int size;
    LL1(){
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
        size++;
    }
    public static LL1 margelist(LL1 list1,LL1 list2){
        Node first=list1.head;
        Node sec=list2.head;
        LL1 list=new LL1();
        while(first!=null && sec!=null){
            if(first.data<sec.data){
                list.insert(first.data);
                first=first.next;
            }else{
                list.insert(sec.data);
                sec=sec.next;
            }
        }
        while(first!=null){
            list.insert(first.data);
            first=first.next;
        }
        while(sec!=null){
            list.insert(sec.data);
            sec=sec.next;
        }
        return list;
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
public class MergeTwoList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LL1 list1=new LL1();
        LL1 list2=new LL1();
        int n1=sc.nextInt();
        for(int i=0; i<n1; i++){
            list1.insert(sc.nextInt());
        }
        int n2=sc.nextInt();
        for(int i=0; i<n2; i++){
            list2.insert(sc.nextInt());
        }
        LL1 result=LL1.margelist(list1,list2);
        result.display();
    }
}
