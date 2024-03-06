package com.users.micro.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.micro.Entity.Customer;
import com.users.micro.Entity.LoyaltyPoints;
import com.users.micro.Repository.CustomerRepository;
import com.users.micro.Repository.LoyalityRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    LoyalityRepository loyalityRepository;

    public Customer createCustomer(Customer customer) {
        
        customer.setLoyaltyPoints(150);

       
        Customer savedCustomer = customerRepository.save(customer);

    
        Long loyaltyPointsNumber = generateLoyaltyPointsNumber();
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints();
        loyaltyPoints.setCustomerAccountNumber(savedCustomer.getCustomerAccountNumber());
        loyaltyPoints.setLoyaltyPointsNumber(loyaltyPointsNumber);
        loyaltyPoints.setLoyaltyPoints(150); 
        loyalityRepository.save(loyaltyPoints);

        return savedCustomer;
    }

    private Long generateLoyaltyPointsNumber() {
        return (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    }

	public Customer getAllDetails() {
		
		return (Customer) customerRepository.findAll();
	}

	   public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }
    


}
