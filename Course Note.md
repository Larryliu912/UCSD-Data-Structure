## Data Structure Course Note

1. **Array**

Contiguous area of memory consisting of equal-size elements indexed by contiguous integers

**O(1)** access to any element

**O(1)** to add/remove at the end

**O(n)** to add/remove at an arbitrary location

2. **Linked List**

**O(1)** to insert at or remove from the front

With tail and doubly-linked, **O(1)** to insert at or remove from the back

**O(n)** time to find arbitrary element

List elements need not be contiguous

With doubly-linked list, **O(1)** to insert between nodes or remove a node

3. **Stack**

Stacks can be implemented with either an array or a linked list

Each stack operation is **O(1)**: Push, Pop, Top, Empty

Stacks are ocassionaly known as LIFO queues

4. **Queue**

Queues can be implemented with either a linked list (with tail pointer) or an array

Each queue operation is **O(1)** : Enqueue, Dequeue, Empty

5. **Tree**

A Tree is empty or a node with a key and a list of child trees (and optional) parent

Binary tree node contains key, left, right, (optional) parent



