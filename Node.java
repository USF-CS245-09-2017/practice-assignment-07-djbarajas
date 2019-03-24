public class Node<T> {
    T data;
    Node next;
    /*
    * node()
    * creates a node with generic data
    * and sets the pointer to the next to null
     */
    public Node(T data){
        this.data = data;
        next = null;
    }
    /*
    * set_next()
    * sets the pointer to the next node
    * to the input node
     */
    public void set_next(Node next){
        this.next = next;
    }

    /*
    * get_next()
    * returns the next node
     */
    public Node get_next(){
        return this.next;
    }

    /*
    *setData()
    * for changing the data in the node if needed
     */
    public void setData(T item){
        this.data = item;
    }
    /*
    *getData()
    * gets whatever object is stored in the
    * node
     */
    public T getData(){
        return this.data;
    }
}
