package com.hari.codingtest.searchalgorithms;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public Stack<Node> elements;

    public static class Node {

        int value;
        List<Node> neighbours = new ArrayList<>();
        boolean visited;

        Node(int value) {
            this.value = value;
        }

        public void addNeighbours(Node node) {
            neighbours.add(node);
        }

        public List<Node> getNeighbours() {
            return neighbours;
        }
    }

    public DepthFirstSearch() {
        this.elements = new Stack<>();
    }

    public void dfsUsingStack(Node node) {

        Stack<Node> stack=new  Stack<>();
        stack.add(node);
        while (!stack.isEmpty())
        {
            Node element=stack.pop();
            if(!element.visited)
            {
                System.out.print(element.value + " ");
                element.visited=true;
            }

            List<Node> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    stack.add(n);
                }
            }
        }
    }

    public void dfsUsingRecursion(Node node) {

        System.out.print(node.value + " ");
        node.visited = true;

        List<Node> nodeNeighbours = node.getNeighbours();
        for (Node nodeNeighbour: nodeNeighbours) {
            if(!nodeNeighbour.visited) {
                dfsUsingRecursion(nodeNeighbour);
            }
        }

    }

    public boolean dfsCustom(Node rootNode, int elementToFind) {
        Stack<Node> stack= new Stack();
        stack.add(rootNode);
        rootNode.visited = true;

        while(!stack.empty()) {
            Node node = stack.pop();
            if(node.value == elementToFind) {
                return true;
            }

            List<Node> adjacentNodesToNode = node.getNeighbours();

            for(Node adjacentNode : adjacentNodesToNode) {
                if(!adjacentNode.visited) {
                    stack.add(adjacentNode);
                    adjacentNode.visited = true;

                }
            }

        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

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

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        System.out.println("Using Iteration :");
        depthFirstSearch.dfsUsingStack(node40);

        node40.visited=false;
        node10.visited=false;
        node20.visited=false;
        node30.visited=false;
        node60.visited=false;
        node50.visited=false;
        node70.visited=false;

        System.out.println("\nUsing Recursion :");
        depthFirstSearch.dfsCustom(node40, node10.value);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode credentialNode = objectMapper.createObjectNode();
        JsonNode addressNode    = objectMapper.createObjectNode();

        if(addressNode.size() == 0) {
            ((ObjectNode) credentialNode).putArray("addresses");
        }
        else {
            ((ObjectNode) credentialNode).putArray("addresses").add(addressNode);
        }

        System.out.println(objectMapper.writeValueAsString(credentialNode));

    }

}
