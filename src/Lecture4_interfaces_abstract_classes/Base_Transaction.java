package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class Base_Transaction {
  public final int amount;
  public final Calendar date;
  public final String transactionID;
  public Base_Transaction(int amount, @NotNull Calendar date)  {
    this.amount = amount;
    this.date = (Calendar) date.clone();
    int uniq = (int) Math.random()*10000;
    transactionID = date.toString()+uniq;
  }

  public double getAmount() {
    return amount;
  }

  
}