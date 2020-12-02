A double-ended, doubly-linked list is a data structure similar to the basic singly
linked list. The head and tail nodes keep track of the front and end nodes, each
node in the list also stores references to previous and next nodes allowing 
bi-directional traversal.

### <ins>Methods</ins>

### isEmpty
Check if the head node is null, if it is then the list is empty.

### peekFirst
Returns the value stored in the head node.

### peekLast
Returns the value stored in the tail node.

### find
Given a value, the list is traversed to return the node which stores this value if it exists.

### insertFirst
The head's previous reference is set to the new node, the new node's next pointer is set to the head.
Then, the new head is set to the new node to finish inserting the node at the start of the list.

### insertLast
The tail's next reference is set to the new node, the new node's prev pointer is set to the tail.
Then, the new tail is set to the new node to finish inserting the node at the end of the list.

### removeFirst
Set the head pointer to the next reference.

### removeLast
Set the tail pointer to the previous reference.

### remove
Iterate through list until the node containing a value is found, relink the previous and next nodes
such that the current node is no longer in the list.
