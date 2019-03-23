public class Node<T> {
    T data;
    Node next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public void set_next(Node next){
        this.next = next;
    }


    public Node get_next(){
        return this.next;
    }

    public void setData(T item){
        this.data = item;
    }

    public T getData(){
        return this.data;
    }
}
