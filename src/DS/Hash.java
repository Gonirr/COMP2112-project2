package DS;
//Seperate chain hash
public class Hash <T>{
    LinkedList[] array;
    
    public Hash(int capacity){
        array=new LinkedList[capacity];
        
    }

    public void insert(int i,T data){
        if(array[i]==null){
            //initialize linkedlist
            array[i]=new LinkedList<>();
        }
        array[i].insertFirst(data);
    }

    
}
