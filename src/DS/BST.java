package DS;

public class BST <T>{
    private BSTNode <T> root;
    
    public BSTNode createNode(T data,int[] keys){
        return new BSTNode<T>(data, keys[0], keys[1], keys[2]);
    }

    public BSTNode createNode(T data,int key1,int key2,int key3){
        return new BSTNode<T>(data, key1, key2, key3);
    }

    public boolean insert(BSTNode focus,BSTNode node){
        if(root==null) {root=node; return true;}
        for(int i=0;focus!=null&&i<node.compositeKey.length;i++){
            if(focus.compositeKey[i]>node.compositeKey[i]){
                if(focus.left==null) {focus.left=node; return true;} 
                else {
                    return insert(focus.left,node);
                }
            }
            else if(focus.compositeKey[i]<node.compositeKey[i]){
                if(focus.right==null) {focus.right=node; return true;}
                return insert(focus.right,node);
            }
        }
        //the code wont get here since the getRequestIDasInteger() always returns a value unıque to the request
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

    public BSTNode search(BSTNode focus, T data,int[] compositeKey){

        for(int i=0;i<focus.compositeKey.length;i++){
            if(focus.data==data) return focus;
            if(focus.compositeKey[i]>compositeKey[i]){
                return search(focus.left,data,compositeKey);
            }
            else if(focus.compositeKey[i]<compositeKey[i]){
                return search(focus.right,data,compositeKey);
            }
        }
        return null;
    }

    public void delete(T data,int[] compositeKey){
        BSTNode del=search(root,data,compositeKey);
        if(del.left==null&&del.right==null){
            del=null;
        }
    }
}
