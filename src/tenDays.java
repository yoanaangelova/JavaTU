import java.util.Scanner;

public class tenDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int afterTenDays = (day + 10) % 7;
        System.out.println(afterTenDays);
    }
}
