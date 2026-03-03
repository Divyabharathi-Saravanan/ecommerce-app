# 🛒 E-Commerce Application (Spring Boot)

## 📌 Project Overview

This project is a backend-based **E-Commerce Application** developed using Java and Spring Boot.
It provides REST APIs for browsing products, managing shopping cart functionality, and simulating payment processes.

The application follows a layered architecture using Controller, Service, and Repository layers.

---

## 🚀 Features

* 📦 Product Catalog Management
* 🛒 Add to Cart functionality
* 🧾 Order Processing
* 💳 Payment Simulation
* 🔄 RESTful API Integration
* 🗄️ Database Integration using Hibernate (JPA)

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* REST APIs
* MySQL / H2 Database

---

## 🏗️ Project Architecture

The project follows standard Spring Boot architecture:

* Controller Layer – Handles HTTP requests
* Service Layer – Business logic
* Repository Layer – Database operations
* Entity Classes – Database mapping

---

## 📂 Project Structure

```
ecommerce-application/
│── src/main/java/com/example/ecommerce/
│     ├── controller/
│     ├── service/
│     ├── repository/
│     ├── entity/
│── src/main/resources/
│     ├── application.properties
│── pom.xml
```

---

## 💻 How to Run the Project

1. Clone the repository
2. Open the project in IntelliJ / Eclipse
3. Configure database in `application.properties`
4. Run the main Spring Boot application class
5. Access APIs using Postman or browser

Default Port: `http://localhost:8082`

---

## 🔗 Sample API Endpoints

* GET /products – View all products
* POST /products – Add new product
* POST /cart/add – Add product to cart
* POST /order/place – Place order

---

## 🎯 Learning Objectives

* Understanding REST API development
* Working with Spring Boot framework
* Database integration using Hibernate
* Building layered backend architecture

---

## 📌 Future Enhancements

* User Authentication (JWT / Spring Security)
* Real Payment Gateway Integration
* Order History Tracking
* Admin Dashboard

---

## 👩‍💻 Developed By

Divya Bharathi

---

## 📄 License

This project is developed for educational and learning purposes.
