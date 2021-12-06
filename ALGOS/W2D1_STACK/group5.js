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
        this.length = 0;
    }

    // add to top
    push(newNode) {
        newNode.next = this.top;
        this.top = newNode;
        this.length++;
    }

    // remove from top
    pop() {
        if(!this.top){
            return null
        }
        var remove = this.top;
        this.top = this.top.next;
        remove.next = null;
        this.length--;
        return remove;
    }

    // aka check top
    peek() {}

    // check if empty
    isEmpty() {}

    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() {}
}

// don't forget to instantiate the slStack!
var myStack = new slStack();
// add a few nodes first
myStack.push(new Node(99));
myStack.push(new Node(55));
console.log(myStack);