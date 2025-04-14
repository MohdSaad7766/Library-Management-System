package com.s.d.Library_Management_System.converter;

import com.s.d.Library_Management_System.enums.TransactionType;
import com.s.d.Library_Management_System.model.Transaction;
import com.s.d.Library_Management_System.requestdto.TransactionDto;

public class TransactionConverter {
    public static Transaction transactionConverter(TransactionDto transactionDto){
        Transaction transaction = new Transaction();

        transaction.setFineAmount(0);
        transaction.setTransactionType(TransactionType.BORROW);
        transaction.setDueDate(transactionDto.getDueDate());

        return transaction;
    }
}
