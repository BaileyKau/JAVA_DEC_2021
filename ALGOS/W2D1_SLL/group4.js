class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    isEmpty() {
        if (this.head) {
            return false;
        } else {
            return true;
        }
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // add given node to the head, if it exists. return void
    // list is empty?
    // list already has nodes?
    addToFront(node) { 
        // check if the node is empty
        if (isEmpty) {
            this.head = node;
        }
        else{
            //link the new node to the head
            node.next = this.head;
            //reset the head to new node
            this.head = node;
        }    
    }

        
    
    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { 
        var myNode = new Node(data);
        this.addToFront(myNode);
    }
}

// instantiate the SLL
var myList = new SLL();

// creating nodes
var myNode = new Node(55);

// executing methods:
myList.addToFront(myNode);
// myList.addToFront(new Node(44));
// myList.addToFront(new Node(33));
// myList.addToFront(new Node(22));