package com.users.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.micro.Entity.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions,Long> {

}
