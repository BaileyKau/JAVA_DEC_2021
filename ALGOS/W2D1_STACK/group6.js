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
        this.count = 0
    }

    // add to top
    push(newNode) {
        if(this.top == null){
            this.top=newNode;
            this.count ++
            console.log(newNode.data)
        }else{
            newNode.next = this.top;
            this.top = newNode;
            this.count ++
            console.log(newNode.data)     }
    }

    // remove from top
    pop() { 
        if(this.top ==null){
            return
        }else{
            var temp = this.top;
            this.top = this.top.next;
            this.count --
            temp.next = null
            return temp;
        }
    }


    // aka check top
    peek() {
        console.log(this.top.data)
        return this.top.data
    }

    // check if empty
    isEmpty() {
        if(this.top == null){
            console.log("true")
            return true
        }else{
            console.log("false")
            return false
        }
    }

    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() {
        console.log("this stack's length is ", this.count)
        return this.count
    }
}


// don't forget to instantiate the slStack!
// add a few nodes first
var myStack = new slStack();
var node1 = new Node(1)
var node2 = new Node(2)
var node3 = new Node(3)
var node4 = new Node(4)
var node5 = new Node(5)

myStack.isEmpty()
myStack.push(node1)
myStack.push(node2)
myStack.push(node3)
myStack.push(node4)
myStack.push(node5)
myStack.pop()
myStack.peek()
myStack.isEmpty()
myStack.getLength();