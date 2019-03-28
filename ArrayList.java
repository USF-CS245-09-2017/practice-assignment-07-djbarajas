import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    int SIZE ;
    T arr[];
    /*
    * ArrayList()
    * constructor, creates an Arraylist of size 10
    * with SIZE being the amount of elements that are
    * actually in the list
     */
    public ArrayList(){
        SIZE = 0;
        arr =  (T[]) new Object[10];
    }
    /*
    * add()
    * if the size is equal to the actual length
    * then grow the array, otherwise ass the item
    * and increment size
     */
    @Override
    public void add(T item) {
        if(SIZE == arr.length) {
            grow();
        }

        arr[SIZE++] = item;
    }
    /*
    * add()
    * again grow the array if it reaches a limit
    * otherwise add the item at a position and increment size
     */
    @Override
    public void add(int pos, T item) {
        if(SIZE == arr.length) {
            grow();
        }
        arr[pos] = item;
        ++SIZE;
    }
    /*
    * get()
    * gets the value stored in the position
     */
    @Override
    public T get(int pos) {
        return arr[pos];
    }
    /*
    * remove()
    * removes the element then copies every element
    * after to the position before it
     */
    @Override
    public T remove(int pos) {
        T thing = arr[pos];
        --SIZE;
        for(int i = pos; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        return thing;
    }
    /*
    * size()
    * returns the amount of elements in the arraylist
     */
    @Override
    public int size() {
        return SIZE;
    }
    /*
    * grow()
    * grows by copying the array to another double the size
     */

    public void grow(){
        arr = Arrays.copyOfRange(arr,0, arr.length*2);

    }
}
