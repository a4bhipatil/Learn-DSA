package Queue;
class Qu{
    protected int[] data;
    private static final int default_size=10;
    int end=0;
    public Qu(){
        this(default_size);
    }
    public Qu(int size){
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
//            System.out.println("Queue is in overflow");
            return false;
        }
        data[end++]=n;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
//            System.out.println("queue is empty");
            throw new Exception("queue is empty");
//            return false;
        }
        int remove=data[0];
        //shift element to left
        for(int i=1; i<end; i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+"<--");
        }
        System.out.println("end");
    }
}
public class Queue {
    public static void main(String[] args) throws Exception{
        Qu queue=new Qu();
        queue.insert(4);
        queue.insert(8);
        queue.insert(0);
        queue.insert(2);
        queue.insert(99);
        queue.display();
        System.out.println();
        queue.remove();
        queue.display();
    }
}
