public class DrivingResults {
    static void checkResults(int results){
        // if age less than 18, download permitted
        if (results > 43) {
            System.out.println("Congratulations, you have passed the MCQ Driving Test");
        } else {
            System.out.println("Unfortunately you have not passed the MCQ Driving Test this time. Better luck next time.");
        }
    }


    // main method
    public static void main(String[] args) {
        checkResults(12);
        checkResults(45);
        checkResults(30);
        checkResults(49);
    }
}