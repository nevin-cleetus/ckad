package com.yourbank.mortgage.service.impl;

import com.yourbank.mortgage.model.MortgageEnquiry;
import com.yourbank.mortgage.repository.MortgageEnquiryRepository;
import com.yourbank.mortgage.service.MortgageEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortgageEnquiryServiceImpl implements MortgageEnquiryService {

    @Autowired
    private MortgageEnquiryRepository mortgageEnquiryRepository;

    @Override
    public MortgageEnquiry getByCustomerName(String customerName) {

        return mortgageEnquiryRepository.findByCustomerName(customerName);
    }
    @Override
    public Boolean updateByStatus() {

        List<MortgageEnquiry> mortgageEnquiryList =
                mortgageEnquiryRepository.findByStatus("A");

        System.out.println("MortgageEnquiryServiceImpl.updateByStatus() called..");
        System.out.println("Size:" + mortgageEnquiryList.toString());

        for(MortgageEnquiry mortgageEnquiry : mortgageEnquiryList) {
            mortgageEnquiry.setStatus("C");
            mortgageEnquiryRepository.save(mortgageEnquiry);
        }
        return true;
    }
}
