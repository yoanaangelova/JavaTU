import java.util.HashMap;
import java.util.Set;

public class Bank {
    private HashMap<Integer, Integer> accounts = new HashMap<>();
    private double rate = 0.01;
    private  int nextAcct = 0;

    public int newAccount() {
        int acctNum = nextAcct++;
        accounts.put(acctNum, 0);
        return acctNum;
    }

    public int getBalance(int acctNum) {
        return  accounts.get(acctNum);
    }

    public void deposit(int acctNum, int amount) {
        int balance = accounts.get(acctNum);
        accounts.put(acctNum, balance + amount);
    }

    public boolean authorizeLoan(int acctNum, int loanAmount) {
        int balance = accounts.get(acctNum);
        return balance >= loanAmount / 2;
    }

    public String toString() {
        Set<Integer> accts = accounts.keySet();
        String result = "The bank has " + accts.size() + " accounts.";
        for (int i : accts)
            result += "\n\tBank account " + i + ": balance=" + accounts.get(i);
        return result;
    }

    public void addInterest() {
        Set<Integer> accts = accounts.keySet();
        for (int i : accts) {
            int balance = accounts.get(i);
            int newBalance = (int)(balance * (1 + rate));
            accounts.put(i, newBalance);
        }
    }

}
