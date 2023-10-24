/**
 * Team member names: Isiah Pham, Korey Bryant, Ben Nazurak, Kaylee Pierce
 */

package com.gradescope.DoubleQueue.code;

import java.lang.reflect.Array;

/**
 * Array implementation for the generic queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue<T> implements IDoubleQueue<T>
{
    private T[] queue;
    private int queueMaxSize;

    /**
     * Constructor for ArrayDoubleQueue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new T[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queue = (T[])new Object[maxSize];
        queueMaxSize = maxSize;
    }

    /**
     * Enqueue adds an item to the queue.
     *
     * @param val the element to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        for (int i = 0; i < queueMaxSize; i++)
        {
            if (queue[i] == null)
            {
                queue[i] = val;
                i = queueMaxSize;
            }
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        T temp = queue[0];
        for (int i=1; i<queueMaxSize; i++) {
            queue[i-1] = queue[i];
        }
        queue[queueMaxSize-1] = null;
        return temp;
    }

    @Override
    public int length()
    {
        int i=-1;
        do {
            i++;
        } while (queue[i]!=null);
        return i;
    }

    public String toString()
    {
        String ret = "";
        for(T t : queue)
        {
            ret += ("[" + t + "] ");
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public T[] getQueue()
    {
        return this.queue;
    }
}
