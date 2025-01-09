package Assignment1;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

/**
 * Represents a base implementation of a transaction.
 * Implements the TransactionInterface to define core behaviors for a transaction.
 */
public class BaseTransaction implements TransactionInterface {
    /**
     * Amount involved in the transaction.
     */
    private final int amount;

    /**
     * Date and time of the transaction.
     */
    private final Calendar date;

    /**
     * Unique identifier for the transaction.
     */
    private final String transactionID;

    /**
     * Constructor to create a new BaseTransaction.
     * @param amount The amount involved in the transaction.
     * @param date The date and time of the transaction. This value is cloned to ensure immutability.
     */
    public BaseTransaction(int amount, @NotNull Calendar date) {
        this.amount = amount;
        this.date = (Calendar) date.clone();
        int uniq = (int) (Math.random() * 10000); // Generate a unique integer for the transaction ID.
        transactionID = date.toString() + uniq; // Combine date and unique integer for transaction ID.
    }

    /**
     * Retrieves the amount of the transaction.
     * @return The transaction amount as a double.
     */
    @Override
    public double getAmount() {
        return amount;
    }

    /**
     * Retrieves the date of the transaction.
     * @return A cloned Calendar object representing the transaction date.
     */
    @Override
    public Calendar getDate() {
        return (Calendar) date.clone();
    }

    /**
     * Retrieves the unique transaction ID.
     * @return A string representing the transaction ID.
     */
    @Override
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Prints the details of the transaction, including ID, amount, and date.
     */
    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    /**
     * Applies the transaction to a bank account.
     * This implementation does not perform any actions.
     * @param ba The BankAccount to which the transaction is applied.
     * Frame condition: Does not modify the BankAccount state.
     */
    @Override
    public void apply(BankAccount ba) {
        System.out.println("Base transaction applied (no action).");
    }
}
