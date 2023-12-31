# Design Pattern

## Singleton

* This pattern suggest do constructor private class for avoid, that to be used the operator new()
* Create a static method which act as constructor and back call the constructor private for create a object that save the instance in a static variable
* <img width="537" alt="Screenshot 2023-09-27 at 18 40 07" src="https://github.com/edzamo13/design-pattern/assets/16899164/3b2721de-7dae-4578-9915-9647461343c4">

## Pros and Contras

* Pros
  * Only one class instance
  * Only a point access global
  * Instance begin when need first time
* Contras
  * Single responsibility only is Vulnerable
  * Complexity Raise on enviroment multipl threads ejecution
  * Complexity with create unity test

## When to use?

* Only a point access
* For connection to database: example= state management library

## Factory

* Declare base product class/interface, this will be returned by factory class and their sub classes.
* Implement concretes product sub clases that inherits/implements the base product class/interace
* Declare factory class/interface that returns objects that match the base product, not the conrete products
* Implements concrete factories sub clases that inherits/implements the base factory class/interface. These classes will return concrete products in their factory method
* <img width="1337" alt="Screenshot 2023-09-28 at 16 42 29" src="https://github.com/edzamo13/design-pattern/assets/16899164/3ca7713a-d99e-4427-bac9-86c1bc85a0bf">

## Pros and Contras

* Pros
  * Avoid a coupling height between the creators element and the products
  * The Create of product happen in only point
  * Add new product don't require ,modification the code exit,extends it
* Contras
  * Many Code Generic, new product, new Factory
  * Many Abstraction

## When to use?

* Use it when do you don't how many product different there will be
* When do you need uncoupling the use of the product with its creation
* Extend the functionality of library or framework
  * example: UI library, Framework web

## Abstract Factory

* Declare base product class/interface, fo each product in the catalog
* Implement concretes product sub clases that inherits/implements the base product class/interace, for each of the family types.
* Declare factory class/interface that declare creation methods for each base product.
* Create concrete factories that implemnets all of the defined creation methods in the abstract factory
* <img width="1019" alt="Screenshot 2023-09-29 at 16 10 05" src="https://github.com/edzamo13/design-pattern/assets/16899164/e602743e-dc0a-4e19-8cd3-04be342fa691">

## Pros and Contras

* Pros
  * Avoid a coupling height between the creators element and the products
  * The products return for the factories are interchangeable
  * The Create of product happen in only point
  * Add new product don't require ,modification the code exit,extends it
* Contras
  * Many Code Generic, new product, new Factory, new version
  * If the base products add some element, all the product concrete must implement the change
  * Depend on that exist families of products

## When to use?

* Use when do you have variants of the product base that share same and can be join in families
* When do we want that the products new will be integration with the existen
  * example: Implementation of a design system

## Builder

* Declare Builder base class/interface whi will define the general steps for build products, each build must implements these steps
* Implements concrete builders sub classes that inherits/implements base builder class/interface that offer different versions of the build steps
* Implement Product classes, these ones could not belong to the same base class/interface.
* Implement directosr class this one will know the build process for each product, so we can create specific configurations for the products.
* <img width="735" alt="Screenshot 2023-10-02 at 11 34 53" src="https://github.com/edzamo13/design-pattern/assets/16899164/9e1d0a41-4631-40e5-9393-0ac1a93e7036"> 
    <img width="559" alt="Screenshot 2023-10-02 at 11 36 48" src="https://github.com/edzamo13/design-pattern/assets/16899164/a6645c8d-eccf-48ba-bb0b-d04d6feb62a0">

## Pros and Contras

* Pros
  * We can build object step by step, defer some of these or use recursion
  * Can reuse the same build process for build diferente product representative
  * Isolate the configuration of construction in a only place
  * New configurations don't require modify the existen
* Contras
  * Many Code Generic, new product, new builder
  * Mutation of object product.

## When to use?

* Use when you want avoid have a contructor telescopic
* When do you want that exist diferente representations of same product. example Car, vehicle, manual the process build is same and detallis change
* When do want have control about the proces of object creation
  * example: Build queries for data base
