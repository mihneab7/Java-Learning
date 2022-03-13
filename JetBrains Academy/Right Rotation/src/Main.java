import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        int[] copy = new int[a.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
            copy[i] = a[i];
        }
        int shift = scanner.nextInt();
        if (shift >= a.length) {
            shift %= a.length;
        }
        for (int i = 0; i < a.length; i++) {
            if (i + shift >= a.length) {
                a[i + shift - a.length] = copy[i];
            } else {
                a[i + shift] = copy[i];
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}