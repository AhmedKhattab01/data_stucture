# Deque
Deque class is used to create queue and stack functions that will be used by stacks and queues and its built using doubly linked list which allow adding items from head or tail and other useful methods such as

(enqueueHead,   enqueueTail, peekHead,etc...)

## Usage
**enqueueHead() : Void**

This function allow adding new item to the queue head

**Params**
- ```value``` {T} required input  // Generic

**Example**
```java
        Deque x = new Deque();

        x.enqueueHead(2);

        System.out.println(x.store.getHead().value);
    
        // => 2
```
<hr>

**enqueueTail() : Void**

This function allow adding new item to the queue tail

**Params**
- ```value``` {T} required input  // Generic

**Example**
```java
        Deque x = new Deque();

        x.enqueueTail(2);

        System.out.println(x.store.getTail().value);
    
        // => 2
```

<hr>

**dequeueHead() : Void**

This function allow removing item from the list head and will use the removeFirst Function from the LinkedList class


**Example**
```java
        Deque x = new Deque();

        x.enqueueHead(2);
        System.out.println(x.store.getHead().value);
        x.dequeueHead();
        System.out.println(x.store.getHead().value);
    
        // => 2 
        // => null
```

<hr>

**dequeueTail() : Void**

This function allow removing item from the list tail and will use the removeLast Function from the LinkedList class


**Example**
```java
        Deque x = new Deque();

        x.dequeueTail(2);
        System.out.println(x.store.getTail().value);
        x.dequeueTail();
        System.out.println(x.store.getTail().value);
    
        // => 2 
        // => null
```

<hr>

**peekHead() : T  // Generic type**

This function return generic type value which contain the head item value

**Example**
```java
        Deque x = new Deque();

        x.enqueueHead(1);
        x.enqueueHead(3);
        System.out.println(x.peekHead());
    
        // => 3 
```

<hr>

**peekTail() : T  // Generic type**

This function return generic type value which contain the tail item value

**Example**
```java
        Deque x = new Deque();

        x.enqueueHead(1);
        x.enqueueHead(3);
        System.out.println(x.peekTail());
    
        // => 1
```

<hr>

**count() : int  // Generic type**

This function return int value which is the number of items inside the list

**Example**
```java
        Deque x = new Deque();

        x.enqueueHead(1);
        x.enqueueHead(3);
        System.out.println(x.count());
    
        // => 2
```

<hr>
