import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;
        for (int i = 0; ; i++) {
            input = sc.nextInt();
            if (input == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += input;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}