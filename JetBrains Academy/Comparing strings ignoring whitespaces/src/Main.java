import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
//        String buffer = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line1Trimmed = line1.replaceAll(" ", "");
        String line2Trimmed = line2.replaceAll(" ", "");
        System.out.println(line1Trimmed.equals(line2Trimmed));
    }
}