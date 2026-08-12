package DS;

public class BSTNode <T> {
    BSTNode <T> left;
    BSTNode <T> right;
    int[] compositeKey;
    T data;
    
    BSTNode(T data,int urgency,int date,int id){
        left=null;
        right=null;
        this.data=data;
        compositeKey=new int[3];
        compositeKey[1]=urgency;
        compositeKey[2]=date;
        compositeKey[3]=id;
    }

    
}
