import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long firstNumber = sc.nextLong();
        String operation = sc.next();
        long secondNumber = sc.nextLong();
        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(firstNumber / secondNumber);
                    break;
                }
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}