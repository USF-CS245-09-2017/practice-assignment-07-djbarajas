import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    int MAX ;
    int SIZE ;
    T arr[];

    public ArrayList(){
        MAX = 10;
        SIZE = 0;
        arr =  (T[]) new Object[MAX];
    }

    @Override
    public void add(T item) {
        if(SIZE == MAX) {
            grow();
        }

        arr[SIZE++] = item;
    }

    @Override
    public void add(int pos, T item) {
        if(SIZE == MAX) {
            grow();
        }
        arr[pos] = item;
        ++SIZE;
    }

    @Override
    public T get(int pos) {
        return arr[pos];
    }

    @Override
    public T remove(int pos) {
        T thing = arr[pos];
        --SIZE;
        for(int i = pos; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        return thing;
    }

    @Override
    public int size() {
        return SIZE;
    }

    public void grow(){
        MAX = arr.length*2;
        arr = Arrays.copyOfRange(arr,0, MAX);

    }
}
