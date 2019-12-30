import java.util.Scanner;

public class BankClient {
    private int current = -1;
    private Scanner scanner = new Scanner(System.in);
    private boolean done = false;
    private Bank bank = new Bank();

    public void run() {
        while (!done) {
            System.out.println("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest): ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
        scanner.close();
    }

    private void processCommand(int command) {
        if (command == 0) quit();
        else if (command == 1) newAccount();
        else if (command == 2) select();
        else if (command == 3) deposit();
        else if (command == 4) authorizeLoan();
        else if (command == 5) showAll();
        else if (command == 6) addInterest();
        else
            System.out.println("Illegal command!");
    }

    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }

    private void newAccount() {
        current = bank.newAccount();
        System.out.println("Your new account number is " + current);
    }

    private void select() {
        System.out.println("Enter acct#: ");
        current = scanner.nextInt();
        int balance = bank.getBalance(current);
        System.out.println("The balance of account " + current + " is " + balance);
    }

    private void deposit() {
        System.out.println("Enter deposit amt: ");
        int amt = scanner.nextInt();
        bank.deposit(current, amt);
    }

    private void authorizeLoan() {
        System.out.println("Enter loan amt: ");
        int loanAmt = scanner.nextInt();
        if (bank.authorizeLoan(current, loanAmt))
            System.out.println("Your loan is approved");
        else
            System.out.println("Your loan is denied");
    }

    private void showAll() {
        System.out.println(bank.toString());
    }

    private void addInterest() {
        bank.addInterest();
    }

}
