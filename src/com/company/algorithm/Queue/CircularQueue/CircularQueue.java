package com.company.algorithm.Queue.CircularQueue;

import java.util.ArrayList;
import java.util.List;

public class CircularQueue
{
    // 1. Store Element
    private int[] data;

    private int pointerFront;

    private int pointerBack;

    private final int sizeOfQueue;

    public CircularQueue(int sizeOfQueue)
    {
        data = new int[sizeOfQueue];
        pointerBack = -1;
        pointerFront = -1;
        this.sizeOfQueue = sizeOfQueue;
    }

    public int frontPointer()
    {
        return pointerFront;
    }

    public int rearPointer()
    {
        return pointerBack;
    }

    public int front()
    {
        if (isEmpty()) {
            throw new RuntimeException("xxx Could not output Front Value as The queue is Empty xxx");
        }

        return data[pointerFront];
    }

    public int rear()
    {
        if (isEmpty()) {
            throw new RuntimeException("xxx Could not output Rear Value as The queue is Empty xxx");
        }

        return data[pointerBack];
    }

    public boolean enQueue(int value)
    {
        if (isFull()) {
            System.out.println("xxx The queue is full xxx");
            return false;
        }

        if (isEmpty()) {
            System.out.println("xxx The queue is full xxx");

            this.pointerFront = 0;
        }

        System.out.println("^^^ Add to a queue ^^^");

        pointerBack = (pointerBack + 1) % sizeOfQueue;
        data[pointerBack] = value;

        return true;
    }

    public boolean deQueue()
    {
        if (isEmpty()) {
            System.out.println("xxx Cannot remove the queue is Empty xxx");
            return false;
        }

        System.out.println("^^^ Removed from a queue ^^^");

        if (pointerFront == pointerBack) {
            pointerFront = -1;
            pointerBack = -1;
            return true;
        }

        pointerFront = (pointerFront + 1) % sizeOfQueue;
        return true;
    }

    public boolean isEmpty()
    {
        return pointerBack == -1 || pointerFront == -1;
    }

    public boolean isFull()
    {
        return (pointerBack + 1) % sizeOfQueue == pointerFront;
    }
}
