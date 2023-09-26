/**
 * Team member names: Isiah Pham, Korey Bryant, Ben Nazurak, Kaylee Pierce
 */

package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: Queue is MAX_SIZE or smaller
 *
 *@defines: queue, MAX_SIZE
 *
 *@constraints: length of self <= MAX_SIZE
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     *
     *@return val the Double to be removed
     *
     *@pre None
     *
     *@post self = #self with val removed from the front of queue
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return size of the list queue
     *
     *@pre None
     *
     *@post length = self size
     *
     */
    public int length();

    /**toStringContract
     *
     *
     *@return queue as a String
     *
     *@pre None
     *
     *@post self = String queue
     *
     */
    public String toString();
}
