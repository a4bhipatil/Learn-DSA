package Stack;
class Stack1{
    int top=-1;
    int[] stack=new int[5];
    public void push(int n){
        if(top>=5){
            System.out.println("stack is full");
            return;
        }
        top++;
        stack[top]=n;
    }
    public int top(){
        if(top<=0){
            System.out.println("stack is empty");
        }
        return stack[top];
    }
    public void pop(){
        if(top<=0){
            System.out.println("stack is empty");
            return;
        }
        top=top--;
    }
}
public class StackImpUsingArray {
    public static void main(String[] args){
        Stack1 sta =new Stack1();
//        int[] stack={1,2,3,4,5};
        sta.push(1);
        sta.push(5);
        sta.push(3);
        sta.push(6);
        sta.push(7);
        sta.top();
        sta.pop();
    }
}
