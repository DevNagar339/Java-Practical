import java.util.*;


class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

public class Main {
    static int count = 0;
    final int accountNo = 101;

    void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount!");
        System.out.println("Deposited: " + amount);
    }

    public static void main(String[] args) {
        Main m = new Main();
        count++;

        try {
            m.deposit(1000);
            System.out.println("Account: " + m.accountNo);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program completed.");
        }

        System.out.println("Total objects: " + count);
    }
}
