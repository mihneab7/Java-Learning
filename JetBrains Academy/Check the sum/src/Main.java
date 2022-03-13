import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int aPlusB = a + b;
        int aPlusC = a + c;
        int bPlusC = b + c;
        System.out.println(aPlusB == 20 || aPlusC == 20 || bPlusC == 20);
    }
}