# Design Patterns In Software Architecture

Design Patterns used in the development of Software Architectures/Frameworks

### Creational Design Patterns

- Singleton - Lazy initialization & global access to a single shared instance
  [Use Thread safe Singleton!]

> **_GIST:_** Factories allow Client code to operate on generalizations

- Factory Object
    - We can instantiate a Factory Object to create Product Objects
      ```java
      KnifeFactory knifeFactory = new KnifeFactory();
      KnifeStore knifeStore = new KnifeStore(knifeFactory);
      Knife budgetKnife = knifeStore.orderKnife(KnifeType.BUDGET_KNIFE);
      Knife chefsKnife = knifeStore.orderKnife(KnifeType.CHEFS_KNIFE);
      ```
    - The Client class does not need to name Concrete classes and now deals with a single Parent class Generalization '
      This is called Coding to an Interface not an implementation'
    - Although it's a useful technique the Factory Object is not actually one of the Gang Of Four Design Patterns


- Factory Method
    - The Factory Method Intent is to define an Interface for creating objects, but let the subclasses decide which
      class to instantiate
      ```java
       public abstract class KnifeStore {
          // You run the common orderKnife() method from
          // any subclass of KnifeStore
          public Knife orderKnife(KnifeType knifeType) {
              log.info("Received order for {} ", knifeType);
              return createKnife(knifeType);
          }
          // createKnife() is the Factory method defined in this super class
          // but, it's abstract & empty
          public abstract Knife createKnife(KnifeType knifeType);
      }
      ```
    - We left the factory method empty and called it abstract because we want the Factory Method to be defined by the
      subclasses
      ```java
      public class BudgetKnifeStore extends KnifeStore {
          // up to any subclass of KnifeStore to define this method
          @Override
          public Knife createKnife(KnifeType knifeType) {
              //...
          }
      }
      
      KnifeStore budgetKnifeStore = new BudgetKnifeStore();
      Knife budgetSharpKnife = budgetKnifeStore.orderKnife(KnifeType.BUDGET_SHARP_KNIFE); 
      ```

### Structural Design Patterns

- Facade Design Pattern
    - A Facade simply acts as a point of entry into your subsystem
    - It's a Wrapper class that encapsulates a subsystem in order to hide the subsystem's complexity
    - This wrapper class will allow a client class to interact with the subsystem through a Facade
    - Steps to implement
        - Design the Interface
        - Implement the interface with one or more classes
        - Create the Facade class and wrap the classes that implement the interface 


- Adapter Design Pattern
  - The Adapter Design Pattern is a technique that helps bridge the gap between two incompatible interfaces 


### Behavioural Design Patterns

- Template Design Pattern
  - The template method is useful when we have two classes have with similar functionality
  - When you notice two classes with a very similar order of operations, you can choose to use a template method


### Model-View-Controller (MVC) Pattern

-  


### Design Principles underlying Design Patterns

- Liskov Substitution Principle [refer docs]


- Composing Objects Principle
  - This principle states that classes should achieve code reuse through aggregation rather than inheritance in order to reduce tight coupling
  - Uses Aggregation & Delegation to offer less coupling than inheritance
  - Ex: Composite Design Pattern, Decorator Design Pattern


- Interface Segregation Principle
  - A class should not be forced to depend on methods it does not use
  - Interfaces should be split up in such a way that it can properly describe the separate functionalities of your system
  - Remember that Interfaces are just descriptions of what parts your system can do. And the better the description the easier it'll be to create, update & maintain your software
  

## Java Specific Patterns

- Retry Pattern

### Credits

- [Retry Pattern](https://medium.com/javarevisited/retry-pattern-fail-safe-strategy-2244f6bd247c)