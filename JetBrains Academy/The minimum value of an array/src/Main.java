import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}