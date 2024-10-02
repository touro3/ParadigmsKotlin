# 📚 Explanation of the OOP Paradigm Using Kotlin

## Origins of the Kotlin Language
Kotlin was created by a team of developers at JetBrains, led by Andrey Breslav. The development started in 2010, and the language was officially released in February 2016. JetBrains, well-known for developing the IntelliJ IDEA, is a software company based in Russia. The name Kotlin comes from an island near St. Petersburg, Russia, as a nod to the company's origin.

## Influences from Other Languages
Kotlin was influenced by several programming languages, including:

Java: Kotlin is fully interoperable with Java and inherits many of its concepts while aiming to solve some of Java’s limitations.
Scala: Inspired aspects like immutability and functional expressiveness.
Groovy: Contributed to the simplified and concise syntax.
C#: Influenced some object-oriented and extension features.
JavaScript: Provided inspiration for flexibility and simplicity in the language design.
Kotlin was designed to be safer and more concise than Java, especially by addressing common issues like NullPointerExceptions.

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

