public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        System.out.println(myMethod(3));
    }
}