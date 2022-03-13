import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int compare = 0;
        boolean firstLoop = true;
        boolean result;
        int ascendingCounter = 0;
        int descendingCounter = 0;
        while ((n = sc.nextInt()) != 0) {
            if (firstLoop) {
                compare = n;
                firstLoop = false;
                continue;
            }
            if (n >= compare) {
                ascendingCounter++;
            } else if (n <= compare) {
                descendingCounter++;
            }
            compare = n;
        }
        if (ascendingCounter != 0 && descendingCounter != 0) {
            result = false;
        } else {
            result = true;
        }
        System.out.println(result);
    }
}