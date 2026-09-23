
package Midterm;


public class stackArray {
    private int[] stack;
    private int top;
    private int capacity;
    
    
    public stackArray(int capacity){
        this.capacity = capacity;
        this.stack = new int [capacity];
        this.top = -1;
    }
    
    public static void main(String[] args){
        stackArray stack = new stackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("Peek: " + stack.isEmpty());
        System.out.println("Peek: " + stack.isFull());
        
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        
        int value = stack[top];
        top--;
        return value;
    }
    
    public boolean isFull(){
        return top == capacity -1;
    }
}
