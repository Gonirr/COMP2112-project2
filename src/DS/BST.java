package DS;

public class BST <T>{
    private BSTNode <T> root;
    
    public BSTNode createNode(T data,int key1,int key2,int key3){
        return new BSTNode<T>(data, key1, key2, key3);
    }
    public boolean insert(BSTNode focus,BSTNode node){
        if(root==null) {root=node; return true;}
        for(int i=0;i<node.compositeKey.length;i++){
            if(focus.compositeKey[i]>node.compositeKey[i]){
                if(focus.left==null) {focus.left=node; return true;} 
                else insert(focus.left,node);
            }
            else if(focus.compositeKey[i]<node.compositeKey[i]){
                if(focus.right==null) {focus.right=node; return true;}
                else insert(focus.right,node);
            }
        }
        return false;
    }
    public BSTNode getRoot(){
        return root;
    }

    public void printTree(BSTNode <T> focus){
        Queue q=new Queue<>();
        if(focus!=null){
            q.enqueue(focus.data);
            printTree(focus.left);
            printTree(focus.right);
            System.out.print(q.dequeue());
        }
    }
}
