import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String givenText = scanner.next();
        String givenTextLower = givenText.toLowerCase();
//        System.out.println(givenTextLower.trim().startsWith("j"));
        System.out.println(givenTextLower.trim().charAt(0) == 'j');
    }
}