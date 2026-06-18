package Stack;

import java.util.Scanner;

class Cstack{
    protected int[] data;
    private static final int default_size=10;
    int ptr=-1;
    public Cstack(){
        this(default_size);
    }
    public Cstack(int size){
        this.data=new int[size];
    }
    public boolean push(int n){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=n;
        return true;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop frome an empty stack");
        }
//        int removed =data[ptr];
//        ptr--;
//        return removed;
        //or
        return data[ptr--];
    }
    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot top from an empty stack");
        }
        return data[ptr];
    }
}
public class Stack {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Cstack stack=new Cstack();
        System.out.println("How many elements do you want to push");
        int n=sc. nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter the element");
            stack.push(sc.nextInt());
        }
        System.out.println(stack.pop());
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//

    }
}
