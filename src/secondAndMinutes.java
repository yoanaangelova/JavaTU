import java.util.Scanner;

public class secondAndMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer for seconds: ");
        int number = scanner.nextInt();
        int minutes = number / 60;
        int seconds = number - minutes * 60;
        System.out.printf("%d is %d minutes and %d seconds", number, minutes, seconds);
    }
}
