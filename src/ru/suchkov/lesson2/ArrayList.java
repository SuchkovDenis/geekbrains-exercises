package ru.suchkov.lesson2;

public class ArrayList<E> {
    private E[] array;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 4;

    public ArrayList() {
        capacity = INITIAL_CAPACITY;
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public ArrayList(E... elements) {
        capacity = elements.length > INITIAL_CAPACITY ? elements.length : INITIAL_CAPACITY;
        array = (E[]) new Object[capacity];
        for (int i = 0; i < elements.length; i++)
            array[i] = elements[i];
        size = elements.length;
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index not in range");
        return array[index];
    }

    public void add(E element) {
        if (capacity == size) {
            capacity *= 2;
            E[] newArray = (E[]) new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if (capacity == size) {
            capacity *= 2;
            E[] newArray = (E[]) new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index, newArray, index+1, size-index);
            newArray[index] = element;
            array = newArray;
        }
        size++;
    }

    public void remove(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index not in range");
        if (index < size - 1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        size--;
    }

    public void trimToSize() {
        E[] newArray = (E[]) new Object[size];
        System.arraycopy(array,0, newArray, 0, size);

        array = newArray;
        capacity = size;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            string.append(delimiter).append(array[i]);
            delimiter = " ";
        }
        string.append("]");
        return string.toString();
    }

}
