package com.users.micro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Loyalty_Points")
public class LoyaltyPoints {
    @Id
    @Column(name = "Customer_account_Number")
    private Long customerAccountNumber;

    @Column(name = "Loyalty_Points_Number")
    private Long loyaltyPointsNumber;

    @Column(name = "Loyalty_Points")
    private Integer loyaltyPoints;



	public Long getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(Long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public Long getLoyaltyPointsNumber() {
		return loyaltyPointsNumber;
	}

	public void setLoyaltyPointsNumber(Long loyaltyPointsNumber) {
		this.loyaltyPointsNumber = loyaltyPointsNumber;
	}

	public Integer getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(Integer loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
    

}
