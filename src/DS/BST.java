package DS;

public class BST <T>{
    private BSTNode <T> root;

    public boolean insertFromFocus(BSTNode focus,BSTNode node){
        if(root==null) {
            root=node; return true;
        }
        for(int i=0;focus!=null&&i<node.compositeKey.length;i++){
            if(focus.compositeKey[i]>node.compositeKey[i]){
                if(focus.left==null) {
                    focus.left=node;
                    return true;
                } 
                else {
                    return insertFromFocus(focus.left,node);
                }
            }
            else if(focus.compositeKey[i]<node.compositeKey[i]){
                if(focus.right==null) {
                    focus.right=node;
                    return true;
                }
                return insertFromFocus(focus.right,node);
            }
        }
        //the code wont get here since the getRequestIDasInteger() always returns a value unıque to the request
        return false;
    }


    public boolean insert(BSTNode node){
        return insertFromFocus(root,node);
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
            s=s+d+" , ";
            if(d.left!=null) q.enqueue(d.left);
            if(d.right!=null) q.enqueue(d.right);
        }
        s=s.substring(0, s.length()-3);
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
        if(focus==null) return null;
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

    public boolean delete(BSTNode child){
        if(child==null) return false;
        boolean isLeft=true;
        BSTNode parent=searchParent(root, child, null);
        BSTNode rightSub=child.right;
        BSTNode leftSub=child.left;

        if(parent==null&&child!=root){
            //parent is null bcuz child is not in the bst
            return false;
        }
        else if(parent==null){//deleting root and child==root
            if(child.left!=null){
                parent=child.left;
                leftSub=parent.right;
            }
            else if(child.right!=null){// left=null but right!=null, there is only right subtree
                root=child.right;
                child.right=null;
                return true;
            }
            else{//both left and right are null there is only the root node int he tree
                root=null;
                return true;
            }
        }
        

        if(parent.left==child){
            parent.left=null;
        } 
        else if(parent.right==child){
            parent.right=null;
            isLeft=false;
        }
        //child==parent
        //stays isLeft=true

        if(leftSub!=null){
            BSTNode nextRight=null;//next available right place of the left subtree
            BSTNode tmp=leftSub;
            while(tmp!=null){
                nextRight=tmp;
                tmp=tmp.right;
            }
            nextRight.right=rightSub;
            if(child==root){
                child.left=null;
                child.right=null;
                root=parent;
                return true;
            }
        }

        if(isLeft) {
            parent.left=leftSub;
        }
        else{
            parent.right=leftSub;
        }
        return true;
    }
    
    public int height(BSTNode focus){
        if(focus.left==null&&focus.right==null){
            return 0;
        }
        return Math.max(height(focus.left), height(focus.right))+1;
    }
}
