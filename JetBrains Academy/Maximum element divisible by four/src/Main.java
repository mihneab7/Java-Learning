import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maximum = 0;
        int i;
        int currentElement;
        for (i = 1; i <= n; i++) {
            currentElement = sc.nextInt();
            if (currentElement % 4 == 0 && currentElement >= maximum) {
                maximum = currentElement;
            }
        }
        System.out.println(maximum);
    }
}