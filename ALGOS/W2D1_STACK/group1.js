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
        //if the top is empty add the node
        if(isEmpty) {
            this.top = newNode
        //  else the new node points to where the head is pointing
        }else{
            newNode.next = this.top
        }
        
    }
    }




        if(isEmpty){// if it is empty there is nothing to pop(remove)
            return null
        }
        var temp = this.top;// top is a temp variable 
        this.top = this.top.next;// moving top
        temp.next = null;// removing the node from the stack
        return temp;
     }

    // aka ch }


        if (isEmpty) {
            return null
        } else {
            return this.top.data
        }
        // aka check top
    peek() {
        
    }
     isEmpty() {

         return this.top == null;
     }
    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() {}
}

// don't forget to instantiate the slStack!
// add a few nodes first