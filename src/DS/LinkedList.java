package DS;

public class LinkedList <T>{
    LLNode <T> first;
    LLNode <T> last;

    public void insertFirst(T data){
        LLNode n=new LLNode(data);
        if(first==null){
            first=n;
            last=n;
            return;
        }
        n.next=first;
        first=n;
    }

    public void insertLast(T data){
        LLNode n=new LLNode(data);
        if(first==null){
            first=n;
            last=n;
            return;
        }
        last.next=n;
        last=n;
    }

    public T removeFirst(){
        LLNode tmp=first;
        first=first.next;
        return (T)tmp.data;
    }
    @Override
    public String toString(){
        LLNode tmp=first;
        String s="";
        while(tmp!=null){
            s=s+"->"+tmp;
            tmp=tmp.next;
        }
        return s;
    }
}
