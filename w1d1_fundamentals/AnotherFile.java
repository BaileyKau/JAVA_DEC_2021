import java.util.ArrayList;


public class AnotherFile{
// access modifier
//    |
//    |   return type
//    |     |
//    |     |   method name (class function)
//    |     |     |
//    V     V     V
    public void sayHi() {
        System.out.println("hi!!! from AnotherFile");
    }

    public String sayHelloName() {
        return "hello there";
    }

    public String sayHelloName(String unicorns, int x) {
        // System.out.println("hi " + unicorns);
        return "hello " + unicorns;
    }

    public ArrayList<Integer> manipulateArr(ArrayList<Integer> arrayUnicorn) {
        // System.out.println("-----");
        for (int i = 0; i<arrayUnicorn.size(); i++) {
            // System.out.println(arrayUnicorn.get(i) + 10);
            arrayUnicorn.set(i, i*20);
        }
        return arrayUnicorn; // [0,20, 40]
        // System.out.println(arrayUnicorn);

    }
}