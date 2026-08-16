package DS;

public class LinkedList {
    LLNode first;
    LLNode last;

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
    }

    public Request removeFirst(){
        LLNode tmp=first;
        first=first.next;
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

<<<<<<< HEAD
    public boolean removeNode(T data){
        LLNode <T> prev=first;
        LLNode <T> tmp=first.next;

        if(first == null){
            return false;
        }

=======
    public boolean removeNode(Request data){
        LLNode prev=null;
        LLNode tmp=first;
>>>>>>> 88d44a0 (made it not generic cuz that caused problems and redid search didnt test)
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
