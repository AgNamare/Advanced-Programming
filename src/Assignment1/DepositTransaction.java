package Assignment1;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

/**
 * Represents a deposit transaction that increases the balance of a bank account.
 * Extends the BaseTransaction class to inherit common transaction properties and behaviors.
 */
public class DepositTransaction extends BaseTransaction {

    /**
     * Constructor to create a new DepositTransaction.
     * @param amount The amount to deposit.
     * @param date The date and time of the deposit. This value is passed to the BaseTransaction constructor.
     */
    public DepositTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    /**
     * Prints the details of the deposit transaction.
     * Overrides the base implementation to add a specific label for deposit transactions.
     */
    @Override
    public void printTransactionDetails() {
        System.out.println("Deposit Transaction:");
        super.printTransactionDetails(); // Reuse the base method to print common details.
    }

    /**
     * Applies the deposit to a bank account by increasing its balance.
     * @param ba The BankAccount to which the deposit is applied.
     * Frame condition: Modifies the balance of the given BankAccount.
     */
    @Override
    public void apply(BankAccount ba) {
        double currentBalance = ba.getBalance(); // Retrieve the current balance.
        double newBalance = currentBalance + getAmount(); // Calculate the new balance after the deposit.
        ba.setBalance(newBalance); // Update the account balance.
        System.out.println("Deposit applied. New Balance: " + newBalance); // Log the new balance.
    }
}
