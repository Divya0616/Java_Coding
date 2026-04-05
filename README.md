# Document Editor — Java OOP Project

A console-based Document Editor built in Java, designed to demonstrate core Object-Oriented Programming principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.

---

## What This Project Does

This system lets a user create, edit, search, and delete documents through a `DocumentEditor` manager class. It supports two document types — plain text and rich text — and includes an undo feature powered by a Stack data structure.

---

## OOP Concepts Demonstrated

### Abstraction
`DocumentItem` is an abstract base class. It cannot be instantiated directly — it defines the structure that all document types must follow, without exposing implementation details. The `getSummary()` method is declared abstract, meaning every subclass must provide its own version.

### Encapsulation
All fields across every class are `private`. Data is accessed and modified only through getters and setters. Setters include validation — for example, `setTitle()` throws an `IllegalArgumentException` if the title is null or blank, and `setEmail()` ensures the email contains `@`. The `id` and `createdAt` fields in `DocumentItem` have no setters at all, making them immutable after creation.

### Inheritance
```
DocumentItem  (abstract)
    └── Document
            ├── TextDocument
            └── RichDocument
```
`Document` inherits `id` and `createdAt` from `DocumentItem`. `TextDocument` and `RichDocument` both inherit everything from `Document`. No field or method is rewritten unnecessarily.

### Polymorphism
`TextDocument` and `RichDocument` each override `getSummary()` with their own behavior. When stored as a `Document` reference and `getSummary()` is called, Java automatically invokes the correct version at runtime — without the caller needing to know the actual type.

---

## Project Structure

```
DocumentEditor/
├── DocumentItem.java     # Abstract base class
├── Document.java         # Core document entity
├── TextDocument.java     # Plain text document (tracks word count)
├── RichDocument.java     # Rich text document (bold, italic, font color)
├── User.java             # User who owns documents
├── DocumentEditor.java   # Manager class — create, edit, search, delete, undo
└── Main.java             # Test cases demonstrating all features
```

---

## Features

- Create plain text and rich text documents
- Auto-generated unique ID and creation timestamp per document
- Edit document content with full undo support (Stack-based)
- Search documents by title (case-insensitive)
- Assign documents to a user and list them
- Publish documents
- Apply bold, italic, and font color formatting to rich documents
- Input validation with meaningful error messages
- Delete documents from the editor

---

## Extra Feature — Undo History

Every time a document's content is edited, the previous content is pushed onto a `Stack<String>`. Calling `undo()` pops the most recent version and restores it. This mirrors how Ctrl+Z works in real editors and demonstrates practical use of a Stack data structure.

---

## How to Run

**Requirements:** Java 11 or above

```bash
# Compile all files
javac *.java

# Run the program
java Main
```

---

## Sample Output

```
--- Test 3: Polymorphism (getSummary) ---
Title: Java Notes | Author: Divya | Published: false | Words: 7 | Type: Plain Text
Title: Project Report | Author: Divya | Published: false | Bold: false | Type: Rich Text

--- Test 6: Edit and Undo ---
Original content: Java is object oriented and platform independent
After edit 1: OOP makes code reusable and organized
After edit 2: This is the third version of the content
After undo 1: OOP makes code reusable and organized
After undo 2: Java is object oriented and platform independent
Editor: Nothing to undo.

--- Test 9: Validation (Error Handling) ---
Caught expected error: Title cannot be empty or null.
Caught expected error: Invalid email: must contain '@'.
```

---

## Key Java Concepts Used

| Concept | Where Used |
|---|---|
| Abstract class | `DocumentItem` |
| Method overriding | `getSummary()` in all document classes |
| `super()` constructor | `Document`, `TextDocument`, `RichDocument` |
| Encapsulation + validation | All setters across all classes |
| Composition | `User` contains `ArrayList<Document>` |
| Stack for undo | `DocumentEditor.undoHistory` |
| Iterator for safe removal | `User.removeDocument()`, `DocumentEditor.deleteDocument()` |
| Exception handling | `try-catch` in `Main.java` |

---

## Author

Divya Aiswarya S
— Java OOP Training Project
