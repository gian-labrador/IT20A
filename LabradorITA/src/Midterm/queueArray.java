
package Midterm;

public class queueArray {
    
    private int[] queue = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    
    public void enqueue(int value){
        if (size == queue.length){
            System.out.println("Queue is Full!");
            return;
        }
        
        rear++;
        queue[rear] = value;
        size++;
    }
    
    public int dequeue(){
        if (size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        
        int value = queue[front];
        front++;
        size--;
        return value;
    }
    
    public static void main(String[] args){
        queueArray q = new queueArray();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    
}
