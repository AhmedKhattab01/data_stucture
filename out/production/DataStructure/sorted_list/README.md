# Sorted List
Sorted List class is used allow sorting the list with multiple prebuilt functions such as
(addNode, sortList, display,etc...)

## Usage
**addNode() : Void**

This function add new item to the list.

**Params**
- ```data``` {int} required input  // Generic

**Example**
```java
        SortList sList = new SortList();

        sList.addNode(8);
        sList.addNode(3); 
```
<hr>

**display() : Void**

A void function that display the list items.

**Example**
```java
        SortList sList = new SortList();

        sList.addNode(8);
        sList.addNode(3);
        sList.addNode(7);
        sList.addNode(4);

        sList.display();
    
    // => 8 3 7 4
```

<hr>

**sortList() : Void**

A void function that will be used to sort the items in side the list

**Example**
```java
        SortList sList = new SortList();

        // Adds data to the list
        sList.addNode(8);
        sList.addNode(3);
        sList.addNode(7);
        sList.addNode(4);

        sList.sortList();
        sList.display();
        
        // => 3 4 7 8
```

<hr>





