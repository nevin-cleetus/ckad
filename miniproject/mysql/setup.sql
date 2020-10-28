CREATE DATABASE yourbank;

USE yourbank;


CREATE TABLE `mortgage_enquiry` (
  `first_name` varchar(150) NOT NULL,
  `last_name` varchar(150) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `status` CHAR(1) NOT NULL     
);




