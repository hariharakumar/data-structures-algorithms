package com.hari.codingtest.searchalgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchPractice {

    Queue<Node> queue;

    public BreadthFirstSearchPractice() {
        this.queue = new LinkedList<>();
    }

    public static class Node {
        int value;
        List<Node> neighbourNodes = new ArrayList<>();
        boolean isVisited;

        public Node(int value) {
            this.value = value;
        }

        public List<Node> getNeighbourNodes() {
            return neighbourNodes;
        }

        public void addNeighbours(Node node) {
            neighbourNodes.add(node);
        }
    }

    public void bfs(Node startingNode) {
        queue.add(startingNode);
        startingNode.isVisited = true;

        while(!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println("Value : " + element.value);

            List<Node> elementNeighbourNodes = element.getNeighbourNodes();
            for (Node elementNeighbourNode: elementNeighbourNodes) {
                if(elementNeighbourNode!= null && !elementNeighbourNode.isVisited) {
                    queue.add(elementNeighbourNode);
                    elementNeighbourNode.isVisited = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node60 = new Node(60);
        Node node70 = new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);

        BreadthFirstSearchPractice breadthFirstSearchPractice = new BreadthFirstSearchPractice();
        breadthFirstSearchPractice.bfs(node40);


    }

}
