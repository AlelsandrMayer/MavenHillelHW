package net.hliznutsa.hw23;

public class Tree {
    private Node root;

    public void add(int value) {
        root = add(value, root);
    }

    private Node add(int value, Node node) {
        if (node == null) {
            return new Node(value);
        } else if (value < node.key) {
            node.left = add(value, node.left);
        } else {
            node.right = add(value, node.right);
        }
        return node;
    }

    public boolean contains(int value) {
        return containsNode(root, value) != null;
    }

    private Integer containsNode(Node node, int value) {
        while (node != null) {
            if (node.key > value) {
                node = node.left;
            } else if (node.key < value) {
                node = node.right;
            } else if (node.key == value) {
                return node.key;
            }
        }
        return null;
    }

    public boolean deleteNode(int value) {
        if (contains(value)) {
            deleteNode(root, value);
            return true;
        } else {
            return false;
        }
    }

    private Node deleteNode(Node node, int value) {
        if (node.key == value) {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node minNodeInRightPartTree = this.findMinElement(node.right);
            node.key = minNodeInRightPartTree.key;
            node.right = this.deleteNode(node.right, minNodeInRightPartTree.key);
            return node;
        }
        if (value < node.key) {
            if (node.left == null) {
                return node;
            }
            node.left = this.deleteNode(node.left, value);
            return node;
        }
        if (value > node.key) {
            if (node.right == null) {
                return node;
            }
            node.right = this.deleteNode(node.right, value);
            return node;
        }
        return null;
    }

    private Node findMinElement(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void print() {
        print(root, " ");
    }

    private void print(Node node, String prefix) {
        if (node == null) {
            return;
        }
        print(node.right, prefix + "     ");
        System.out.println(prefix + "|-" + node.key + "-|");
        print(node.left, prefix + "     ");
    }


    private static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
}

