# Student Record Management System

Welcome! This is a **console-based student record management system** written in Java 17, built for the Elevate Labs Java Developer Internship Task 2. The project helped me practice working with classes, collections, loops, and encapsulation while implementing CRUD operations and modern Java features.

## Features

- Add, view, update, and delete student records by ID
- Student data includes ID, name, and marks
- Sort students by marks in descending order
- Input validation and user-friendly error handling
- Uses Java 17 features like `record`, enhanced switch expressions, and streams
- Runs in a loop until the user chooses to exit

## Getting Started

### Prerequisites

- Java 17 or later (tested on Java 17 and Java 18)
- A code editor like **VS Code** or **IntelliJ CE** (Community Edition)
- Terminal or Command Prompt

### How to Compile & Run

Clone or download this repository, or copy `Student.java` and `StudentRecordManagementSystem.java` into your project folder.

Open Terminal/Command Prompt in the folder where you saved the Java files.

Compile the program:

Run the program:

**Tip:** If you are new to the command line, just make sure you’re in the same folder as your Java files before compiling/running.

## Usage

- After starting, the program shows a menu with options to add, view, update, delete, sort students, or exit.
- Enter the number corresponding to your action.
- Follow prompts to enter or update student data.
- The system validates inputs and informs of errors or duplicate IDs.
- You can sort students by their marks anytime.
- To exit, just select the exit option.

## Code Structure

Main Classes:

- `Student` — A Java 17 `record` representing a student with ID, name, and marks.
- `StudentRecordManagementSystem` — Contains the command-line interface, menu, and CRUD logic.

Modern Java practices:

- Enhanced `switch` expressions for menu handling
- Streams and lambdas for searching and sorting
- Immutable data modeling with records

## What I Learned

- Implementing core OOP concepts like encapsulation with immutable records
- Managing collections with ArrayList
- Using Java 17+ features for cleaner, more expressive code
- Handling user input and validation in CLI applications
- Designing basic systems with CRUD functionality and sorting

## Example Session

Menu Options:
- Add Student
- View All Students
- Update Student
- Delete Student
- Sort Students by Marks (descending)
- Exit

Your choice: 1  
Enter Student ID: 101  
Enter Name: Alice  
Enter Marks: 89.5  
Student added successfully!

Your choice: 2  
ID: 101, Name: Alice, Marks: 89.5

Your choice: 5  
Students sorted by marks (descending):  
ID: 101, Name: Alice, Marks: 89.5

Your choice: 6  
Exiting... Goodbye!

## FAQ / Common Errors

- **Entering invalid numbers:** Prompts you to re-enter valid input.
- **Duplicate student ID:** Prevents adding students with existing IDs.
- **Updating or deleting non-existent student:** Shows student not found message.
- **Empty student list:** Informs when no records are present.

## For Interview Questions (Cheat Sheet)

- What is encapsulation?  
  Wrapping data and methods inside classes; controlling data access.

- How are ArrayLists different from arrays?  
  ArrayLists grow dynamically; arrays have fixed size.

- How to sort an ArrayList?  
  Use `Collections.sort()` or streams with comparators.

- What is constructor overloading?  
  Multiple constructors with different parameter signatures.

- How does garbage collection work in Java?  
  JVM automatically frees memory of unreachable objects.

- Why do we use getters and setters?  
  To access and update private fields securely.

- What is a static variable?  
  Variable shared among all instances of a class.

- What is the use of final keyword?  
  Prevents reassignment, inheritance, or method overriding.

- Difference between compile-time and runtime errors?  
  Compile-time detected during compilation; runtime occur during execution.

- What are access modifiers?  
  Keywords (`public`, `private`, etc.) defining visibility and accessibility.

## License

This code is a learning project. Do anything you want with it.

