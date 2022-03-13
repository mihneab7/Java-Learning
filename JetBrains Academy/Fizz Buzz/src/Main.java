import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int startInterval = sc.nextInt();
        int endInterval = sc.nextInt();
        int i;
        for (i = startInterval; i <= endInterval; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}