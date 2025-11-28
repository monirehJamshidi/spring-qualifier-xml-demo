# spring-qualifier-xml-demo


## 📌 Overview
This project demonstrates Dependency Injection (DI) and Qualifier usage in Spring Framework using XML configuration and component scanning.

The project contains multiple implementations of the Car interface (BMW and Kia) and a Manager class where Spring must decide which bean to inject.
The @Qualifier annotation is used to resolve ambiguity and explicitly select the desired bean.

## 📂 Project Structure

src/main/java/org/j2os/\
├─ Car.java\
├─ BMW.java\
├─ Kia.java\
├─ Manager.java\
├─ Main.java\
└─ Spring.java\

src/main/resources/\
└─ spring.xml\


## 🧩 Key Features
- XML-based Spring configuration
- Component scanning (<context:component-scan>)
- Using @Qualifier to select a specific bean
- Prototype-scoped Manager class
- Retrieving beans manually using a custom Spring helper class

## ▶️ How to Run
1. Import the project into IntelliJ IDEA or Eclipse.
2. Make sure you have Spring Core and Spring Context on your classpath.
3. Run the Main class.

Expected output:

constructor Manager1 **
Manager 1
Kia started ...


## 🎯 Purpose
This project is ideal for learning:
- How Spring resolves multiple bean candidates
- How to use @Qualifier in XML-based environments
- The difference between bean names and bean types
- Basic IoC/DI concepts
