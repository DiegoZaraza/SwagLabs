# ProjectAutomation

## Overview
ProjectAutomation is a Java-based project designed to automate testing workflows using tools like Selenium, JUnit, and Allure for reporting. The project is built with Maven for dependency management and build automation.

## Features
- **Selenium Integration**: Automate browser interactions for end-to-end testing.
- **JUnit 5**: Write and execute unit and integration tests.
- **Allure Reporting**: Generate detailed and interactive test reports.
- **Lombok**: Simplify Java code with annotations for boilerplate reduction.

## Prerequisites
- **Java 21**: Ensure you have JDK 21 installed.
- **Maven**: Install Maven for dependency management.
- **Browser Drivers**: Managed automatically using WebDriverManager.

## Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd MobileTest

2. Build the project:
    ```bash
    mvn clean verify

## Allure Reporting
1. Generate Allure results:
   ```bash
   allure serve target/allure-results

## Dependencies
- **Allure**: io.qameta.allure:allure-junit5:2.29.1
- **JUnit 5**: org.junit.jupiter:junit-jupiter-api:5.12.1
- **Selenium**: org.seleniumhq.selenium:selenium-java:4.31.0
- **WebDriverManager**: io.github.bonigarcia:webdrivermanager:6.0.1
- **Lombok**: org.projectlombok:lombok:1.18.34

## License
This project is licensed under the MIT License. See the LICENSE file for details.