# Selenium UI Tests

This project demonstrates automated UI testing using **Selenium WebDriver** and **TestNG**.  
It is structured with Maven for dependency management and build execution.

---

## 📂 Project Structure
SeleniumUITests/
 ├── src/main/java/       # Base classes, utilities, page objects
 ├── src/test/java/       # Test classes
 ├── testng.xml           # TestNG suite configuration
 └── pom.xml              # Maven dependencies

---

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- IntelliJ IDEA / Eclipse (recommended)
- Chrome/Firefox browser installed

---

## 🔧 How to Run Tests

### 1. Run with Maven
From the project root:
```bash
mvn clean test


### 1. Run with TestNG
You can run tests directly via the testng.xml file inside your IDE:

IntelliJ IDEA:
Right‑click on testng.xml → Run 'testng.xml'

Eclipse:
Right‑click on testng.xml → Run As → TestNG Suite


