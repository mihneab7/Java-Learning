import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        boolean goodOrder = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                break;
            }
            if (array[i] > array[i + 1]) {
                goodOrder = false;
                break;
            }
        }
        System.out.println(goodOrder);
    }
}