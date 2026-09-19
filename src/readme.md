# Supercar Dealership Management System
**Course:** Software Design Patterns  
**Assignment:** #2 — Factory Method & Abstract Factory

---

## 1. Domain Description
This project implements a software architecture for a **Supercar Dealership System**. The application manages high-performance vehicle delivery and component configuration using creational design patterns.

The system is split into two primary components:
1. **Part A — Factory Method:** Handles top-level supercar creation (`ElectricSupercar` vs. `V12Supercar`), delegating instantiation to specific factory subclasses without coupling client code to concrete car classes.
2. **Part B — Abstract Factory:** Manages families of performance packages (`HyperTech` electric vs. `TrackMotorsport` V8). It ensures that compatible components (`Engine` and `BodyKit`) are manufactured together without mixing incompatible technologies.

---

## 2. Project Structure
```text
src/
├── parta_factory_method/
│   ├── product/
│   │   ├── Supercar.java             (Product Interface)
│   │   ├── ElectricSupercar.java     (Concrete Product 1)
│   │   └── V12Supercar.java          (Concrete Product 2)
│   └── factory/
│       ├── SupercarFactory.java      (Creator Abstract Class)
│       ├── ElectricFactory.java      (Concrete Creator 1)
│       └── V12Factory.java           (Concrete Creator 2)
│
├── partb_abstract_factory/
│   ├── products/
│   │   ├── Engine.java               (Abstract Product A)
│   │   ├── BodyKit.java              (Abstract Product B)
│   │   ├── ElectricEngine.java       (Concrete Product A1 - Family 1)
│   │   ├── AeroCarbonBodyKit.java    (Concrete Product B1 - Family 1)
│   │   ├── TwinTurboV8Engine.java    (Concrete Product A2 - Family 2)
│   │   └── WidebodyAluminumKit.java  (Concrete Product B2 - Family 2)
│   └── factory/
│       ├── CarPackageFactory.java    (Abstract Factory Interface)
│       ├── HyperTechPackageFactory.java (Concrete Factory 1 - Family 1)
│       └── TrackMotorsportFactory.java  (Concrete Factory 2 - Family 2)
│
└── Main.java                         (Client Application)