package com.users.micro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.micro.Entity.Transactions;
import com.users.micro.Repository.TransactionsRepository;

@Service
public class TransactionsService {
	 @Autowired
	    private TransactionsRepository transactionsRepository;

	    @Autowired
	    private LoyalityService loyalityService;

	    public Transactions createTransaction(String transactionType, Long accountNumberFrom, Long accountNumberTo,
	                                          Long loyaltyPointsCreditTo, Long loyaltyPointsDebitFrom, Integer loyaltyPoints,
	                                          Double transactionAmount, Integer totalLoyaltyPoints) {
	        Transactions transaction = new Transactions();
	        transaction.setTransactionType(transactionType);
	        transaction.setAccountNumberFrom(accountNumberFrom);
	        transaction.setAccountNumberTo(accountNumberTo);
	        transaction.setLoyaltyPointsCreditTo(loyaltyPointsCreditTo);
	        transaction.setLoyaltyPointsDebitFrom(loyaltyPointsDebitFrom);
	        transaction.setLoyaltyPoints(loyaltyPoints);
	        transaction.setTransactionAmount(transactionAmount);
	        transaction.setTotalLoyaltyPoints(totalLoyaltyPoints);
	        
	        Transactions savedTransaction = transactionsRepository.save(transaction);

	        
	        if (loyaltyPointsCreditTo != null) {
	        	loyalityService.updateLoyaltyPoints(loyaltyPointsCreditTo, totalLoyaltyPoints);
	        }
	        if (loyaltyPointsDebitFrom != null) {
	        	loyalityService.updateLoyaltyPoints(loyaltyPointsDebitFrom, totalLoyaltyPoints);
	        }

	        return savedTransaction;

}
}
