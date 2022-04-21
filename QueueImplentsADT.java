
package queue;


public class QueueImplentsADT<Type> implements QueueADT
{
    
    Object[] arrQueue;
    
    byte rear , front , nItems ;
    
  //Constructor  
  public   QueueImplentsADT(int cap)
  {
      
      arrQueue = new Object[cap];
      
      rear = -1 ;
      
      front = 0;
      
      nItems = 0 ; 
      
  }

    @Override
    public void Enqueue(Object item)
    {
        
        if(isFull())
        {
            System.out.println("Queue is OverFlow");
            System.exit(0);
        }
        
        rear++;
        arrQueue[rear] = item;
        nItems++;
        
        
    }//closing of Enqueue

    @Override
    public Object Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is UnderFlow !");
            System.exit(0);
        }
        Object var = arrQueue[front];
        
        front++;
        nItems--;
        
        return var ;
    }

    @Override
    public boolean isFull()
    {
         return nItems == arrQueue.length;
    }

    @Override
    public boolean isEmpty()
    {
        return nItems == 0 ;
    }
    
  
  
    
}//closing of Class
