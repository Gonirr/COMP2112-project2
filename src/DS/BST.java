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
        if(root==null) {
            node.height=0;
            root=node; return true;
        }
        for(int i=0;focus!=null&&i<node.compositeKey.length;i++){
            if(focus.compositeKey[i]>node.compositeKey[i]){
                if(focus.left==null) {
                    node.height=focus.height+1;
                    focus.left=node;
                    return true;
                } 
                else {
                    return insert(focus.left,node);
                }
            }
            else if(focus.compositeKey[i]<node.compositeKey[i]){
                if(focus.right==null) {
                    node.height=focus.height+1;
                    focus.right=node;
                    return true;
                }
                return insert(focus.right,node);
            }
        }
        //the code wont get here since the getRequestIDasInteger() always returns a value unıque to the request
        return false;
    }

    public BSTNode getRoot(){
        return root;
    }

    public String toString(){
        //level order traversal
        String s="";
        Queue<BSTNode> q=new Queue<>();
        q.enqueue(root);
        while(!q.isEmpty()){
            BSTNode d=(BSTNode)q.dequeue();
            BSTNode t=(BSTNode)q.peek();
            if(d.height==0) s=s+d+"\n";
            else if(d.height==t.height) s=s+d+" , ";
            else s=s+d+"\n";
            if(d.left!=null) q.enqueue(d.left);
            if(d.right!=null) q.enqueue(d.right);
        }
        return s;
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

    private BSTNode searchParent(BSTNode focus, BSTNode child,BSTNode parent){
        for(int i=0;i<focus.compositeKey.length;i++){
            if(focus==child) return parent;
            if(focus.compositeKey[i]>child.compositeKey[i]){
                return searchParent(focus.left,child,focus);
            }
            else if(focus.compositeKey[i]<child.compositeKey[i]){
                return searchParent(focus.right,child,focus);
            }
        }
        return null;
    }

    public void delete(BSTNode child){
        BSTNode parent=searchParent(root, child, null);
        BSTNode rightSub=child.right;
        BSTNode leftSub=child.left;
        if(parent.left==child) parent.left=null;
        else if(parent.right==child) parent.right=null;
        parent.left=leftSub;
        BSTNode focus=leftSub;
        while(focus.right!=null){
            focus=focus.right;
        }
        focus.right=rightSub;
    }
    
}
