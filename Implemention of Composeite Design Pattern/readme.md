# Composite Design Pattern Implementation

This program demonstrates the Composite design pattern, a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. In this example, we create a building composed of generic housing structures, including apartments and houses. The program illustrates how the Composite pattern enables the treatment of individual housing structures and composite structures (buildings) uniformly.

## Classes and Interfaces

1. **HousingStructure (Interface)**
   - This interface defines the common interface for all leaf and composite housing structures.
   - It declares the `display` method, which must be implemented by concrete classes.

2. **Apartment (Leaf Class)**
   - Represents an individual apartment as a leaf element.
   - Implements the `HousingStructure` interface and overrides the `display` method to display apartment details.

3. **House (Leaf Class)**
   - Represents an individual house as a leaf element.
   - Implements the `HousingStructure` interface and overrides the `display` method to display house details.

4. **Building (Composite Class)**
   - Represents a building that can contain a combination of apartments, houses, or even sub-buildings.
   - Implements the `HousingStructure` interface, allowing it to be treated as a leaf or a composite element.
   - Contains a list of `HousingStructure` objects, allowing it to manage its sub-elements.
   - Provides methods to add and remove sub-elements.
   - Overrides the `display` method to display the building's name and its contained structures.



## Purpose

The purpose of this program is to illustrate how the Composite design pattern can be used to create a hierarchical structure of objects. It allows you to treat individual objects (leaf elements) and composite objects (composite elements) uniformly, simplifying the client code and enabling the construction of complex structures.

