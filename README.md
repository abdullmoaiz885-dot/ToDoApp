# Java To-Do List Application

## Project Overview

This project is a simple To-Do List application developed in Java using the Swing GUI framework. The application allows users to add and delete tasks through a graphical interface while demonstrating key software engineering concepts including Event Handling, Exception Handling, Code Refactoring, Unit Testing, and Git & GitHub version control.

---

## Objectives

The purpose of this project is to demonstrate:

* Event Handling in a GUI application
* Exception Handling for invalid user input
* Clean and maintainable code through refactoring
* Automated Unit Testing using JUnit 4
* Version control using Git and GitHub

---

## Features

### Add Task

* Users can enter a task and click the **Add Task** button.
* The task is added to the task list.

### Delete Task

* Users can select a task from the list and click **Delete Task**.
* The selected task is removed from the list.

### Input Validation

* Empty or blank tasks are not allowed.
* Appropriate error messages are displayed.

### Error Handling

* Handles invalid inputs.
* Handles attempts to delete without selecting a task.
* Handles unexpected runtime exceptions.

---

## Technologies Used

* Java
* Java Swing
* Eclipse IDE
* JUnit 4
* Git
* GitHub

---

## Project Structure

```text
src/
│
├── TodoApp.java
│
└── TodoAppTest.java
```

---

## Event Handling Implemented

The application uses Action Listeners to respond to user actions:

* Add Task Button Click
* Delete Task Button Click

These events trigger corresponding methods that update the application state.

---

## Exception Handling Implemented

### Input Validation

```java
if (task == null || task.trim().isEmpty()) {
    throw new IllegalArgumentException("Task cannot be empty.");
}
```

### User Error Handling

* Empty task submission
* Deleting without selecting a task

### Runtime Exception Handling

Unexpected exceptions are caught and displayed through dialog boxes.

---

## Code Refactoring Practices

The application follows clean coding principles:

* Meaningful method names
* Separation of business logic from GUI logic
* Reusable validation method
* Reduced code duplication
* Modular design

---

## Unit Testing

JUnit 4 test cases have been written to verify:

* Valid task input
* Empty task validation
* Null task validation

Example test:

```java
@Test
public void testValidTask() {
    TodoApp app = new TodoApp();
    String result = app.validateTask("Complete Assignment");
    assertEquals("Complete Assignment", result);
}
```

---

## How to Run the Application

### Using Eclipse

1. Open Eclipse.
2. Import the project.
3. Open `TodoApp.java`.
4. Run the file as a Java Application.

---

## How to Run Unit Tests

1. Ensure JUnit 4 is added to the project build path.
2. Right-click `TodoAppTest.java`.
3. Select **Run As → JUnit Test**.

---

## Author

Name: Abdul Moaiz

Course: Software Engineering / Object-Oriented Programming

Semester Project: Event Handling, Exception Handling, Refactoring, Unit Testing, and GitHub Integration
