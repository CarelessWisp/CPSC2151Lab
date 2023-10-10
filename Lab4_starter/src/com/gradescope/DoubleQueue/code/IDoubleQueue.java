/**
 * Team member names: Isiah Pham, Korey Bryant, Ben Nazurak, Kaylee Pierce
 */

package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: self is max_queue_size or smaller
 *
 *@defines: max_queue_size
 *
 *@constraints: length of self <= max_queue_size
 *
 */
public interface IDoubleQueue<T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);

    /**dequeueContract
     *
     *
     *@return val the element to be removed
     *
     *@pre None
     *
     *@post self = #self with val removed from the front of queue
     *
     */
    public T dequeue();

    /**lengthContract
     *
     *
     *@return size of the queue
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

     /** peekContract
     *
     * @return val at the left-most position of the queue
     * 
     * @pre None
     *
     * @post self = #self AND result = front position
     *
     */
    default T peek() {
        T result = dequeue();
        enqueue(result);
        for (int i=1; i<length(); i++) {
            T temp = dequeue();
            enqueue(temp);
        }
        return result;
    }
}
