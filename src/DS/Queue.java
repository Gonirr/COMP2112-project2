package DS;

public class Queue <T>{
    GenericLinkedList <T> list;
    int size;
    T top;

    public Queue(){
        list=new GenericLinkedList();
        size=0;
        top=null;
    }

    public void enqueue(T data){
        GenericLLNode <T> node=new GenericLLNode<T>(data);
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
