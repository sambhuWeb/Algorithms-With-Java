package com.company.algorithm.Queue.CircularQueue;

import java.util.ArrayList;
import java.util.List;

public class CircularQueue
{
    // 1. Store Element
    private List<Integer> data;

    private int pointerFront;

    private int pointerBack;

    private final int sizeOfQueue;

    public CircularQueue(int sizeOfQueue)
    {
        data = new ArrayList<Integer>(sizeOfQueue);
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

        return data.get(pointerFront);
    }

    public int rear()
    {
        if (isEmpty()) {
            throw new RuntimeException("xxx Could not output Rear Value as The queue is Empty xxx");
        }

        return data.get(pointerBack);
    }

    public boolean enQueue(int value)
    {
        if (isFull()) {
            System.out.println("xxx The queue is full xxx");
            return false;
        }

        System.out.println("^^^ Add to a queue ^^^");


        data.add(value);

        if (pointerFront < 0) {
            pointerFront++;
        }
        pointerBack++;
        return true;
    }

    public boolean deQueue()
    {
        if (isEmpty()) {
            System.out.println("xxx Cannot remove the queue is Empty xxx");
            return false;
        }
        System.out.println("^^^ Removed from a queue ^^^");

        pointerFront++;
        if (pointerFront > pointerBack) {
            pointerFront = -1;
            pointerBack = -1;
        }
        return true;
    }

    public boolean isEmpty()
    {
        return pointerBack == -1 || pointerFront == -1;
    }

    public boolean isFull()
    {
        return pointerBack - pointerFront >= this.sizeOfQueue - 1;
    }

    public int getSize()
    {
        return data.size();
    }
}
