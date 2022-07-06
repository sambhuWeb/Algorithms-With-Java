package com.company.algorithm.Queue.FIFO;

public class ImplementFIFOQueue {
    public static void main(String[] args)
    {
        FIFOQueue q = new FIFOQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println("here: " + q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println("first: " + q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println("second: " +q.Front());
        }
        q.enQueue(4);
        if (!q.isEmpty()) {
            System.out.println("third: " +q.Front());
        }
        q.enQueue(9);
        if (!q.isEmpty()) {
            System.out.println("fourth: " +q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println("Fifth: " + q.Front());
        }
    }
}
