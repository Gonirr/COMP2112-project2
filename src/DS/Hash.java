package DS;
//Seperate chain hash
public class Hash{
    LinkedList[] array;
    
    public Hash(int capacity){
        array=new LinkedList[capacity];
        for(int i=0;i<array.length;i++){
            array[i]=new LinkedList();
        }
    }

    public void insert(int i,Request data){
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

    public Request search(int ID){
        int i=ID%10;
        return array[i].search(ID);
    }

    public boolean delete(int i,Request data){
        return array[i].removeNode(data);
    }
    
}
