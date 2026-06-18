package Stack;

public class DynamicStack extends Cstack {
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int n){
        if(this.isFull()){
            //double the array
            int[] temp=new int[data.length*2];
            //copy all the previous items in new data
            for(int i=0; i<data.length; i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(n);
    }
}
