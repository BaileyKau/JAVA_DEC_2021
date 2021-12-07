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
        //if the back and front is empty point both pointers to new node
        if(this.isEmpty()){
            this.front = node;
            this.back = node;
        } this.back.next = node;
        this.back = node;
     }

    // remove from the front
    dequeue() { 
        if(this.isEmpty()){
            return
        } else if(this.front === this.back){
            this.front = null;
            this.back = null;
            return
        }
        var temp = this.front;
        this.front = this.front.next;
        temp = null;

    }

    // check the front of the queue
    peek() {
        return this.front ? this.front.data : this.front;
    }

    // return true / false if queue is empty
    isEmpty() {
        return this.front === null;
     }

    // return length
    count() {
        var temp = this.front;
        var count = 0;
        while(temp){
            temp = temp.next
            count++
        } return count;
     }
}

// NINJA BONUS:
// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue(), dequeue(), peek(), isEmpty(), and count()
function readQueue(queue) {}

var node1 = new Node(1);
var node2 = new Node(2);
var node3 = new Node(3);

queue1.enqueue(node1);
queue1.enqueue(node2);
queue1.enqueue(node3);

console.log(queue1);