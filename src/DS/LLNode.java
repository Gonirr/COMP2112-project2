package DS;

public class LLNode <T>{
    T data;
    LLNode <T> next;
    LLNode <T> prev;

    public LLNode(T data){
        this.data=data;
        next=null;
    }
    @Override
    public String toString(){
        if(data==null) return "null";
        return data.toString();
    }
}
