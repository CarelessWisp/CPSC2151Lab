/**
 * Team member names: Isiah Pham, Korey Bryant, Ben Nazurak, Kaylee Pierce
 */

package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**
 * List implementation for the generic queue.
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**
     * Constructs a new ListDoubleQueue with the maximum size.     
     *
     * @param maxSize [max size of the list]
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND self = new ArrayList<T>[maxListSize]
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<T>();
        this.maxListSize = maxSize;
    }

    /**
     * Enqueues a value to the queue
     *
     * @param val
     *
     * @pre |self| < maxListSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND listMaxSize = #listMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(T t : LQueue)
        {
            ret += ("[" + t + "] ");
        }
        return ret;
    }

}
