import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber <= secondNumber && (firstNumber >= secondNumber ||
                firstNumber >= thirdNumber) || firstNumber <= thirdNumber && (firstNumber >= secondNumber ||
                firstNumber >= thirdNumber));
    }
}