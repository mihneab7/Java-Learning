import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while (n != 0) {
            int currentValue = sc.nextInt();
            if (currentValue % 4 == 0 && currentValue >= max) {
                max = currentValue;
            }
            n--;
        }
        System.out.println(max);
    }
}