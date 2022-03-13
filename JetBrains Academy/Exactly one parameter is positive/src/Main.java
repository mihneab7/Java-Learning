import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean aPositive = a > 0 && b <= 0 && c <= 0;
        boolean bPositive = a <= 0 && b > 0 && c <= 0;
        boolean cPositive = a <= 0 && b <= 0 && c > 0;
        boolean onePositive = aPositive || bPositive || cPositive;
        System.out.println(onePositive);
    }
}