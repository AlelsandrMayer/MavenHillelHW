package net.hliznutsa.hw22;

public class MyArrayList implements MyList {
    private int size = 0;
    private int capacity;
    private final int CAPACITY = 10;
    private String[] array;

    public MyArrayList() {
        capacity = CAPACITY;
        array = new String[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = new String[capacity];
    }

    private boolean ensureCapacity() {
        if (array[capacity - 1] != null) {
            increaseCapacity();
            return true;
        }
        return false;
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        String[] newArray = new String[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void add(String value) {
        String[] newArray = new String[capacity];
        if (value == null) {
            return;
        } else if (ensureCapacity()) {
            add(value);
            return;
        }

        newArray[0] = value;
        System.arraycopy(array, 0, newArray, 1, array.length - 1);
        array = newArray;
    }

    @Override
    public void add(String value, int index) {
        String[] newArray = new String[capacity];
        if (value == null) {
            return;
        } else if (ensureCapacity()) {
            add(value, index);
            return;
        } else if (array.length < index || array[index - 1] == null) {
            throw new ArrayIndexOutOfBoundsException("Вышел за границы коллекции");
        } else if (array[index - 1] != null) {
            addLast(value);
            return;
        }
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index - 1);
        array = newArray;
    }

    @Override
    public void addLast(String value) {
        if (value == null) {
            return;
        } else if (ensureCapacity()) {
            addLast(value);
            return;
        }
        size = size();
        array[size] = value;
    }


    @Override
    public String get(int index) {
        if ((array.length - 1) < index || array[index] == null) {
            throw new ArrayIndexOutOfBoundsException("Нет элемента под таким индексом");
        }
        return array[index];
    }

    @Override
    public String remove(int index) {
        String[] newArray = new String[capacity];
        if (array.length < index || array[index - 1] == null) {
            throw new ArrayIndexOutOfBoundsException("Ячейка пустая");
        }
        String element = array[index];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;

        return "Удалён элемент: " + element + " , под индексом: " + index;
    }

    @Override
    public String removeLast() {
        size = size();
        String element = array[size - 1];
        array[size - 1] = null;
        return "Удалён элемент: " + element + " , под индексом: " + (size - 1);

    }

    @Override
    public String remove() {
        String[] newArray = new String[capacity];
        String element = array[0];

        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        array = newArray;
        return "Удалён элемент: " + element + " , под индексом: " + 0;
    }

    @Override
    public int size() {
        size = 0;
        for (String arr : array) {
            if (arr != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public void printAll() {
        for (String arr : array) {
            if (arr != null) {
                System.out.print(arr + " , ");
            }
        }
    }
}
