
#  Design Patterns into Functional Programming

This repository contains some examples OOP design patterns. In this dojo we will change them in a more functional way. 
Below is a brief description of the design patterns.

### Strategy Design Pattern:
![Strategy Header](src/strategy_header.png)

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

### Decorator Design Pattern:
![Decorator Header](src/decorator.png)

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

### Chain of Responsability Design Pattern:
![Chain Header](src/chain-of-responsibility.png)

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### Factory Design Pattern:
![Factory Header](src/factory-method_header.png)

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Important concepts:
* Single Abstract Method (SAM) type
    * another name for `@FunctionalInterfaces`
        * functional interface is also known as Single Abstract Method Interface
    * example: `Runnable`, `Callable`, etc
    * provide target types for lambda expressions and method references
* first-class citizen
    * is an entity which supports all the operations generally available to other entities
    * operations typically include being passed as an argument, returned from a function, modified, and
      assigned to a variable

## Design patters refresh:

### Strategy Design Pattern:
![Strategy UML](src/strategy_pattern_uml_diagram.jpg)

### Decorator Design Pattern:
![Decorator Header](src/decorator-ice-cream-example-2.png)

### Chain of Responsability Design Pattern:
![Chain Header](src/chain-responsability-diagram.webp)

### Factory Design Pattern:
![Factory Header](src/factory_pattern_uml_diagram.jpg)



## mapping
Pattern                 | Lambda
----------------------- | --------------
Chain of Responsibility | Stream of functions
Decorator               | Functions composition
Interpreter             | Map of functions
Strategy                | SAM, Function composition
Template                | SAM, Consumer
Visitor                 | Map of functions

* note that many more patterns from GOF could be rewritten in a more functional way by simply using
  SAM conversion
    * examples: 
      - `Observer` Consumer
      - `Template` Consumer
      - `Command` Function

- * references
    * [OOP v̶s̶ and FP by Mario Fusco](https://www.youtube.com/watch?v=p6cZO5V2ehw)
    * [g ∘ f patterns by Mario Fusco](https://www.youtube.com/watch?v=Rmer37g9AZM)
    * https://github.com/mariofusco/from-gof-to-lambda
    * https://en.wikipedia.org/wiki/First-class_citizen
    * https://en.wikipedia.org/wiki/First-class_function
    * https://www.quora.com/What-is-a-Single-Abstract-Method-SAM-interface-in-Java-8