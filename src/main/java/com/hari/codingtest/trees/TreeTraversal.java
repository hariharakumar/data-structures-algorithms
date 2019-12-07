package com.hari.codingtest.trees;

public class TreeTraversal {

    public static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }

    public void preOrderTraversal(Node node) {

        if(node == null) {
            return;
        }
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {

        if(node == null) {
            return;
        }

        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

        System.out.println(node.value);
    }

    public void inOrderTraversal(Node node) {

        if(node == null) {
            return;
        }

        preOrderTraversal(node.left);
        System.out.println(node.value);
        preOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node nodea  = new Node("a");
        Node nodeb  = new Node("b");
        Node nodec  = new Node("c");
        Node noded  = new Node("d");
        Node nodee  = new Node("e");
        Node nodef  = new Node("f");

        nodea.left = nodeb;
        nodea.right = nodec;

        nodeb.left = noded;
        nodeb.right = nodee;

        noded.left = nodef;

        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.preOrderTraversal(nodea);
        System.out.println("\n");

        treeTraversal.postOrderTraversal(nodea);
    }

}
