
# Moto Rental Application

## Overview
The **Moto Rental Application** is a Java-based project designed to help users rent motorcycles conveniently. It allows users to browse available motorcycles, book rentals, and calculate rental costs based on rental duration and motorcycle specifications. The application emphasizes object-oriented programming (OOP) principles, ensuring modularity, scalability, and ease of maintenance.

## Features
- **Browse Motorcycles**: Users can view a list of available motorcycles with details such as model, brand, rental price per day, and availability.
- **Rental Booking**: Users can rent a motorcycle by providing necessary information like rental duration.
- **Cost Calculation**: The application calculates the rental cost based on the type of motorcycle and the number of days booked.
- **Object-Oriented Design**: Implemented using Java's OOP principles for efficient and maintainable code.
- **Error Handling**: Robust error handling for invalid inputs and special cases.


- **Main.java**: The main class that handles the application's execution and user interface.
- **Motorcycle.java**: The class representing a motorcycle entity, including details like brand, model, rental rate, and availability status.
- **Customer.java**: The class representing a customer, including details such as name and contact information.
- **Rental.java**: The class that handles rental transactions and computes the total cost based on duration and motorcycle.
- **RentalManager.java**: Manages the rental process, availability checks, and storing rental history.

## Installation & Usage
1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/moto-rental-application.git
    cd moto-rental-application
    ```

2. **Compile the Java files**:
    ```bash
    javac src/*.java
    ```

3. **Run the application**:
    ```bash
    java src.Main
    ```

## Requirements
- Java Development Kit (JDK) version 8 or above.
- Basic knowledge of Java and object-oriented programming.

## Future Enhancements
- Implement a graphical user interface (GUI) using JavaFX or Swing.
- Add a database connection to store rental records and customer data.
- Provide a user registration and login system.
- Extend support for different types of vehicles (e.g., cars, trucks).


