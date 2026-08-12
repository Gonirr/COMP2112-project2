package DS;

public class Queue <T>{
    LinkedList list=new LinkedList();
    int size=0;
    public void enqueue(T data){
        LLNode node=new LLNode<T>(data);
        list.insertLast(data);
        size++;
    }
    public LLNode dequeue(){
        if(!isEmpty()){
            size--;
            return list.removeFirst();
        }
        return null;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
}
