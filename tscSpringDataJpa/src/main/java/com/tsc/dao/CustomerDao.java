package com.tsc.dao;

import com.tsc.entity.Customer;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerDao extends JpaRepository<Customer,Long>,JpaSpecificationExecutor<Customer> {

    @Transactional
    @Query(value="update Customer set custName = ?1 where custId = ?2")
    @Modifying
    public  void updateCustomer(String custName,Long custId);

}
