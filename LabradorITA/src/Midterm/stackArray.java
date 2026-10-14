
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
    
    public void push(int value){
        if (top == capacity - 1){
            System.out.println("Stack is full");
            
            return;
        }
        stack[++top] = value;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }
    
    public void display(){
        if (top == -1){
            System.out.println("Stack is empty");
            return;
            
        }
        for (int i = top; i >= 0; i --){
            System.out.println(stack[i]);
        }
    }
    
    public static void main(String[] args){
        stackArray stack = new stackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top Element: " + stack.peek());
        System.out.println();
        
        System.out.println("Remove: " + stack.pop());
        System.out.println();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println();
        
        stack.display();
        
    }
}