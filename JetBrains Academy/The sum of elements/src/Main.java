import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a;
        do {
            a = sc.nextInt();
            sum += a;
        } while (a != 0);
        System.out.println(sum);
    }
}