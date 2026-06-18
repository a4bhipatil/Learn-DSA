//package Stack;
//
//import java.util.Scanner;
//
//class stack{
//    int[] data;
//    private static final int default_size=10;
//    int ptr=-1;
//    public stack(){
//        this(default_size);
//    }
//    public stack(int size){
//        this.data=new int[size];
//    }
//    public boolean isFull(){
//        return ptr==data.length-1;
//    }
//    public boolean isEmpty(){
//        return ptr==-1;
//    }
//    public boolean push(int n){
//        if(isFull()){
//            System.out.println("stack is full");
//            return false;
//        }
//        ptr++;
//        data[ptr]=n;
//        return true;
//    }
//    public int pop() throws Exception{
//        if(isEmpty()){
//            throw new Exception("stack is Empty");
//        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
//    }
//    public int  top() throws Exception{
//        if(isEmpty()){
//            throw new Exception("stack is Empty");
//        }
//        return data[ptr];
//    }
//}
//public class Practice {
//    public static void main(String[] args) throws Exception{
//        Scanner sc=new Scanner(System.in);
//        stack s=new stack();
//        int n=sc.nextInt();
//        for(int i=0; i<n; i++){
//            s.push(sc.nextInt());
//        }
////        s.push(4);
////        s.push(3);
////        s.push(3);
////        s.push(6);
////        s.pop();
////        s.pop();
////        s.pop();
////        System.out.println(s.pop());
//        System.out.println(s.top());
//    }
//}
