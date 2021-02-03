create database bankupon;
use bankupon;

create table users (
UserId Varchar(10) not null,
UserName Varchar(30) not null,
UserDesignation Varchar(20) not null,
UserPasswd Varchar(30) not null,
CreationDate Date);

insert into users values("shreyas","Shreyas Tandon","manager","bankupon","2017-08-02");

CREATE TABLE customers (
 CustomerId INT NOT NULL AUTO_INCREMENT,
  
CustomerName VARCHAR(40) NOT NULL,
  
FathersName VARCHAR(40) NOT NULL,
Gender CHAR(10) NOT NULL,

DateOfBirth date NOT NULL,
Address varchar(50) NOT NULL,
MobileNumber varchar(15),
PAN varchar(10),
AADHARNumber varchar(12),  
PRIMARY KEY (`CustomerId`));


CREATE TABLE accounts (
AccountNumber INT NOT NULL AUTO_INCREMENT, 
CustomerId INT NOT NULL,
 
AccountName VARCHAR(50) NOT NULL,

AccountType VARCHAR(15) NOT NULL,

AccountOpenDate DATE NOT NULL,

AccountBalance DECIMAL(10,2) NOT NULL,

ClosureDate DATE NULL,
 
PRIMARY KEY (`AccountNumber`));


CREATE TABLE transactions(

TransactionId INT NOT NULL AUTO_INCREMENT,
 
TransactionDate DATE NOT NULL,
 
TransactionType VARCHAR(15) NOT NULL,

PRIMARY KEY (`TransactionId`));


CREATE TABLE transactiondetails(

TransactionId INT NOT NULL,
 
AccountNumber INT NOT NULL,
 
TransactionParticulars VARCHAR(30), 
DebitCredit VARCHAR(10) NOT NULL,
  
TransactionAmount DECIMAL(9,2) NOT NULL,
 
BalanceAfterPosting DECIMAL(10,2) NOT NULL);






