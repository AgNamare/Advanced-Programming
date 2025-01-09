/**
 * Exception thrown when a transaction cannot be completed due to insufficient funds.
 * Extends the base Exception class to provide a custom error message.
 */
public class InsufficientFundsException extends Exception {

    /**
     * Constructs a new InsufficientFundsException with the specified error message.
     * @param message The error message describing the insufficient funds condition.
     */
    public InsufficientFundsException(String message) {
        super(message); // Pass the error message to the superclass constructor.
    }
}
