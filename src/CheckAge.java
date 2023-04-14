public class CheckAge {
    // create checkAge() method, pass on integer variable age
    static void checkAge(int age){
        // if age less than 18, download permitted
        if (age > 18) {
            System.out.println("Download permitted! The app is downloading now....");
        } else {
            System.out.println("Download denied. You need to be 18 years old to download this app.");
        }
    }

    // main method
    public static void main(String[] args) {
        checkAge(20);
        checkAge(10);
    }
}