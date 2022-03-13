import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sequenceLength = 0;
        while (sc.nextInt() != 0) {
            sequenceLength++;
        }
        System.out.println(sequenceLength);
    }
}