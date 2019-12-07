package com.hari.codingtest.datastructures;

// FIFO
/*
   To make it circular queue, reset the writing index to -1 after queue is full first time.
 */
public class Queue {

    // have variables with name : front and rear to be consistent with queue terms
    int[] queueElements;
    int maxSize;
    int writingIndex = -1;
    int readingIndex = 0;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueElements = new int[maxSize];
    }

    public void add(int element) {
        if(isFull()) {
            System.out.println("Queue Full");
            return;
        }
        queueElements[++writingIndex] = element;

    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return queueElements[readingIndex++];
    }

    public boolean isFull() {
        if(writingIndex == maxSize -1) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {

        if(readingIndex == maxSize) {
            return true;
        }
        return false;
    }

    public int peek() {
        return queueElements[readingIndex];
    }

    // print entire queue
    public void view() {
        System.out.print("[");
        for(int i=0 ;i< queueElements.length; i++) {
            System.out.print(queueElements[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.view();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

}
