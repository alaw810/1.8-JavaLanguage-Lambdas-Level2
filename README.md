# Java Lambdas – Level 2

## 📄 Description – Exercise Statement

This project contains four Java exercises that build on the foundational use of **Lambda expressions**, **Streams**, and **Functional Interfaces**, with more complex logic and processing of mixed data types.

Each exercise is organized in its own package and demonstrates a specific capability of Java functional programming using Java 21.

### Exercise 1: Filter Names Starting with 'A' and Having Exactly 3 Letters

Implements a method that filters a list of proper names, returning only those that start with uppercase 'A' and have exactly 3 letters.

### Exercise 2: Format Integers with Prefix Based on Parity

Formats a list of integers into a single comma-separated string. Each number is prefixed with `e` if it is even, or `o` if it is odd. For example: `List.of(3, 55, 44)` → `"o3, o55, e44"`.

### Exercise 3: Functional Interface for Arithmetic Operations

Defines a custom `@FunctionalInterface` with a method `operation()` that returns a `float`. It is implemented via lambdas to perform addition, subtraction, multiplication, and division between two numbers.

### Exercise 4: Operations on a Mixed List

Performs several transformations and queries on a list that contains both strings and numbers:

- Sorts elements alphabetically by their first character
- Prioritizes elements that contain the letter 'e' using a custom comparator
- Replaces the letter 'a' with '4' in all string elements
- Filters and displays only the elements that are purely numeric

---

## 💻 Technologies Used

- Java 21
- Maven
- Stream API
- Lambda Expressions
- Functional Interfaces
- IntelliJ IDEA (recommended IDE)

---

## 📋 Requirements

- Java 21+
- Maven 3.8+
- Git (for version control)

---

## 🛠️ Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/alaw810/1.8-JavaLanguage-Lambdas-Level2.git
   ```

2. Import the project into IntelliJ IDEA (or another IDE that supports Maven).

3. Let Maven download all dependencies automatically.

---

## ▶️ Execution

To run a specific exercise, use the following Maven command:

```bash
mvn exec:java -Dexec.mainClass="com.alaw810.s1t8l2.exercise1.MainEx1"
```

Replace `exercise1.MainEx1` with the appropriate exercise class (e.g., `exercise4.MainEx4`).

---

## 🌐 Deployment

This project is intended for educational purposes and does not include deployment features. However, it is fully Maven-compatible and ready to be integrated into larger systems.

---

## 🤝 Contributions

This is a learning exercise intended for individual academic practice. However, pull requests with enhancements or improvements are welcome!

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request

