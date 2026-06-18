package Stack;
import java.util.*;
class queue{
    protected int[] data;
    private static final int default_size=10;
    int end=0;
    queue(){
        this(default_size);
    }
    queue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int n){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++]=n;
        return true;
    }
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }
        int remove=data[end];
        for(int i=1; i<end; i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }
        return data[end];
    }
    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+"<--");
        }
        System.out.println("end");
    }
}
public class Practice{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        queue q=new queue();
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter the number");
            q.insert(sc.nextInt());
        }
//        q.insert(5);
//        q.insert(3);
//        q.insert(9);
//        q.insert(12);
        q.display();
        q.removed();
        q.display();

    }
}