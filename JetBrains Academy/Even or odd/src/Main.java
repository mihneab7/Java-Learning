import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a;
        while ((a = sc.nextInt()) != 0) {
            if (a == 0) {
                break;
            } else if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}