package com.users.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.micro.Entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
