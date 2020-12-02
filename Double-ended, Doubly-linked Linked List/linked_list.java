import java.util.Iterator;

public class linked_list
{
    private list_node head;
    private list_node tail;

    //List node
    private class list_node
    {
        private Object value;
        private list_node prev;
        private list_node next;

        public list_node(Object value)
        {
            this.value = value;
            prev = null;
            next = null;
        }

        /* Accessors */
        public Object getValue() { return value; }
        public list_node getPrev() { return prev; }
        public list_node getNext() { return next; }

        /* Mutators */
        public void setValue(Object value) { this.value = value; }
        public void setPrev(list_node node) { prev = node; }
        public void setNext(list_node node) { next = node; }
    }

    //Iterator
    private class iterator implements Iterator
    {
        private list_node next;

        public iterator(linked_list list)
        {
            next = list.head;
        }

        public boolean hasNext() { return next != null; }
        public Object next()
        {
            Object value = null;
            if (next != null)
            {
                value = next.getValue();
                next = next.getNext();
            }

            return value;
        }
    }

    public linked_list()
    {
        head = null;
        tail = null;
    }

    /* Checks if list is empty */
    public boolean isEmpty()
    {
        boolean isEmpty = false;
        if (head == null)
        {
            isEmpty = true;
        }

        return isEmpty;
    }

    /* Returns value in head node */
    public Object peekFirst()
    {
        Object value = null;
        if (isEmpty())
        {
            value = head.getValue();
        }

        return value;
    }

    /* Returns value in last node */
    public Object peekLast()
    {
        Object value = null;
        if (isEmpty())
        {
            value = tail.getValue();
        }

        return value;
    }

    /* Find node containing value if it exists */
    public list_node find(Object value)
    {
        list_node node = head;
        if (head != null) {
            while (node != null && !value.equals(node.getValue())
            {
                node = node.getNext();
            }
        }

        return node;
    }

    /* Push node to front */
    public void insertFirst(Object value)
    {
        list_node node = new list_node(value);
        if (isEmpty())
        {
            head = node;
            tail = head;
        }
        else 
        {
            head.setPrev(node);
            node.setNext(head);
            head = node;        
        }
    }

    /* Append */
    public void insertLast(Object value)
    {
        list_node node = new list_node(value);
        if (isEmpty())
        {
            head = node;
            tail = head;
        }
        else if(head.getNext() == null)
        {
            tail = node;
            tail.setPrev(head);
            head.setNext(node);
        }
        else
        {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }

    /* Remove first node */
    public void removeFirst()
    {
        if (head.getNext() == null)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
        }
    }
    
    /* Remove last node */
    public void removeLast()
    {
        if (head.getNext() == null)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
        }
    }

    /* Remove node given a value */
    public void remove(Object value)
    {
        list_node node = head;
        if (head != null) 
        {
            while (node != null && !value.equals(node.getValue())
            {
                if (node.getValue().equals(value))
                {
                    //First node
                    if (node.getPrev() == null)
                    {
                        removeFirst();
                    }
                    //Last node
                    else if (node.getNext() == null)
                    {
                        removeLast();
                    }
                    //Middle node
                    else {
                        //Set previous node's next reference to next node
                        node.getPrev().setNext(node.getNext());
                        //Set next node's previous reference to previous node
                        node.getNext().setPrev(node.getPrev());
                    }
                }

                node = node.getNext();
            }
        }
    }

}