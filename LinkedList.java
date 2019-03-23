public class LinkedList<T> implements List<T> {
    int SIZE = 0;
    Node<T> head = null;

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

    @Override
    public void add(int pos, T item) {
        if (pos==0){
            ++SIZE;
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

            ++SIZE;
        }
    }

    @Override
    public T get(int pos) {
        Node get = head;
        for(int i = 0; i < pos;i++)
            get = get.get_next();
        return (T) get.getData();
    }

    @Override
    public T remove(int pos) {
        if(pos==0){
            Node n = head;
            head = head.get_next();
            --SIZE;
            return (T) n.getData();
        }
        Node prev = head;
        for(int i = 0; i < pos-1;i++)
            prev = prev.get_next();

        Node<T> toDelete = prev.get_next();
        prev.set_next(toDelete.get_next());
        --SIZE;
        return (T) toDelete.getData();
    }

    @Override
    public int size() {
        return SIZE;
    }
}
