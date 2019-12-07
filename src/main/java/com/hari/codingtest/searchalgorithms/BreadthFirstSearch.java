package com.hari.codingtest.searchalgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    /* Logic :
    1. Create empty queue and push root node to it.
    2. Do the following when queue is not empty
        Pop a node from queue and print it.
        Find neighbours of node with the help of adjacency matrix and check if node is already visited or not.
        Push neighbours of node into queue if not null
     */

    public Queue<Node> queue;

    public static class Node {
        int value;
        List<Node> neighbours = new ArrayList<>();
        boolean isVisited;

        public Node(int value) {
            this.value = value;
        }

        public void addneighbours(Node node) {
            this.neighbours.add(node);
        }

        public List<Node> getneighbours() {
            return this.neighbours;
        }
    }

    public BreadthFirstSearch() {
        this.queue = new LinkedList<>();
    }

    public void bfsTraversal(Node node) {
        queue.add(node);
        node.isVisited = true;

        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println("node data : " + element.value);
            List<Node> nodeNeighbours = element.getneighbours();

            for(Node nodeNeighbour : nodeNeighbours) {
                if(nodeNeighbour!= null && !nodeNeighbour.isVisited) {
                    queue.add(nodeNeighbour);
                    nodeNeighbour.isVisited = true;
                }
            }
        }
    }

    public boolean bfs(Node node, int valueToFind) {
        queue.add(node);
        node.isVisited = true;

        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println("node data : " + element.value);
            List<Node> nodeNeighbours = element.getneighbours();

            for(Node nodeNeighbour : nodeNeighbours) {
                if(nodeNeighbour!= null && !nodeNeighbour.isVisited) {
                    queue.add(nodeNeighbour);
                    nodeNeighbour.isVisited = true;
                    if(nodeNeighbour.value == valueToFind) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfsTraversal(node40);

        //System.out.println(breadthFirstSearch.bfs(node40, 100));
    }
}
