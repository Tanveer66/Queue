
package queue;


public interface QueueADT<Type>
{
    
    void Enqueue(Type item);
    
    Type Dequeue();
    
    boolean isFull();
    
    boolean isEmpty();
    
}
