package Queue;
class Q{
    int size=0; int currsize=0; int[] Q; int start=0; int end=0;
    public void push(int n){
        if(currsize==size){
            System.out.println("Queue is full");
        }
        if(currsize==0){
            start=0;
            end=0;
        }
        end=(end+1)%size;
        Q[end]=n;
        currsize+=1;
    }
}
public class Queue1 {
}
