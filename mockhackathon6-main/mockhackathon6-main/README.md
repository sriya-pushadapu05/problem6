# 🚀 InternetBot – Selenium Java Automation Framework

## 📌 Project Overview

InternetBot is a **Selenium-Java Test Automation Framework** developed to automate various UI scenarios from the practice application:

🔗 https://the-internet.herokuapp.com

The framework is built using **Page Object Model (POM)** and follows best practices for **scalability, reusability, and maintainability**.

---

## 🎯 Objectives

* Automate real-world web testing scenarios
* Implement clean **POM-based architecture**
* Use **TestNG** for test execution
* Handle dynamic elements, alerts, and file uploads
* Capture screenshots on failure
* Generate **HTML reports using ExtentReports**

---

## 🧱 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* ExtentReports

---

## 📁 Project Structure

```
src
 ├── main
 │    ├── java
 │    │    ├── base
 │    │    ├── pages
 │    │    ├── utils
 │    │    └── reports
 │    └── resources
 │         └── config.properties
 │
 └── test
      └── java
           ├── tests
           └── listeners
```

---

## ⚙️ Configuration

All configuration values are stored in:

```
src/main/resources/config.properties
```

Example:

```
browser=chrome
baseUrl=https://the-internet.herokuapp.com
timeout=10
```

---

## 🧪 Test Modules Covered

### 🔐 Authentication

* Valid login
* Invalid login
* Logout verification

### ⚠️ JavaScript Alerts

* Alert accept
* Confirm dismiss
* Prompt input handling

### ☑️ Checkboxes & Dropdowns

* Checkbox toggle validation
* Dropdown selection verification

### 📂 File Upload

* File upload validation
* Uploaded filename verification

### ⏳ Dynamic Loading

* Wait for dynamically loaded elements
* Verify content after loading

---

## 🏗️ Framework Features

### ✔ Page Object Model (POM)

* Separate page classes for each module
* Reusable methods for interactions

### ✔ WebDriver Management

* Uses WebDriverManager (no manual setup)

### ✔ Wait Strategy

* Explicit waits using WebDriverWait
* No Thread.sleep used

### ✔ Data-Driven Testing

* TestNG DataProvider for login scenarios

### ✔ Screenshot on Failure

* Automatically captures screenshots when a test fails
* Stored in `/screenshots` folder

### ✔ Test Reporting

* Generates HTML report using ExtentReports
* Includes:

  * Test status (Pass/Fail)
  * Error details
  * Screenshot on failure

---

## ▶️ How to Run the Project

### 🔹 Using Maven

```
mvn clean test
```

### 🔹 Using TestNG

* Right-click `testng.xml`
* Run as **TestNG Suite**

---

## 📊 Reports

After execution, open:

```
reports/ExtentReport.html
```

---

## 📸 Screenshots

On test failure:

```
screenshots/
```

---

## 🚨 Important Rules Followed

* No hardcoded URLs or credentials
* No WebDriver code inside test classes
* No Thread.sleep used
* Clean and modular structure

---

## 🧠 Key Learnings

* Designing scalable automation frameworks
* Handling dynamic web elements
* Implementing POM design pattern
* Integrating reporting and logging

---

## 👩‍💻 Author

**Ashila Kosaraju**

---

## ⭐ Final Note

This project demonstrates a **complete Selenium automation framework** with best practices and real-world testing scenarios, making it suitable for both academic evaluation and professional use.

---
