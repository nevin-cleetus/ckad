package com.yourbank.mortgage.controller;
import com.yourbank.mortgage.service.MortgageEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MortgageRequestProcessorController {

    @Autowired
    private MortgageEnquiryService service;

    @PutMapping("/update/")
    public ResponseEntity<Boolean> updateStatus() {
        System.out.println("MortgageRequestProcessorController.updateStatus() called..");
        return ResponseEntity.ok(service.updateByStatus());
    }
}
