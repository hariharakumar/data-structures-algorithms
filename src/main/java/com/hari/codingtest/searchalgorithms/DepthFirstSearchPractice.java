package com.hari.codingtest.searchalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchPractice {

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

    Stack<Node> stack;

    public void dfs(Node node) {

        stack = new Stack<>();
        stack.add(node);

        while (!stack.isEmpty()) {
            Node element = stack.pop();
            if(!element.isVisited)
            {
                System.out.print(element.value + " ");
                element.isVisited=true;
            }

            List<Node> elementNeighbourNodes = element.getNeighbourNodes();
            for (Node elementNeighbourNode: elementNeighbourNodes) {
                if(elementNeighbourNode!= null && !elementNeighbourNode.isVisited) {
                    stack.add(elementNeighbourNode);
                }
            }
        }

    }

    public void dfs1(Node node) {

        stack = new Stack<>();
        stack.add(node);
        node.isVisited = true;

        while (!stack.isEmpty()) {
            Node element = stack.pop();

            System.out.print(element.value + " ");


            List<Node> elementNeighbourNodes = element.getNeighbourNodes();
            for (Node elementNeighbourNode: elementNeighbourNodes) {
                if(elementNeighbourNode!= null && !elementNeighbourNode.isVisited) {
                    stack.add(elementNeighbourNode);
                    elementNeighbourNode.isVisited = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        DepthFirstSearchPractice.Node node10 = new DepthFirstSearchPractice.Node(10);
        DepthFirstSearchPractice.Node node20 = new DepthFirstSearchPractice.Node(20);
        DepthFirstSearchPractice.Node node30 = new DepthFirstSearchPractice.Node(30);
        DepthFirstSearchPractice.Node node40 = new DepthFirstSearchPractice.Node(40);
        DepthFirstSearchPractice.Node node50 = new DepthFirstSearchPractice.Node(50);
        DepthFirstSearchPractice.Node node60 = new DepthFirstSearchPractice.Node(60);
        DepthFirstSearchPractice.Node node70 = new DepthFirstSearchPractice.Node(70);

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

        DepthFirstSearchPractice depthFirstSearchPractice = new DepthFirstSearchPractice();
        depthFirstSearchPractice.dfs(node40);

        node40.isVisited=false;
        node10.isVisited=false;
        node20.isVisited=false;
        node30.isVisited=false;
        node60.isVisited=false;
        node50.isVisited=false;
        node70.isVisited=false;

        System.out.println("\n");

        depthFirstSearchPractice.dfs1(node40);

    }
}
