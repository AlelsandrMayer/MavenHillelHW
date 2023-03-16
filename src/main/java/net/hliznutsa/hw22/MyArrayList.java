package net.hliznutsa.hw22;

public class MyArrayList implements MyList {
    private int size = 0;
    private String[] array;

    public MyArrayList() {
        array = new String[8];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            array = new String[8];
        } else {
            array = new String[capacity];
        }
    }

    private void checkCapacity() {
        if (size >= array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public void add(String value) {
        checkCapacity();
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = value;
        size++;
    }

    @Override
    public void add(String value, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        } else if (index == size) {
            addLast(value);
            return;
        }
        checkCapacity();

        String[] newArray = new String[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index - 1);
        array = newArray;
        size++;
    }

    @Override
    public void addLast(String value) {
        checkCapacity();
        array[size] = value;
        size++;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        }
        return array[index];
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index > size || size == 0) {
            throw new ArrayIndexOutOfBoundsException("Incorrect index");
        } else if (size == index) {
            return removeLast();
        }
        String result = array[index];
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        array[size - 1] = null;
        size--;
        return result;
    }

    @Override
    public String removeLast() {
        String result = array[size - 1];
        array[size - 1] = null;
        size--;
        return result;
    }

    @Override
    public String remove() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("MyArrayList size = " + size);
        }
        String result = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        size--;
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " , ");
        }
    }
}
