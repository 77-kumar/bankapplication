package com.users.micro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Transaction_ID")
	    private Long transactionId;

	    @Column(name = "Transaction_Type", nullable = false)
	    private String transactionType;

	    @Column(name = "Account_Number_From")
	    private Long accountNumberFrom;

	    @Column(name = "Account_Number_To")
	    private Long accountNumberTo;

	    @Column(name = "Loyalty_Points_Credit_To")
	    private Long loyaltyPointsCreditTo;

	    @Column(name = "Loyalty_Points_Debit_From")
	    private Long loyaltyPointsDebitFrom;

	    @Column(name = "Loyalty_Points", nullable = false)
	    private Integer loyaltyPoints;

	    @Column(name = "Transaction_Amount", nullable = false)
	    private Double transactionAmount;

	    @Column(name = "Total_Loyalty_Points", nullable = false)
	    private Integer totalLoyaltyPoints;

		public Long getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(Long transactionId) {
			this.transactionId = transactionId;
		}

		public String getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}

		public Long getAccountNumberFrom() {
			return accountNumberFrom;
		}

		public void setAccountNumberFrom(Long accountNumberFrom) {
			this.accountNumberFrom = accountNumberFrom;
		}

		public Long getAccountNumberTo() {
			return accountNumberTo;
		}

		public void setAccountNumberTo(Long accountNumberTo) {
			this.accountNumberTo = accountNumberTo;
		}

		public Long getLoyaltyPointsCreditTo() {
			return loyaltyPointsCreditTo;
		}

		public void setLoyaltyPointsCreditTo(Long loyaltyPointsCreditTo) {
			this.loyaltyPointsCreditTo = loyaltyPointsCreditTo;
		}

		public Long getLoyaltyPointsDebitFrom() {
			return loyaltyPointsDebitFrom;
		}

		public void setLoyaltyPointsDebitFrom(Long loyaltyPointsDebitFrom) {
			this.loyaltyPointsDebitFrom = loyaltyPointsDebitFrom;
		}

		public Integer getLoyaltyPoints() {
			return loyaltyPoints;
		}

		public void setLoyaltyPoints(Integer loyaltyPoints) {
			this.loyaltyPoints = loyaltyPoints;
		}

		public Double getTransactionAmount() {
			return transactionAmount;
		}

		public void setTransactionAmount(Double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}

		public Integer getTotalLoyaltyPoints() {
			return totalLoyaltyPoints;
		}

		public void setTotalLoyaltyPoints(Integer totalLoyaltyPoints) {
			this.totalLoyaltyPoints = totalLoyaltyPoints;
		}
	    

}
