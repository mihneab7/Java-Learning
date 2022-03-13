import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int i;
        int currentStudent;
        int numberOfDs = 0;
        int numberOfCs = 0;
        int numberOfBs = 0;
        int numberOfAs = 0;
        for (i = 0; i <= numberOfStudents - 1; i++) {
            currentStudent = sc.nextInt();
            if (currentStudent == 2) {
                numberOfDs++;
            } else if (currentStudent == 3) {
                numberOfCs++;
            } else if (currentStudent == 4) {
                numberOfBs++;
            } else {
                numberOfAs++;
            }
        }
        System.out.print(numberOfDs + " ");
        System.out.print(numberOfCs + " ");
        System.out.print(numberOfBs + " ");
        System.out.print(numberOfAs);
    }
}