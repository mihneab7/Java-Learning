import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int numberOfParts = sc.nextInt();
        int currentPart;
        int i;
        int toBeShipped = 0;
        int toBeFixed = 0;
        int rejects = 0;
        for (i = 1; i <= numberOfParts; i++) {
            currentPart = sc.nextInt();
            if (currentPart == 0) {
                toBeShipped++;
            } else if (currentPart == 1) {
                toBeFixed++;
            } else {
                rejects++;
            }
        }
        System.out.print(toBeShipped + " ");
        System.out.print(toBeFixed + " ");
        System.out.print(rejects);
    }
}