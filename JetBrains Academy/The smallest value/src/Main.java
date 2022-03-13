import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bigNumber = sc.nextLong();
        int i;
        int j;
        long factorial = 1;
        for (i = 1; i <= bigNumber; i++) {
            for (j = 1; j <= i; j++) {
                factorial *= j;
            }
            if (factorial > bigNumber) {
                System.out.println(i);
                break;
            }
            factorial = 1;
        }
    }
}