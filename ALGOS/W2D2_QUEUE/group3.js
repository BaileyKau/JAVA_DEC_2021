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
        this.length = 0;
    }

    // add nodes to the back of the queue
    enqueue(node) {
        //when the queue is empty, front and back has to point to newNode
        if(!this.front){
            this.front = node;
            this.back = node;
        }
        this.back.next = node;
        this.back = node;
    }
    
        
        // remove from the front
    dequeue() {
        //if the queue is empty
        if(!this.front){
            return;
        }
        //if the queue has only one Node, front and back reset to null
        else if(this.front == this.back){
            var temp = this.front;
            this.front = null;
            this.back = null;
            return temp;
        }
        //if the queue has more than one Node, 
        var temp = this.front;
        this.front = this.front.next;
        temp.next = null;
        return temp;
    }

    // check the front of the queue
    peek() {
        return this.front ? this.front.data : this.front;
    
        if (this.front) {
            return this.front.data
        } else {
            return this.front
        }
    }

    // return tr
        return this.front === null
    ue / false if queue is empty
    isEmpty() { }

    // return length
    count() { }
}

// NINJA BONUS:
// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue(), dequeue(), peek(), isEmpty(), and count()
function readQueue(queue) {
    var runner = this.front;
    while (runner !== null) {
        console.log(runner.data);
        runner = runner.next;
    } 
}