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
        String[] newArray = new String[array.length];
        newArray[0] = value;
        System.arraycopy(array, 0, newArray, 1, array.length - 1);
        array = newArray;
        size++;
    }

    @Override
    public void add(String value, int index) {
        if (index < 0) {
            System.err.println("ERROR: Индекс не может быть отрицательным!");
            return;
        } else if (index > size) {
            System.err.println("ERROR: Индекс больше размера: " + size);
            return;
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
            return "ERROR: Не верный индекс. Максимальный индекс: " + (size - 1);
        }
        return array[index];
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index > size) {
            return "ERROR: Не верный индекс. Максимальный индекс: " + size;
        } else if (size == index) {
            removeLast();
            return "Удалён элемент под индексом: " + index;
        }
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        removeLast();
        return "Удалён элемент под индексом: " + index;
    }

    @Override
    public String removeLast() {
        array[size - 1] = null;
        size--;
        return "Удалён элемент , под индексом: " + (size);
    }

    @Override
    public String remove() {
        String[] newArray = new String[array.length];
        String element = array[0];

        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        array = newArray;
        size--;
        return "Удалён элемент: " + element + " , под индексом: " + 0;
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
