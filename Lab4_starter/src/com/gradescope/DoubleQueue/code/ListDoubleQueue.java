package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_list_size = maxListSize
 *
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     *
     *
     * @param maxSize max size of the list
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND LQueue = new Double[maxListSize]
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     *
     *
     * @param val
     *
     * @pre |LQueue| < maxListSize
     *
     * @post [LQueue = #LQueue with val added to left-most unoccupied index] AND listMaxSize = #listMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
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
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
