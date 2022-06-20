package Task13;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;

public class MyArrayList<T> extends AbstractList<T> implements List<T> {
    private Object[] list;
    private int size;
    private final int defaultSize = 10;

    public MyArrayList() {
        list = new Object[defaultSize];
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index: " + index);
        }
        return (T) list[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T obj) {
        list = ensureCapacity(list);
        list[size++] = obj;

       return true;
    }

    private Object[] ensureCapacity(Object[] list) {
        if (size == list.length) {
            Object[] newList = new Object[list.length * 3/2];
            System.arraycopy(list, 0, newList, 0, list.length);

            return newList;
        }

        return list;
    }

    @Override
    public T remove(int index) {
        T element = get(index);

        deleteElement(index);
        size--;
        
        return element;
    }

    private void deleteElement(int index) {
        System.arraycopy(list, index + 1, list, index, list.length - 1 - index);
    }
}
