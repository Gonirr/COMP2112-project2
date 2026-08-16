package DS;

public class GenericLLNode <T>{
    T data;
    GenericLLNode <T> next;

    public GenericLLNode(T data){
        this.data=data;
        next=null;
    }
    @Override
    public String toString(){
        if(data==null) return "null";
        return data.toString();
    }
}
