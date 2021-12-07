class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// Queue
// FIFO (First in, first out)

// - enqueue
// - dequeue
// - peek
// - isEmpty
// - count

class Queue {
    constructor() {
        this.front = null; // sometimes called head "front of the line"
        this.back = null; // sometimes called rear or tail "back of the line"
        
    }

    // add nodes to the back of the queue
    enqueue(node) {
        if(this.front == null){
            this.front = node
            this.back = node;
            
        }else{
            this.back.next=node;
            this.back = node;
        }
        
    }

    // remove from the front
    dequeue() { 
        // if the queue is empty we just return to stop the function
        if(this.front==null){
            return
        }
        // lines 44 - 46 allow the dequeue to occur by pointing this.front to the next node and creating a var to hold the first node then point it to null
        var temp = this.front;
        this.front=this.front.next;
        temp.next= null
        // if we try to dequeue beyond the length of the queue we set the back to null to empty the queue
        if(this.front==null){
            this.back=null
        }
    }

    // check the front of the queue
    peek() {
        return this.front ? this.front.data : this.front;
    }

    // return true / false if queue is empty
    isEmpty() {
        return this.front === null
    }

    // return length
    count() { }
}

// NINJA BONUS:
// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue(), dequeue(), peek(), isEmpty(), and count()
function readQueue(queue) {}





var myQueue = new Queue();
var node1 = new Node(1)
var node2 = new Node(2)
var node3 = new Node(3)
var node4 = new Node(4)
var node5 = new Node(5)

myQueue.enqueue(node1)
myQueue.enqueue(node2)
myQueue.enqueue(node3)
myQueue.enqueue(node4)
myQueue.enqueue(node5)


myQueue.dequeue()
myQueue.dequeue()
myQueue.dequeue()



console.log(myQueue)