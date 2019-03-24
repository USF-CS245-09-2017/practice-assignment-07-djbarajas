public class LinkedList<T> implements List<T> {
    int SIZE;
    Node<T> head;
    /*
    *LinkedList()
    * constructor, sets head to null
    * and size to 0
     */
    public LinkedList(){
        head = null;
        SIZE = 0;
    }
    /*
    * add()
    * adds item to the end of the list and
    * if there is no head then sets it to the head
     */
    @Override
    public void add(T item) {
        if(head == null) {
            Node<T> new_Node = new Node(item);
            head = new_Node;
        }
        else{
            Node<T> prev = head;
            for(int i = 0; i < SIZE-1; i++)
                prev = prev.get_next();
            Node<T> new_Node = new Node(item);
            prev.set_next(new_Node);
        }
        SIZE++;
    }

    /*
    * add()
    * adds to any position in the list
    * and modifies the head if needed
     */
    @Override
    public void add(int pos, T item) {
        if (pos==0){
            Node<T> new_Node = new Node(item);
            new_Node.set_next(head);
            head = new_Node;
        }
        else{
            Node prev = head;
            for(int i = 0; i < pos-1;i++)
                prev = prev.get_next();

            Node<T> new_Node = new Node(item);
            new_Node.set_next(prev.get_next());
            prev.set_next(new_Node);

        }
        ++SIZE;
    }
    /*
    * get()
    * gets from a specified position in the list
     */
    @Override
    public T get(int pos) {
        Node get = head;
        for(int i = 0; i < pos;i++)
            get = get.get_next();

        return (T) get.getData();
    }

    /*
    * remove()
    * removes from a certain position in the list
     */
    @Override
    public T remove(int pos) {
        Node<T> prev = head;
        if(pos==0){
            head = head.get_next();
            --SIZE;
            return  prev.getData();
        }

        for(int i = 0; i < pos-1;i++)
            prev = prev.get_next();

        Node<T> toDelete = prev.get_next();
        prev.set_next(toDelete.get_next());
        --SIZE;
        return  toDelete.getData();
    }
    /*
    *size()
    * returns the current size of the list
     */
    @Override
    public int size() {
        return SIZE;
    }
}
