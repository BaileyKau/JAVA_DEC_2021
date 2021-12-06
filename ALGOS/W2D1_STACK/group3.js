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
    }

    // add to top
    push(newNode) {
        
        //whenever this.top is pointing, set newNode.next pointing to this.top
        newNode.next = this.top;
        this.top = newNode;
    }

    // remove from top
    pop() {
        if(this.top == null){
            return;
        }else {
            var temp = this.top;
            this.top = this.top.next;
            temp.next = null;
        }
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
// add a few nodes first


var myList = new slStack();
 

