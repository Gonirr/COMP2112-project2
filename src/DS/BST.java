package DS;

public class BST <T>{
    BSTNode <T> root;
    
    public boolean insert(BSTNode focus,BSTNode data){
        for(int i=0;i<data.compositeKey.length;i++){
            if(focus.compositeKey[i]<data.compositeKey[i]){
                insert(focus.right,data);
            }
            else if(focus.compositeKey[i]>data.compositeKey[i]){
                insert(focus.left,data);
            }
        }
    }
}
