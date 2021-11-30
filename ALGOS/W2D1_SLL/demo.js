// Singly Linked Lists
// pass by value / copy
var x = 10;
var y = x;

x += 30;
y += 10;

// console.log(x); //? 40?
// console.log(y); //? 20?
// -----------
// pass by reference
var a = [1,2,3,4];
var b = a;

a.push(10);
b.push(20);

// console.log(a); //? [1,2,3,4]
// console.log(b); //? x?

// -------------

var person = {
    name: "John",
    favFood: "🍕",
    age: 9001
}

// var person = new Person();

// ------------------------
/*
    Class Car - blueprint
        -> attributes (member variables)
            (what a class HAS)
            - color
            - num of wheels
            - model
            - engine type

        -> constructor 
            - creates defaults

        -> methods() (class functions)
            (what a class can DO - actions)
            drive()
            reverse()
            turnOnBlinkers()
            brake()
            accelerate()
*/

// object literals
var n1 = {
    value: 11,
    next: null
}
var n2 = {
    value: 22,
    next: null
}
var n3 = {
    value: 33,
    next: null
}

// console.log(n1);
// console.log(n2);
n1.next = n2;
n1.next.next = n3;
n1.next.next.next = n4;
// n2.next = n3;
// console.log(n1);


var n4 = {
    value: 44,
    next: null
}
// ---classes for the objects

class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}
// class for the SLL
class SLL {
    constructor() {
        this.head = null;
    }

    // methods---
    isEmpty() {
        if (this.head) {
            return false;
        } else {
            return true
        }
    }

    // 
}

var MySLL = new SLL();
console.log(MySLL.isEmpty());

// console.log(MySLL);



// var node1 = new Node(100);
// var node2 = new Node(200);
// var node3 = new Node(300);
// var node4 = new Node(400);
// var node5 = new Node(500);
// console.log(node1);
// console.log(node2);
// console.log(node3);



























