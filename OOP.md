# 📚 Explanation of the OOP Paradigm Using Kotlin

## 1. Origin of OOP

### Who:
Object-Oriented Programming (OOP) was conceptualized by **Alan Kay**, inspired by earlier work from **Kristen Nygaard** and **Ole-Johan Dahl**, who developed the **Simula** language in the 1960s.

### When:
The OOP paradigm was officially introduced in the **1960s**.

### Where:
The OOP paradigm was first implemented in the **Simula** language, developed in **Norway**.

## 2. Influence on and by Other Languages

### Languages that Influenced OOP:
- **Simula**: Considered the first OOP language.
- **Smalltalk**: Popularized OOP concepts.
- **C++**: Brought OOP into the mainstream with a statically typed approach.

### Languages Influenced by OOP:
- **Java**
- **C#**
- **Python**
- **Ruby**
- **Kotlin** (and other modern OOP languages)

## 3. Adoption of Kotlin as an OOP Language

**Kotlin**, developed by **JetBrains**, was officially released in **2016**. It was designed to be fully interoperable with **Java** while providing a more concise syntax and additional safety features. Kotlin quickly gained adoption due to its ease of use, modern features, and seamless integration with existing Java codebases, particularly within the **Android** development community.

## 4. Support to the OOP Paradigm in Kotlin

Kotlin is designed with object-oriented programming in mind, supporting all key OOP concepts:

- **Classes and Objects**: The foundation of OOP where a class defines a type and objects are instances of classes.
- **Inheritance**: Kotlin supports single inheritance through class hierarchies.
- **Polymorphism**: Achieved through method overriding and interface implementation.
- **Encapsulation**: Kotlin allows control over access to the internal state of objects using visibility modifiers (public, private, protected).
- **Abstraction**: Through abstract classes and interfaces, Kotlin allows developers to define a blueprint for derived classes.

## 5. Code Demonstration
Navigate to main.kt

## 6. Explanation of the code
- **Classes and Objects**: Animal is a base class, and Dog is a derived class. The Dog class inherits properties and behaviors from Animal and adds its own behavior.
- **Inheritance and Method Overriding**: The Dog class overrides the showDetails method from the Animal class to include the breed.
- **Abstract Classes and Interfaces**: Appliance is an abstract class, and SmartAppliance is an interface. The SmartLight class implements both, showcasing abstraction and the implementation of interface methods.
- **Polymorphism**: The myDog object is treated as an Animal type, but it runs the Dog's showDetails method.

