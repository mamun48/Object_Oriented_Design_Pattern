# Simple Banking System using Facade Pattern

## Introduction

This Java-based banking system is designed to help users create and manage various types of bank accounts, perform financial transactions, and check their account balances. The system includes three types of accounts: Chequing, Saving, and Investment.

## Class and Interface Overview

### Account Interface

The `Account` interface defines the core methods that all types of bank accounts must implement. These methods include:

- `void deposit(BigDecimal amount)`: Deposits a specified amount into the account.
- `void withdraw(BigDecimal amount)`: Withdraws a specified amount from the account.
- `void transfer(Account toAccount, BigDecimal amount)`: Transfers a specified amount from one account to another.
- `int getAccountNumber()`: Retrieves the unique account number associated with the account.
- `BigDecimal getBalance()`: Retrieves the current balance of the account.

### Chequing Class

The `Chequing` class represents a checking (chequing) account and implements the `Account` interface. Key features include:

- `balance`: A `BigDecimal` representing the current balance of the account.
- `accountNumber`: An integer representing the unique account number.

### Saving Class

The `Saving` class represents a savings account and also implements the `Account` interface. It includes methods for depositing, withdrawing, transferring money, and checking the balance.

### Investment Class

The `Investment` class represents an investment account and implements the `Account` interface. Like the other account types, it tracks the account's balance and account number.

### BankService Class

The `BankService` class manages a collection of bank accounts using a Hashtable data structure.It is our facade class. It provides the following functionalities:

- `createNewAccount(String type, BigDecimal initAmount)`: Creates a new bank account of the specified type (chequing, saving, or investment) with an initial amount. It returns the account number.
- `transferMoney(int to, int from, BigDecimal amount)`: Transfers a specified amount from one account to another.
- `getBalance(int accountNumber)`: Retrieves the balance of an account based on its account number.




