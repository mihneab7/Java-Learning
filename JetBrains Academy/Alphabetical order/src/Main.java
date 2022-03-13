import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String[] array = new String[input.length];
        int checker;
        boolean isOrdered = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = input[i];
//            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            checker = array[i].compareTo(array[i + 1]);
            if (checker > 0) {
                isOrdered = false;
                break;
            } else {
                isOrdered = true;
            }
        }
        System.out.println(isOrdered);
    }
}