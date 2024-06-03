package LinkedListPractice;

public class DoublyLinkedList 
{
    private int data;
    private Node next;
    private Node prev;

    /** 
     * @param data
    */
    public DoublyLinkedList(int data) 
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}