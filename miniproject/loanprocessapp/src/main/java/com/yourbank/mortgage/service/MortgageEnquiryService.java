package com.yourbank.mortgage.service;

import com.yourbank.mortgage.model.MortgageEnquiry;

import java.util.List;


public interface MortgageEnquiryService {
    MortgageEnquiry getByCustomerName(String customerName);
    Boolean updateByStatus();
}
