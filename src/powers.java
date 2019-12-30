import java.util.Scanner;

public class powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double pow = scanner.nextDouble();
        System.out.println(Math.pow(num, pow));
    }
}
