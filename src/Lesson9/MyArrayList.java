package Lesson9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList <T> implements MyList<T> {
    T[] col;
    int size;
    
    private void massiveIsFull(int capacity) {
        if(capacity - col.length > 0) {
            int colCapacity = col.length;
            int newCapacity = colCapacity > 0 ? colCapacity + (colCapacity >> 1) : 30;
            if (newCapacity - capacity < 0) {
                newCapacity = capacity;
            }
            col = Arrays.copyOf(col, newCapacity);
        }
    }

    @Override 
    public int size() {
        return this.size;
    }

    @Override 
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override 
    public boolean contains(Object value) {
            for(int i = 0; i < size; i++) {
            if(value.equals(col[i])) {
                return true;
            }
        }
        return false;
    }

    @Override 
    public boolean add(T value) {
        massiveIsFull(size + 1);
        col[size] = value;
        size++;
        return true;
    }

    @Override 
    public boolean add(int index, T value) {
        massiveIsFull(size + 1);
        System.arraycopy(col, index, col, index + 1, size - index);
        col[index] = value;
        size++;
        return true;
    }

    @Override 
    public boolean remove(Object value) {
        int index = indexOf(col);
        for(int i = 0; i < size; i++) {
            if(value.equals(col[i])){
                for(int j = i; j < size - 1; j++){
                    col[j] = col[j+1];
                }
                col[size - 1] = null;
                size--;
                return true;
            }
        } 
        return false;   
    }

    @Override 
    public boolean addAll(Collection<? extends T> value) {
        if (value.isEmpty()) {
            return false;
        }
        Object[] obj = value.toArray(); 
        int newLength = obj.length;
        massiveIsFull(size + newLength);
        System.arraycopy(obj, 0, col, size, newLength);
        size = size + newLength;
        return true;
    }

    @Override
    public T get(int index) {
        return this.col[index];
    }

    @Override 
    public T remove (int index) {
        T removedValue = (T) col[index];
        int i = size - index - 1;
        if(i > 0) {
            System.arraycopy(col, index + 1, col, index, i);
            }
            col[size - 1] = null;
            size--;
            return removedValue;
    } 
        
    @Override 
    public T set (int index, T value) {
        T setValue = (T) col[index];
        col[index] = value;
        return setValue;

    }

    @Override 
    public int indexOf (Object value) {
        for(int i = 0; i < size; i++) {
            if(Objects.equals(value, col[i])) {
                return i;
            }
        }
        return -1;
    }

    public MyArrayList() {
        col = (T[]) new Object[15]; 
        size = 0;
    }
    public MyArrayList(int capacity) {
        col = (T[]) new Object[capacity];
        size = 0;
    }
    public MyArrayList(MyList<? extends T> col) {
        this(col.size() + 10);
        for(int i = 0; i < col.size(); i++) {
            this.col[i] = col.get(i);
        }
        this.size = col.size();
    }
}

