import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = 0;
        double average = 0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                average += a;
                counter++;
            }
        }
        System.out.println(average / counter);
    }
}