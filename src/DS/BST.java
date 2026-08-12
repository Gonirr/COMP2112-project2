package DS;

public class BST <T>{
    private BSTNode <T> root;
    
    public BSTNode createNode(T data,int key1,int key2,int key3){
        return new BSTNode<T>(data, key1, key2, key3);
    }
    public boolean insert(BSTNode focus,BSTNode node){
        if(root==null) {root=node; return true;}
        for(int i=0;focus!=null&&i<node.compositeKey.length;i++){
            if(focus.compositeKey[i]>node.compositeKey[i]){
                if(focus.left==null) {focus.left=node; return true;} 
                else {
                    if(insert(focus.left,node)){
                        return true;
                    }
                }
            }
            else if(focus.compositeKey[i]<node.compositeKey[i]){
                if(focus.right==null) {focus.right=node; return true;}
                if(insert(focus.right,node)){
                        return true;
                    }
            }
            else{}
        }
        return false;
    }
    public BSTNode getRoot(){
        return root;
    }

    public void printTree(BSTNode <T> focus){
        //level order traversal
        Queue<BSTNode> q=new Queue<>();
        q.enqueue(focus);
        while(!q.isEmpty()){
            BSTNode<T> d=(BSTNode)q.dequeue();
            System.out.print(d.data+",");
            if(d.left!=null) q.enqueue(d.left);
            if(d.right!=null) q.enqueue(d.right);
            
        }
    }
}
