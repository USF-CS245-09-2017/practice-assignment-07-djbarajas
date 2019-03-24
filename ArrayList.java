import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    int SIZE ;
    T arr[];

    public ArrayList(){
        SIZE = 0;
        arr =  (T[]) new Object[10];
    }

    @Override
    public void add(T item) {
        if(SIZE == arr.length) {
            grow();
        }

        arr[SIZE++] = item;
    }

    @Override
    public void add(int pos, T item) {
        if(SIZE == arr.length) {
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
        arr = Arrays.copyOfRange(arr,0, arr.length*2);

    }
}
