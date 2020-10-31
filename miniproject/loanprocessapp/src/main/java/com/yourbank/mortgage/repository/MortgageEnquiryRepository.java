package com.yourbank.mortgage.repository;

import com.yourbank.mortgage.model.MortgageEnquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MortgageEnquiryRepository
        extends JpaRepository<MortgageEnquiry, String> {
    MortgageEnquiry findByCustomerName(String customerName);
    List<MortgageEnquiry>  findByStatus(String status);
}