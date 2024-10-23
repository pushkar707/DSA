import java.util.Optional;

class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;
    
    public MyLinkedList(){
        this.head = null;
    }

    public void append(int num){
        Node node = new Node(num);
        if(this.head == null){
            this.head = node;
            return;
        }

        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }
        
        current.next = node;
    }

    private int count(Node head,int count ){
        if(head == null)
            return count;
        else{
            count++;
            return count(head.next, count); 
        }
    }

    public int count(){
        return count(head, 0);
    }

    private Node reverseRec(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node rest = reverseRec(head.next);

        head.next.next = head;
        head.next = null;

        return rest;
    }

    public void reverseRec(){
        this.head = reverseRec(head);
    }
 
    public void insertAt(int num, int index){
        Node node = new Node(num);
        Node prev = this.head;

        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        while(index > 1 && prev!=null){
            prev = prev.next.next;
            index--;
        }

        if (prev == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        node.next = prev.next;
        prev.next = node;
    }

    public void reverse(){
        Node current = this.head;
        Node next = this.head.next;
        this.head.next = null;
        while(next != null){
            this.head = next;
            next = next.next;
            this.head.next = current;
            current = this.head;
        }
    }
    
    public void del_from_start(){
        this.head = this.head.next;
    }

    public void del_from_end(){
        if(this.head.next == null){
            this.head = null;
            return;
        }

        Node prev = null;
        Node current = this.head;

        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    public String toString(){
        StringBuffer str = new StringBuffer();
        Node current = head;
        while(current != null){
            str.append(current.data + ",");
            current = current.next;
        }
        return str.toString();
    }
}
