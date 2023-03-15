package net.hliznutsa.hw22;

public class MyArrayListRun {
    public static void main(String[] args) {
        MyList arr = new MyArrayList(4);
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("6");
        arr.add("7");

        arr.printAll();
        arr.add("11", 4);
        arr.addLast("22");
        System.out.println();
        arr.printAll();

        arr.remove(4);
        arr.removeLast();
        arr.remove();
        System.out.println();
        arr.printAll();
        System.out.println("\n" + arr.get(5));
        System.out.println(arr.get(-100));

        System.out.println("Size = " + arr.size());

        MyList list = new MyArrayList(0);
        list.add("test");
        list.get(-42);
        list.printAll();
    }
}
