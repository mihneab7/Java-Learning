import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();
        int numberOfYears = 0;
        while (m < k) {
            m += m * p / 100;
            numberOfYears++;
        }
        System.out.println(numberOfYears);
    }
}