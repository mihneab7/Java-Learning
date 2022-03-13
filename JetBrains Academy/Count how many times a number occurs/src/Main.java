import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int counter = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == n) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}