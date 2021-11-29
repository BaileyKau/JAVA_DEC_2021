import java.util.Arrays;

public class HelloWorld{
    
    // entry point to compile
    // EVERYTHING will be executed by the following:
    public static void main(String[] args) {

        // print
        // System.out.println("Hello world!");

        //---  VARIABLES ---
        // primitive types
        int age = 9000;
        char letter = 'a';
        double tax = 3.4;
        boolean isAdmin = true;

        // Object types
        String name1 = "George";
        String name2 = "George";
        // System.out.println(name1.length());
        // System.out.println(name1 == name2 ); // ?
        
        Integer num = 123123;
        Double price = 22.99;
        Boolean vote = false;
        // System.out.println("--------\n");
        
        String a = new String("hello");
        String b = new String("hello");
        // System.out.println(a == b ); // ?
        // System.out.println(a.equals(b)); // ?


        int myNum;
        myNum = 33;

        // arrays -----------------
        int[] numbers;  // Variable declaration
        numbers = new int[5];
        numbers[0] = 11;
        numbers[2] = 22;
        numbers[3] = 33;

        // 1. import java.util.Arrays;

        System.out.println(Arrays.toString(numbers));


        // ------- import another class / file
        // Instantiate the class here to use it
        AnotherFile magicalUnicorns = new AnotherFile();
        magicalUnicorns.sayHi();

        //       type
        //        |     var name (identifier) 
        //        |      |
        //        V      V      value
        String myName = "John";

        String value = magicalUnicorns.sayHelloName(myName);
        // System.out.println(value + "!!!!!!!!!");
        System.out.println(magicalUnicorns.sayHelloName(myName));


	}
}