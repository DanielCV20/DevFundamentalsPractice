package org.example.controller.operators;

import org.example.controller.interfaces.IAccountOperator;
import org.example.model.Transaction;
import org.example.model.TransactionType;
import org.example.model.interfaces.IDataSaver;

public class DepositOperator implements IAccountOperator {

    private IDataSaver dataSaver;

    @Override
    public boolean execute(int id, double amount) {
        Transaction deposit = new Transaction(TransactionType.DEPOSIT, amount, id);
        dataSaver.addTransaction(deposit);
        return true;
    }
}
