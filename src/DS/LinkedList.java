package DS;

public class LinkedList <T>{
    LLNode <T> first;
    LLNode <T> last;

    public void insertFirst(T data){
        if(data==null) return;
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
        if(data==null) return;
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

    public LLNode <T> search(T data){
        LLNode <T> found=null;
        LLNode <T> tmp=first;
        while(tmp!=null){
            if(tmp.data==data){
                found=tmp;
                return found;
            }
            tmp=tmp.next;
        }
        return found;
    }

    public boolean removeNode(T data){
        LLNode <T> prev=first;
        LLNode <T> tmp=first.next;

        if(first == null){
            return false;
        }

        while(tmp!=null){
            if(tmp.data==data){
                prev.next=tmp.next;
                return true;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        return false;
    }

}
