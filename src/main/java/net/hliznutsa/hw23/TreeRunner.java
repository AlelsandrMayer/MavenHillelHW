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

        Tree tree1 = new Tree();
        tree1.add(10);
        tree1.add(5);
        tree1.add(4);
        System.out.println(tree1.contains(0) ? "0 was found" : "0 not found in the tree");
        System.out.println(tree1.contains(0));

    }
}
