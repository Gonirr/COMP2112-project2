package DS;
public class LLNode{
    Request data;
    LLNode next;
    LLNode prev;

    public LLNode(Request data){
        this.data=data;
        next=null;
    }
    @Override
    public String toString(){
        if(data==null) return "null";
        return data.toString();
    }
}
