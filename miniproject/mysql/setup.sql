CREATE DATABASE yourbank;

USE yourbank;


CREATE TABLE `mortgage_enquiry` (
  `id` int(11) NOT NULL,
  `customer_name` varchar(150) NOT NULL,
  `ssn` varchar(100) DEFAULT NULL,
  `mobile_number` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `loan_amount` varchar(150) DEFAULT NULL,
  `status` CHAR(1) NOT NULL
);

