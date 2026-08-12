package DS;

public class LinkedList <T>{
    LLNode <T> first;
    public void insertFirst(T data){
        LLNode n=new LLNode(data);
        if(first==null){
            first=n;
            return;
        }
        n.next=first;
        first=n;
    }
}
