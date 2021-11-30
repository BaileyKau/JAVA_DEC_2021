import java.util.Arrays;
import java.util.ArrayList;

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

        // === ARRAYS ====
        int[] numbers;  // Variable declaration
        numbers = new int[5];
        numbers[0] = 11;
        numbers[2] = 22;
        numbers[3] = 33;

        int[] myArray1 = {4, 8, 8, 5, 9};
        boolean[] myArray2 = {true, false, true};
        char[] alphabet = {'a', 'b', 'c'};

        for (int i=0; i<myArray1.length; i++) {
            // System.out.println(myArray1[i] + 10);
        }

        // ----- ArrayList -------

        ArrayList<Integer> myArray = new ArrayList<Integer>(); // []

        // System.out.println(myArray);
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);

        // [10,20.30]
        // System.out.println(myArray); // ? 








        // 1. import java.util.Arrays;
        // System.out.println(Arrays.toString(myArray1));
        // System.out.println(Arrays.toString(myArray2));
        // System.out.println(Arrays.toString(alphabet));


        // ------- import another class / file
        // Instantiate the class here to use it
        AnotherFile magicalUnicorns = new AnotherFile();
        // magicalUnicorns.sayHi();


        ArrayList<Integer> y = magicalUnicorns.manipulateArr(myArray);
        // System.out.println(y);

//       type
//        |     var name (identifier) 
//        |      |
//        V      V      value
        String myName = "John";

        String val = magicalUnicorns.sayHelloName();
        System.out.println(val);
        String value = magicalUnicorns.sayHelloName(myName, 10);
        System.out.println(value + " !!!!!!!!!");
        // System.out.println(magicalUnicorns.sayHelloName(myName));


	}
}

// I, II, IV, XI