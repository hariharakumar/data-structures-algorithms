package com.hari.codingtest.datastructures;

// one practical approach is to reverse a string - Tennis balls in a vertical box: LIFO
public class Stack {

    int[] stackElements;
    int index = -1;
    int maxStackSize;

    public Stack(int maxStackSize) {
        stackElements = new int[maxStackSize];
        this.maxStackSize = maxStackSize;
    }

    public void push(int element) {
        // check if array is full - if so no more inserts.
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackElements[++index] = element;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackElements[index--];
    }

    public boolean isEmpty() {
        return index == -1;

        /*if(index == -1) {
            return true;
        }

        return false;*/
    }

    public boolean isFull() {
        return index == maxStackSize -1;

        /*if(index == maxStackSize -1) {
            return true;
        }
        return false;*/
    }

    // print entire stack
    public void view() {

    }

    public static void main(String[] args) {

        Stack stack = new Stack(40);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
