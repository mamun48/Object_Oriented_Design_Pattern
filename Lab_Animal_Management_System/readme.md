# Laboratory Animal Management System

## Description

The Laboratory Animal Management System is a Java program that is used managing laboratory animals. It allows users to create, organize, and manage information about different types of animals, such as mammals and birds, within a laboratory setting.

## Classes and Their Responsibilities:

- **Animal Class :** This is the base class for all animals in the laboratory. It stores attributes such as ID, species, gender, and age in months. The class includes getters for these attributes and overrides the toString method to provide a formatted representation of the animal's information.
- **Mammal Class:** A subclass of Animal, specialized for representing mammals. It introduces an additional attribute, furColor, specific to mammals. This class also includes a getter for furColor.

- **Bird Class:** Another subclass of Animal, specialized for representing birds. It includes an attribute canFly, indicating whether the bird can fly or not. A getter method is provided for canFly.
- **Cage Class:** Represents a cage in the laboratory. It has attributes such as cageNumber (a unique identifier) and a list of animals currently in the cage. The class includes methods to 'add' and 'remove' animals from the cage.
- **Lab Class:** Represents the laboratory and contains a list of cages. It includes methods to add and remove cages from the lab.
- **LabManager Class:** Manages laboratory operations and has a composition relationship with the Lab class. The LabManager class includes methods to 'add', 'remove', and 'search' for animals within the lab.
- **Main Class:** Serves as the entry point of the program. It demonstrates the usage of the classes and allows users to interact with the laboratory by creating instances of the Lab, Cage, and LabManager classes.
