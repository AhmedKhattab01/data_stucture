# QUEUE
Queue class is used to create queue that applies the queue definition of "First in first out" (FIFO) with pre-built methods such as (peek,enqueue,dequeue,etc...)


## Usage
**enqueue() : Void**

This function allow adding new item to the queue

**Params**
- ```value``` {T} required input  // Generic

**Example**
```java
        Queue x = new Queue();

        x.enqueue(2);

        System.out.println(x.store.getHead().value);
    
        // => 2
```
<hr>

**dequeue() : Void**

This function allow removing item from the list and will use the dequeueHead Function from the Deque class


**Example**
```java
        Queue x = new Queue();

        x.enqueue(2);
        System.out.println(x.store.getHead().value);
        x.dequeue();
        System.out.println(x.store.getHead().value);
    
        // => 2 
        // => null
```

<hr>

**peek() : T  // Generic type**

This function return generic type value which contain the head item value

**Example**
```java
        Queue x = new Queue();

        x.enqueue(1);
        x.enqueue(3);
        System.out.println(x.peek());
    
        // => 1 
```

<hr>

**count() : int  // Generic type**

This function return int value which is the number of items inside the list

**Example**
```java
        Queue x = new Queue();

        x.enqueueHead(1);
        x.enqueueHead(3);
        System.out.println(x.count());
    
        // => 2
```

<hr>
