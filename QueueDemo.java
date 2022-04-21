
package queue;


public class QueueDemo
{
    
    public static void main(String[] args)
    {
        
        QueueImplentsADT<Integer> QueueArr = new QueueImplentsADT(4);
        //adding element in Queue
        QueueArr.Enqueue(1);
        
        QueueArr.Enqueue(2);
        
        QueueArr.Enqueue(3);
        
        QueueArr.Enqueue(4);
        
        
        System.out.println("Dequeue Item : " + QueueArr.Dequeue());
        
        System.out.println("Dequeue Item : " + QueueArr.Dequeue());
        
        System.out.println("Dequeue Item : " + QueueArr.Dequeue());
        
        System.out.println("Dequeue Item : " + QueueArr.Dequeue());
        
         System.out.println("Dequeue Item : " + QueueArr.Dequeue());
    }
    
}
