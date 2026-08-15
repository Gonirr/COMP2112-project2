package DS;
//Seperate chain hash
public class Hash <T>{
    LinkedList[] array;
    
    public Hash(int capacity){
        array=new LinkedList[capacity];
        for(int i=0;i<array.length;i++){
            array[i]=new LinkedList<>();
        }
    }

    public void insert(int i,T data){
        array[i].insertFirst(data);
    }

    public String toString(){
        String s="";
        for(int i=0;i<array.length;i++){
            LLNode tmp=array[i].first;
            s=s+"["+i+"]";
            while(tmp!=null){
                s=s+"->"+tmp;
                tmp=tmp.next;
            }
            s=s+"\n";
        }
        return s;
    }

    public LLNode <T> search(int i,T data){
        LLNode <T> found=null;
        LLNode <T> tmp=array[i].first;
        while(tmp!=null){
            if(tmp.data==data){
                found=tmp;
                return found;
            }
            tmp=tmp.next;
        }
        return found;
    }
    
}
