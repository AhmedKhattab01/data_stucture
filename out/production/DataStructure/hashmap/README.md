# Hash map
HashMap class is used to allow coder to create and use a Hash map with multiple pre implemented methods such as
(add, size, isEmpty,etc...)

## Usage
**add() : Void**

This function add new item to the head of the Linked List.

**Params**
- ```key``` {K} required input  // Generic
- ```value``` {V} required input  // Generic

**Example**
```java
        Map<String, Integer> map = new Map<>();
        map.add("mate", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);  
```
<hr>

**size() : Integer**

This function return integer that indicates the size of the map

**Example**
```java
        Map<String, Integer> map = new Map<>();
        map.add("mate", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);

        System.out.println(map.size());
    
    // => 3
```

<hr>

**removeFirst() : Void**

This function remove the head of the list

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addHead(1);
        System.out.println(ints.getHead().value);
        ints.removeFirst();
        System.out.println(ints.getHead().value);
        
        // => 1   
        // => null
```

<hr>

**isEmpty() : boolean**

This function returns a boolean value that indicates if the map is empty or not ... if empty will return true

**Example**
```java
        Map<String, Integer> map = new Map<>();
        map.add("mate", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        
        System.out.println(map.isEmpty());
        
        => false
```

<hr>

**remove() : V // Generic**

This function return a generic type value that will be removed if found in the map we use the map key to find the item and remove it

**Params**
- ```key``` {K} required input  // Generic type

**Example**
```java
        Map<String, Integer> map = new Map<>();
        map.add("mate", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        System.out.println(map.remove("this"));
        System.out.println(map.remove("this"));
        
        // => 4 
        // => null
```

<hr>

**get() : V // Generic**

This function return a Generic type value and used to get the given item from the list to print it out.

**Params**
- ```key``` {K} required input  // Generic type

**Example**
```java
        Map<String, Integer> map = new Map<>();
        
        map.add("mate", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        
        System.out.println(map.get("this"));
        
        // => 4
```

<hr>
