package com.users.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.micro.Entity.LoyaltyPoints;

@Repository
public interface LoyalityRepository extends JpaRepository<LoyaltyPoints,Long> {

}
