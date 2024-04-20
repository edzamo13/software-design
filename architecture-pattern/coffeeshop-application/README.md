# Hexagonal Architecture With Spring Boot

Hexagonal architecture has become a popular architectural pattern for separating business logic from
the infrastructure. This separation allows us to delay decisions about technology or easily replace
technologies. It also makes it possible to test the business logic in isolation from external
systems.

[Hexagonal Architecture Explained](https://www.arhohuttunen.com/hexagonal-architecture)

![coffee-shop-use-cases](https://github.com/edzamo13/software-design/assets/16899164/5952bb86-05ee-44b0-ae43-ad53a5e3d205)

For example, in a coffee shop application, there could be a point of sale UI which handles taking
orders
for coffee. When the barista submits an order, a REST adapter takes the HTTP POST request and
translates
it to the form understood by a port. Calling the port triggers the business logic related to placing
the order inside the application. The application itself doesn’t know that it is being operated
through a REST API.
![img.png](img.png)

## Primary and Secondary Adapters

As we have seen, some adapters invoke use cases of the application, while some others react to
actions triggered by the application. The adapters that control the application are called primary
or driving adapters, usually drawn to the left side of the diagram. The adapters that are controlled
by the application are called secondary or driven adapters, usually drawn to the right of the
diagram.
![img_1.png](img_1.png)