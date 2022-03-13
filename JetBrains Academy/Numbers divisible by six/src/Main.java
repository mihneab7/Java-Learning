import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int currentElement;
        int sum = 0;
        int i;
        for (i = 1; i <= numberOfElements; i++) {
            currentElement = sc.nextInt();
            if (currentElement % 6 == 0) {
                sum += currentElement;
            }
        }
        System.out.println(sum);
    }
}