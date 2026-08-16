package DS;

public class LinkedList {
    LLNode first;
    LLNode last;
    int chainLength=0;

    public void insertFirst(Request data){
        if(data==null) return;
        LLNode n=new LLNode(data);
        if(first==null){
            first=n;
            last=n;
            return;
        }
        n.next=first;
        first=n;
        chainLength++;
    }

    public void insertLast(Request data){
        if(data==null) return;
        LLNode n=new LLNode(data);
        if(first==null){
            first=n;
            last=n;
            return;
        }
        last.next=n;
        last=n;
        chainLength++;
    }

    public Request removeFirst(){
        LLNode tmp=first;
        first=first.next;
        chainLength--;
        return tmp.data;
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

    public Request search(int ID){
        LLNode tmp=first;
        while(tmp!=null){
            if(ID==tmp.data.getIDasInt()) return tmp.data;
            tmp=tmp.next;
        }
        return null;
    }

    public boolean removeNode(Request data){
        LLNode prev=first;
        LLNode tmp=first.next;

        if(first == null){
            return false;
        }

        while(tmp!=null){
            if(tmp.data==data){
                prev.next=tmp.next;
                chainLength--;
                return true;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        return false;
    }

}
