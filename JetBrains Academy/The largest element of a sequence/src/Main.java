import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a;
        int max = 0;
        do {
            a = sc.nextInt();
            if (a > max) {
                max = a;
            }
        } while (a != 0);
        System.out.println(max);
    }
}