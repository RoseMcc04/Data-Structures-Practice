package LinkedListPractice;

public class Node 
{
    private int data;
    private Node prev;
    private Node next;

    /**
     * @param data This is the constructor that will initialize a Node object.
     */
    public Node(int data) 
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    /**
     * @param node This mutator will allow us to set the next node.
     */
    public void setNextNode(Node node) 
    {
        this.next = node;
    }

    /**
     * @return This accessor will allow us to return the next node.
     */
    public Node getNextNode() 
    {
        return this.next;
    }

    /**
     * @param node This mutator will allow us to set the previous node.
     */
    public void setPreviousNode(Node node) 
    {
        this.prev = node;
    }

    /**
     * @return This accessor will allow us to return the previous node.
     */
    public Node getPreviousNode() 
    {
        return this.prev;
    }
}