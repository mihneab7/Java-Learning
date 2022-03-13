import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n / 1000 == n % 10 && n / 100 % 10 == n % 100 / 10) {
            System.out.println(1);
        } else {
            System.out.println(69);
        }
    }
}