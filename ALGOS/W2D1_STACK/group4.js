/* Stacks
A stack is a LIFO data structure
LAST IN, FIRST OUT
LIFO / FILO
push - add to top
pop - remove from top
peek - check the top
isEmpty - check if the stack is empty, true/false
length - return size of stack
*/

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class slStack {
    constructor() {
        this.top = null; // this.head, this.end
        this.counter = 0;
    }

    // add to top
    push(newNode) {
        newNode.next = this.top;
        this.top = newNode;
        this.counter++;
    }


    // remove from top
    pop() {
        if (this.isEmpty()) {
            return;
        }
        else {
            var temp = this.top;
            this.top = this.top.next;
            temp.next = null;
            this.counter--;
        }
    }

    // aka check top
    peek() {
        if (this.isEmpty()) {
            return;
        }
        return this.top.data;
    }

    // check if empty
    isEmpty() {
        return this.top == null;
    }

    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() {
        return this.counter;
    }   
}

// don't forget to instantiate the slStack!
// add a few nodes first