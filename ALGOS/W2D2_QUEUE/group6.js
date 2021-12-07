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
        if (this.isEmpty()) {
            this.front = node;
            this.back = node;
        }
        else {
          this.back.next = node;
          this.back = node;
        }
    }

    // remove from the front
    dequeue() {
        if (this.isEmpty()) {
            return;
        }
        else {
            var temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            return temp;
        }
    }

    // check the front of the queue
    peek() {
      if (this.isEmpty()) {
        return;
      }
      return this.front.data;
    }

    // return true / false if queue is empty
    isEmpty() {
        return this.front == null;
    }

    // return length
    count() {
        var counter = 0;
        if (this.isEmpty()) {
          return counter;
        }
        let tempQueue = new Queue();
        var tempNode = new Node(this.peek());
        while (!this.isEmpty()) {
            counter++;
            this.dequeue();
            tempQueue.enqueue(tempNode);
            tempNode = new Node(this.peek());
        }
        tempNode = new Node(tempQueue.peek());
        while (!tempQueue.isEmpty()) {
          tempQueue.dequeue();
          this.enqueue(tempNode);
          tempNode = new Node(tempQueue.peek());
        }
        return counter;
    }
}

var newQueue = new Queue();
newQueue.enqueue(new Node(44));
newQueue.enqueue(new Node(33));
newQueue.enqueue(new Node(22));
newQueue.enqueue(new Node(11));
newQueue.count();

// NINJA BONUS:
// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue(), dequeue(), peek(), isEmpty(), and count()
function readQueue(queue) {
    let tempQueue = new Queue();
    var tempNode = new Node(queue.peek());
    while (!queue.isEmpty()) {
        console.log(tempNode.data);
        queue.dequeue();
        tempQueue.enqueue(tempNode);
        tempNode = new Node(queue.peek());
    }
    tempNode = new Node(tempQueue.peek());
    while (!tempQueue.isEmpty()) {
        tempQueue.dequeue();
        queue.enqueue(tempNode);
        tempNode = new Node(tempQueue.peek());
    }
    return numbers;
}
var newQueue = new Queue();
newQueue.enqueue(new Node(44));
newQueue.enqueue(new Node(33));
newQueue.enqueue(new Node(22));
newQueue.enqueue(new Node(11));
console.log(readQueue(newQueue));