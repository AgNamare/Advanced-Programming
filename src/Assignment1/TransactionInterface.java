package Assignment1;

import java.util.Calendar;

/**
 * Interface for Transactions.
 * Defines the blueprint for any class that implements transaction-related functionality.
 * Any class implementing this interface is expected to provide concrete implementations 
 * for retrieving transaction details such as amount, date, and a unique identifier.
 */
public interface TransactionInterface {

    /**
     * Retrieves the transaction amount.
     * @return The amount involved in the transaction as a double.
     */
    double getAmount();

    /**
     * Retrieves the transaction date.
     * @return A Calendar object representing the date and time of the transaction.
     */
    Calendar getDate();

    /**
     * Retrieves a unique identifier for the transaction.
     * @return A string representing the unique transaction ID.
     */
    String getTransactionID();
}
