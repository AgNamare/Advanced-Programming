package Assignment1;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

/**
 * Represents a withdrawal transaction that decreases the balance of a bank account.
 * Extends the BaseTransaction class to inherit common transaction properties and behaviors.
 */
public class WithdrawalTransaction extends BaseTransaction {
    /**
     * The original balance of the bank account before the withdrawal was applied.
     */
    private double originalBalance;

    /**
     * Constructor to create a new WithdrawalTransaction.
     * @param amount The amount to withdraw.
     * @param date The date and time of the withdrawal. This value is passed to the BaseTransaction constructor.
     */
    public WithdrawalTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    /**
     * Prints the details of the withdrawal transaction.
     * Overrides the base implementation to add a specific label for withdrawal transactions.
     */
    @Override
    public void printTransactionDetails() {
        System.out.println("Withdrawal Transaction:");
        super.printTransactionDetails(); // Reuse the base method to print common details.
    }

    /**
     * Applies the withdrawal to a bank account by reducing its balance.
     * Throws an InsufficientFundsException if the withdrawal amount exceeds the account balance.
     * @param ba The BankAccount to which the withdrawal is applied.
     * @throws InsufficientFundsException If the withdrawal amount exceeds the current balance.
     * Frame condition: Modifies the balance of the given BankAccount if sufficient funds are available.
     */
    public void apply(BankAccount ba) throws InsufficientFundsException {
        originalBalance = ba.getBalance(); // Store the original balance.
        double newBalance = originalBalance - getAmount(); // Calculate the new balance after the withdrawal.

        try {
            if (newBalance < 0) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            }
            ba.setBalance(newBalance); // Update the account balance.
            System.out.println("Withdrawal applied. New Balance: " + newBalance); // Log the new balance.
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // Log the exception message.
        }
    }

    /**
     * Reverses the withdrawal by restoring the original balance.
     * This is useful in cases where the withdrawal transaction needs to be undone.
     * @param ba The BankAccount to which the reversal is applied.
     * @return true if the reversal is successful.
     * Frame condition: Restores the balance of the given BankAccount to its original state.
     */
    public boolean reverse(BankAccount ba) {
        ba.setBalance(originalBalance); // Restore original balance.
        System.out.println("Withdrawal reversed. Balance restored to: " + originalBalance); // Log the reversal.
        return true;
    }
}
