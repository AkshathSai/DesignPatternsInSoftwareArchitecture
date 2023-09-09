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
  - The Client class does not need to name Concrete classes and now deals with a single Parent class Generalization 'This is called Coding to an Interface not an implementation'
  - Although it's a useful technique the Factory Object is not actually one of the Gang Of Four Design Patterns

  
- Factory Method 
  - The Factory Method Intent is to define an Interface for creating objects, but let the subclasses decide which class to instantiate
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
  - We left the factory method empty and called it abstract because we want the Factory Method to be defined by the subclasses   
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
