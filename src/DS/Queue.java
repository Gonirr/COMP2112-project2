package DS;

public class Queue <T>{
    LinkedList <T>list;
    int size;
    T top;

    Queue(){
        list=new LinkedList();
        size=0;
        top=null;
    }

    public void enqueue(T data){
        LLNode node=new LLNode<T>(data);
        list.insertLast(data);
        size++;
        top=data;
    }
    public T dequeue(){
        if(!isEmpty()){
            size--;
            return list.removeFirst();
        }
        if(isEmpty()) top=null;
        return null;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        return false;
    }

    public T peek(){
        return top;
    }
}
