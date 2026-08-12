package DS;
//Seperate chain hash
public class Hash <T>{
    LinkedList[] array;
    
    public Hash(int capacity){
        array=new LinkedList[capacity];
    }

    public void insert(int i,T data){
        array[i].insertFirst(data);
    }
}
