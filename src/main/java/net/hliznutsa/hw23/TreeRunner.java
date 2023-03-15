package net.hliznutsa.hw23;


public class TreeRunner {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(5);
        tree.add(4);
        tree.add(18);
        tree.add(15);
        tree.add(13);
        tree.add(9);
        tree.add(8);
        tree.add(14);
        tree.print();
        System.out.println(tree.contains(13));
        System.out.println(tree.contains(10));
        System.out.println(tree.contains(20));
        System.out.println(tree.contains(1));
        tree.deleteNode(13);
        tree.deleteNode(5);
        tree.print();

    }
}
