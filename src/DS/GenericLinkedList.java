package DS;

public class GenericLinkedList <T> {
    GenericLLNode <T> first;
    GenericLLNode <T> last;

    public void insertFirst(T data){
        if(data==null) return;
        GenericLLNode <T> n=new GenericLLNode(data);
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
        GenericLLNode <T> n=new GenericLLNode(data);
        if(first==null){
            first=n;
            last=n;
            return;
        }
        last.next=n;
        last=n;
    }

    public T removeFirst(){
        GenericLLNode <T> tmp=first;
        first=first.next;
        return tmp.data;
    }
    @Override
    public String toString(){
        GenericLLNode <T> tmp=first;
        String s="";
        while(tmp!=null){
            s=s+"->"+tmp;
            tmp=tmp.next;
        }
        return s;
    }

    public boolean removeNode(T data){
        GenericLLNode <T> prev=first;
        GenericLLNode <T> tmp=first.next;

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
