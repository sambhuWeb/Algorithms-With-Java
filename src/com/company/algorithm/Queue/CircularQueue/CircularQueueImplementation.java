package com.company.algorithm.Queue.CircularQueue;

public class CircularQueueImplementation
{
    public static void main(String[] args)
    {
        CircularQueue cq = new CircularQueue(3);
        cq.enQueue(1);
        output(cq);

        cq.enQueue(2);
        output(cq);

        cq.enQueue(3);
        output(cq);

        cq.enQueue(4);
        output(cq);

        System.out.println("Rear Item " + cq.rear());
        System.out.println("Is Full " + cq.isFull());

        cq.deQueue();

        cq.enQueue(4);

        System.out.println("First Item " + cq.front());
        System.out.println("Rear Item " + cq.rear());

        cq.deQueue();
        System.out.println("First Item " + cq.front());
        System.out.println("Rear Item " + cq.rear());

        cq.deQueue();
        System.out.println("First Item " + cq.front());
        System.out.println("Rear Item " + cq.rear());

        cq.deQueue();
        System.out.println("First Pointer " + cq.frontPointer());
        System.out.println("Rear Pointer " + cq.rearPointer());
        try {
            System.out.println("First Item " + cq.front());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Rear Item " + cq.rear());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        cq.enQueue(6);

        System.out.println("First Item " + cq.front());
        System.out.println("Rear Item " + cq.rear());





//        cq.deQueue();
//        output(cq);
//
//        cq.enQueue(9);
//        output(cq);
//
//        cq.deQueue();
//        output(cq);
    }

    private static void output(CircularQueue cq)
    {
//        System.out.println("Size of circular queue " + cq.getSize());
        System.out.println("First Pointer " + cq.frontPointer());
        System.out.println("Rear Pointer " + cq.rearPointer());
        System.out.println("First Item " + cq.front());
        System.out.println("Last Item " + cq.rear());
        System.out.println("Is Full " + cq.isFull());
        System.out.println("-----------------------------");
    }
}
