package LinkedListPractice;

public class LinkedList 
{
    private int data;
    private Node head;

    /**
     * @param data This is the constructor that allows us to initialize a
     * general linked list object with a datapoint.
     */
    public LinkedList(int data) 
    {
        this.data = data;
        this.head = null;
    }

    /**
     * @param data This method allows for the input of an integer and
     * will add it to the head of the linked list object.
     */
    public void addToHead(int data) 
    {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) 
        {
            this.head.setNextNode(currentHead);
        }
    }

    /**
     * 
     * @return This will return the data of the removed head.
     */
    public int removeHead() 
    {
        Node removedHead = this.head;
        if (removedHead == null) 
        {
            return 0;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    /**
     * @return This method will print out our linked list object.
     */
    public String printList() 
    {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) 
        {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += " <tail>";
        System.out.println(output);
        return output;
    }
}