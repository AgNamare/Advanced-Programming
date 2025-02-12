package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

public class DepositTransaction extends Base_Transaction {

    public DepositTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Deposit Transaction:");
        super.printTransactionDetails();
    }

    @Override
    public void apply(BankAccount ba) {
        double currentBalance = ba.getBalance();
        double newBalance = currentBalance + getAmount();
        ba.setBalance(newBalance);
        System.out.println("Deposit applied. New Balance: " + newBalance);
    }
}
