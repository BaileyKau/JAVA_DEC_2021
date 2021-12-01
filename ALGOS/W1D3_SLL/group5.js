class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(node) {
        node.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
    }

    // ---------------------------------
    // console log (print) the data of every node in the current list
    // traversal
    read() {
        current = this.head //start from the first node
        while (current){ //when the node is null, break
            console.log(current.data)
            current=current.next  //move the current node to the next node to do the traversal
        }
    }

    // find: return true / false if current list contains a data equal to value
    contains(value) { 
        current = this.head
        while (current){   //while the current node is not empty
            if (current.data == value){ //check if the current node value equal the parameter
                return true
            }
            current=current.next //move the current node to the next node and do the loop 
        }
        return false // return false after check all the nodes
    }

    // Remove from front: remove and return the first node in the SLL
    removeFromFront() {
        if (this.head){ // if there is a head node
            temp = this.head //to store the removed head node
            this.head = this.head.next // make the 2nd node become the head, so the previous head is removed
            console.log(temp)
            return temp// return previous the head node
        }else{
            return null //if no head node, the SLL is empty, return null
        } 
    }
}

// ⚠ don't forget to instantiate the Singly Linked List