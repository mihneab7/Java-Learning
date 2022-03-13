import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputProcessed = input.split("\\.");
        String regex = "[0-2]{0,1}[0-9]{0,1}[0-9]{1}\\.[0-2]{0,1}[0-9]{0,1}[0-9]{1}\\.[0-2]{0,1}[0-9]{0,1}[0-9]{1}\\." +
                "[0-2]{0,1}[0-9]{0,1}[0-9]{1}";
        String smallRegex = "[0-2]{0,1}[0-9]{0,1}[0-9]{1}";
        boolean match = false;
        int a;
        for (String c : inputProcessed) {
            try {
                a = Integer.parseInt(c);
                if (a > 255 || a < 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
                if (c.matches(smallRegex)) {
                    match = true;
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        if (match) {
            if (input.matches(regex)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        /*
        final Scanner scanner = new Scanner(System.in);

        final String bytePattern = "(1?\\d?\\d|2[0-4]\\d|25[0-5])";
        final String ipPattern = String.join(
                "\\.", bytePattern, bytePattern, bytePattern, bytePattern
        );
        final String text = scanner.nextLine();

        System.out.println(text.matches(ipPattern) ? "YES" : "NO");
         */


    }
}