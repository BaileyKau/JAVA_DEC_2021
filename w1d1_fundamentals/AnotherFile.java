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

    public String sayHelloName(String unicorns) {
        System.out.println("hi " + unicorns);
        return "hello " + unicorns;
    }
}