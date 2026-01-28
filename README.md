🚀 Automation Testing Framework (Selenium + Java)
📌 Overview

This project is a Selenium-based Automation Testing Framework developed using Java to perform UI, functional, and regression testing of web applications.
The framework is designed to improve test reliability, reduce manual testing effort, and ensure consistent application quality.

This project can be used as a standalone automation framework or merged with academic / MeitY-related work.

🧪 Key Features

Automated UI and workflow testing

Supports functional and regression test cases

Modular and reusable test design

Improves test execution reliability

Reduces manual testing effort

Easy to scale and maintain

🛠️ Tech Stack

Programming Language: Java

Automation Tool: Selenium WebDriver

Build Tool: Maven

Testing Framework: TestNG / JUnit (based on implementation)

IDE: Eclipse 

Version Control: Git & GitHub

📂 Project Structure
Automation_Testing_Framework
│
├── src/main/java
│   ├── base        # WebDriver setup and configuration
│   ├── pages       # Page Object Model (POM) classes
│   └── utils       # Utility classes (config, waits, helpers)
│
├── src/test/java
│   ├── tests       # Test cases (functional & regression)
│
├── pom.xml         # Maven dependencies
├── README.md
└── .gitignore

⚙️ Setup & Installation
Prerequisites

Java JDK 8 or above

Maven

Chrome / Firefox browser

ChromeDriver / GeckoDriver

Steps

Clone the repository:

git clone https://github.com/akashraajputh/Automation_Testing_Framework.git


Open the project in Eclipse / IntelliJ

Install dependencies:

mvn clean install


Run test cases:

mvn test

✅ Test Coverage

UI validation

Workflow testing

Functional testing

Regression testing

📈 Outcomes

Automated repetitive test scenarios

Reduced manual testing effort

Improved application reliability

Faster feedback during development cycles

🔮 Future Enhancements

CI/CD integration (GitHub Actions / Jenkins)

Cross-browser testing

Report generation (Extent Reports / Allure)

API automation integration

Cloud execution (Selenium Grid)
