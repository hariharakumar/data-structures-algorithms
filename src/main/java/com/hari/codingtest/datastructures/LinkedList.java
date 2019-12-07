package com.hari.codingtest.datastructures;

public class LinkedList {

    private Node node;
    private Node firstNode;

    // This adds node at the end
    public void add(Node newNode) {

        if(firstNode == null) {
            firstNode = newNode;
        }
        else {
            this.node.nextNode = newNode;
        }
        this.node = newNode;
    }

    public void addFirst(Node node) {
        if(firstNode != null) {
            node.nextNode = firstNode;
        }
        firstNode = node;
    }

    public void printAll() {
        Node tempNode = firstNode;

        while (tempNode != null) {
            System.out.print(tempNode.value + "  ");
            tempNode = tempNode.nextNode;
        }
    }

    public void removeNode(Node node) {
        Node tempNode = firstNode;
        Node previousNode = firstNode;

        while (tempNode != null) {
            if(tempNode.value == node.value) {
                previousNode.nextNode = tempNode.nextNode;
                break;
            }
            previousNode = tempNode;
            tempNode = tempNode.nextNode;
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node node0 = new Node(10, null);
        Node node1 = new Node(20, null);
        Node node2 = new Node(30, null);

        linkedList.add(node0);
        linkedList.add(node1);
        linkedList.add(node2);

        linkedList.printAll();
        System.out.println();

        Node nodeFirst = new Node(5, null);
        linkedList.addFirst(nodeFirst);

        System.out.println("Added Node 5 at first");

        linkedList.printAll();

        System.out.println();

        linkedList.removeNode(node1);

        System.out.println("After removing node with value 20");
        linkedList.printAll();
    }

}

class Node {
    int value;
    Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
