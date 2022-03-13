import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            if (i + 1 == a.length) {
                a[0] = scanner.nextInt();
            } else {
                a[i + 1] = scanner.nextInt();
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}