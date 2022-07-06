package com.company.algorithm.Queue.FIFO;

import java.util.ArrayList;
import java.util.List;

public class FIFOQueue
{
    // 1. Store Element
    private List<Integer> data;

    // Start position pointer
    private int pFrontOrHead;

    public FIFOQueue()
    {
        data = new ArrayList<Integer>();
        pFrontOrHead = 0;
    }

    /**
     * Return true if item have been added or enQueued into the queue
     * @param num
     */
    public boolean enQueue(int num)
    {
        data.add(num);
        System.out.println("** pFront Or Head : " + pFrontOrHead);
        System.out.println("** Data size : " + data.size());
        System.out.println("++++++++++++++");

        return true;
    }

    /**
     * Return ture if element have been deleted from the queue
     */
    public boolean deQueue()
    {
        if (isEmpty() == true)
        {
            return false;
        }
        pFrontOrHead++;
        System.out.println("-- pFront Or Head : " + pFrontOrHead);
        System.out.println("-- Data size : " + data.size());
        System.out.println("---------------------------");

        return true;
    }

    /**
     * Get the front item from the queue
     * @return
     */
    public int Front()
    {
        System.out.println("FF pFront Or Head : " + pFrontOrHead);
        System.out.println("FF Data size : " + data.size());
        System.out.println("FFFFFFFFFFFFF");
        return data.get(pFrontOrHead);
    }

    public boolean isEmpty()
    {
        System.out.println("== pFront Or Head : " + pFrontOrHead);
        System.out.println("== Data size : " + data.size());
        System.out.println("==============================");
        return pFrontOrHead >= data.size();
    }
}
