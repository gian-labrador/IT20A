
package Prelim;

public class DoublyLinkedlist {
    
    class Node{
        int data;
        Node previous;
        Node next;
        
        Node (int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    Node head;
    void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }
    void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.print("null");      
    }
    public static void main (String[] args){
       DoublyLinkedlist list = new DoublyLinkedlist();
       
       list.add(10);
       list.add(20);
       list.add(30);
       
       list.display();
    }
    
}
