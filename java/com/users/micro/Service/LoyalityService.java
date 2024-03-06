package com.users.micro.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.micro.Entity.LoyaltyPoints;
import com.users.micro.Repository.LoyalityRepository;

@Service
public class LoyalityService {
	
	@Autowired
	LoyalityRepository loyalityRepository;
	
	public LoyaltyPoints updateLoyaltyPoints(Long customerAccountNumber,Integer loyaltyPoints) {
		LoyaltyPoints exitingLoyaltyPoints=loyalityRepository.findById(customerAccountNumber)
				 .orElseThrow(() -> new RuntimeException("Loyalty points not found for customer with account number: " + customerAccountNumber));
		
		 exitingLoyaltyPoints.setLoyaltyPoints(loyaltyPoints);
	        return loyalityRepository.save(exitingLoyaltyPoints);
	}

}
