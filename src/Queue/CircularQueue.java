package Queue;

import java.util.Scanner;

class CQueue{
    protected int[] data;
    private static final int default_size=10;
    int end=0;
    int front=0;
    int size=0;
    CQueue(){
        this(default_size);
    }
    CQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int n){
        if(isFull()){
            return false;
        }
        data[end++]=n;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("The circular queue is empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("The circular queue is empty");
        }
        return data[front];
    }
    public void display(){
        for(int i=front; i<end; i++){
            System.out.print(data[i]+"<--");
        }
        System.out.println("end");
    }
}
public class CircularQueue {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        CQueue c=new CQueue();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            c.insert(sc.nextInt());
        }
        c.display();
        c.remove();
        System.out.println(c.front());

//        c.insert(4);
//        c.insert(8);
//        c.insert(2);
//        c.insert(1);
//        c.display();
//        c.remove();
//        c.display();
//        System.out.println(c.front());
//
    }
}
