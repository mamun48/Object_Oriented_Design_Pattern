# Vending Machine State Design Pattern

This program showcases a vending machine simulation employing the State Design Pattern.

## Overview

The vending machine is built to replicate the functionality of a basic vending machine using states such as item selection, money insertion, transaction execution, and change return. Each state is represented by a separate class following the State Design Pattern.

## Classes and Interfaces

### VendingMachine

- Maintains the current state and directs requests to the appropriate state class.
- **Methods**:
  - `setCurrentState(VendingMachineState currentState)`
  - `selectItem(String item)`
  - `insertMoney(int amount)`
  - `executeTransaction()`
  - `returnChange()`

### VendingMachineState Interface

- Defines the required methods for vending machine states.
- **Methods**:
  - `selectItem(String item)`
  - `insertMoney(int amount)`
  - `executeTransaction()`
  - `returnChange()`

### NoSelectionState

- Represents the initial state when no item is selected.
- **Methods**:
  - `selectItem(String item)`
  - `insertMoney(int amount)`
  - `executeTransaction()`
  - `returnChange()`

### HasSelectionState

- Represents the state when an item is selected.
- **Methods**:
  - `selectItem(String item)`
  - `insertMoney(int amount)`
  - `executeTransaction()`
  - `returnChange()`

### MoneyInsertedState

- Represents the state after money is inserted following item selection.
- **Methods**:
  - `selectItem(String item)`
  - `insertMoney(int amount)`
  - `executeTransaction()`
  - `returnChange()`

