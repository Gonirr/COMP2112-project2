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
        return array[i].search(data);
    }

    public boolean remove(int i,T data){
        return array[i].removeNode(data);
    }
    
}
