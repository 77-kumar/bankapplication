package com.users.micro.Controlers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.micro.Entity.Customer;
import com.users.micro.Service.CustomerService;
import com.users.micro.Service.TransactionsService;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;
   
    
    @Autowired
    TransactionsService transactionsService;
    @PostMapping("/createCustomer")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer){
    	Customer createdCustomer=customerService.createCustomer(customer);
    	
    	String responce="customer created successfully \n"+
    	" Customer name : "+createdCustomer.getFirstName()+"\n"+
    	" last name : "+createdCustomer.getLastName()+"\n"+
    	" Account number : "+createdCustomer.getCustomerAccountNumber()+"\n"+
    	" Card number : "+ generateCardNumber()+"\n"+
        "Loyalty Points Number: " + generatedLoyaltyPointsNumber();
    	return new ResponseEntity<>(responce,HttpStatus.CREATED);
    }
    private Long generateCardNumber() {
        return (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    }
    private Long generatedLoyaltyPointsNumber() {
        return (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    }
    

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        if (!customers.isEmpty()) {
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    


    	
    
}
