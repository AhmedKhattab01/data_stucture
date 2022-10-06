# Stack
Stack class is used to create stack that applies the stack definition of "Last in First out" (LIFO) with pre-built methods such as (push,pop,peek,etc...)


## Usage
**push() : Void**

This function allow adding new item to the stack

**Params**
- ```item``` {T} required input  // Generic

**Example**
```java
        Stack x = new Stack();

        x.push(4);
        System.out.println(x.peek());
    
        // => 4
```
<hr>

**pop() : Void**

This function removes the last added item to the stack


**Example**
```java
        Stack x = new Stack();

        x.push(4);
        System.out.println(x.peek());
        x.pop();
        System.out.println(x.peek());
    
        // => 4 
        // => null
```

<hr>

**peek() : T  // Generic type**

This function checks the last added item to the stack and print it out if its not null

**Example**
```java
        Stack x = new Stack();

        x.push(4);
        System.out.println(x.peek());
    
        // => 4
```

<hr>

**count() : int  // Generic type**

This function return int value which is the number of items inside the stack

**Example**
```java
        Stack x = new Stack();

        x.push(4);
        x.push(4);
        x.push(4);
        System.out.println(x.count());
    
        // => 3
```

<hr>
