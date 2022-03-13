import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int theValue = scanner.nextInt();
        boolean check = theValue < 10 && theValue > 0;
        System.out.println(check);
    }
}