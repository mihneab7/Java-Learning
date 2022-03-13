import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int butterCups = scanner.nextInt();
        boolean checkWeekend = scanner.nextBoolean();
        boolean result = butterCups >= 10 && butterCups <= 20 && !checkWeekend ||
                butterCups >= 15 && butterCups <= 25 && checkWeekend;
        System.out.println(result);
    }
}