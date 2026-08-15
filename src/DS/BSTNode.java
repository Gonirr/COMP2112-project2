package DS;

public class BSTNode <T> {
    BSTNode <T> left;
    BSTNode <T> right;
    int[] compositeKey;
    T data;
    
    public BSTNode(T data,int urgency,int date,int id){
        left=null;
        right=null;
        this.data=data;
        compositeKey=new int[3];
        compositeKey[0]=urgency;
        compositeKey[1]=date;
        compositeKey[2]=id;
    }

    public BSTNode(T data,int[] compositeKey){
        //assuming the given compositeKeys length is 3
        left=null;
        right=null;
        this.data=data;
        this.compositeKey=compositeKey;
    }

    public T getData(){
        return data;
    }

    public String toString(){
        String s=data+": [";
        for(int i=0;i<this.compositeKey.length;i++){
            if(i<this.compositeKey.length-1){
                s=s+this.compositeKey[i]+",";
            }
            else{
                s=s+this.compositeKey[i];
            }
            
        }
        s=s+"]";
        return s;
    }
}
