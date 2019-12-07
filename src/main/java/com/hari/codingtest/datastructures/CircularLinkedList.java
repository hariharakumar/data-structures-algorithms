package com.hari.codingtest.datastructures;

public class CircularLinkedList {

    private NodeCll node;
    private NodeCll firstNode;

    // This adds node at the end
    public void add(NodeCll newNode) {

        if(firstNode == null) {
            firstNode = newNode;
            firstNode.nextNode = firstNode;
        }
        else {
            this.node.nextNode = newNode;
            newNode.nextNode = firstNode;
        }
        this.node = newNode;
    }

    public void printAll() {
        NodeCll tempNode = firstNode;

        do {
            System.out.print(tempNode.value + "  ");
            tempNode = tempNode.nextNode;
        } while(tempNode == firstNode);
    }

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();

        NodeCll node0 = new NodeCll(10, null);
        NodeCll node1 = new NodeCll(20, null);
        NodeCll node2 = new NodeCll(30, null);

        circularLinkedList.add(node0);
        circularLinkedList.add(node1);
        circularLinkedList.add(node2);

        circularLinkedList.printAll();
    }
}

class NodeCll {
    int value;
    NodeCll nextNode;

    public NodeCll(int value, NodeCll nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}