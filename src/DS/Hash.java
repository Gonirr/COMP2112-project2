package DS;
//Seperate chain hash
public class Hash{
    LinkedList[] array;
    int N=0;
    public Hash(int capacity){
        array=new LinkedList[capacity];
        for(int i=0;i<array.length;i++){
            array[i]=new LinkedList();
        }
    }

    public void insert(int i,Request data){
        array[i].insertFirst(data);
        N++;
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
        boolean del=array[i].removeNode(data);
        if(del) N++;
        return del;
    }

    public int maxChain(){
        int max=-1;
        for(int i=0;i<array.length;i++){
            if(array[i].chainLength>max) max=array[i].chainLength;
        }
        return max;
    }

    public int loadFactor(){

    }
    
}
