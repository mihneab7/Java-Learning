import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long product = 1L;
        long i;
        for (i = a; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}