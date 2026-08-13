package DS;

public class BSTNode <T> {
    BSTNode <T> left;
    BSTNode <T> right;
    int[] compositeKey;
    T data;
    int height;
    
    BSTNode(T data,int urgency,int date,int id){
        left=null;
        right=null;
        this.data=data;
        compositeKey=new int[3];
        compositeKey[0]=urgency;
        compositeKey[1]=date;
        compositeKey[2]=id;
    }

    public T getData(){
        return data;
    }
    
}
