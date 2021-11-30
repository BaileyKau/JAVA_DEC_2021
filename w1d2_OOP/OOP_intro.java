/*Java Day 2 – OOP Basics Warm Up

What does OOP stand for? What is it, briefly?
    Object Oriented Programming
    DRY
        Don't Repeat Yourself
    models real life
 						
What is a class?
    blueprint - (how)
    instantiate objects -> 

 						
Classes in Java contain member variables and methods. Give a brief explanation for each:
 							
Member Variables: (attributes)
    values held by the obj
    characteristics
    anything the class HAS

Constructor(s)
    default values
    create the class -> instantiated object

Methods: (class functions)
    actions
    what a class DOES (verbs)

The following are lines of code belong to a Shopping Cart class, but are out of order. Arrange the code to make a functional class.				
*/

public class ShoppingCart {
    // member variables
    private account;
    private id;
    private String store;
    private double total;
    private ArrayList<String> items = new ArrayList<String>();

    // constructor
    public ShoppingCart(store) {
        this.store = store;
    }

    // methods
    public void add_item(String item, double price){
        this.items.add(item)
        this.total += price;
    }
}


