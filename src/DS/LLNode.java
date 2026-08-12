package DS;

public class LLNode <T>{
    T data;
    LLNode <T> next;
    LLNode <T> prev;

    LLNode(T data){
        this.data=data;
        next=null;
        prev=null;
    }
    @Override
    public String toString(){
        return data.toString();
    }
}
