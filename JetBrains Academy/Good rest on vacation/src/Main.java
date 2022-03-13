import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();
        System.out.println((duration - 1) * nightCost + 2 * flightCost + duration * foodCost);
    }
}