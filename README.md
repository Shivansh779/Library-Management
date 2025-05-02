📚 Library Management System

A basic console-based Library Management System developed in Java using Object-Oriented Programming. This system supports operations for both Customers and Librarians, making it ideal for small-scale use or educational projects.

⸻

🔧 Features

👤 Customer

	•	✅ View all available books in the library.
	•	✅ Borrow books from the library.

Borrowing includes:

	•	Book Name
	•	Author Name
	•	Customer Name
	•	Auto-generated Borrow ID
	•	Date of Issue

⸻

🧑‍💼 Librarian

	•	✅ View all books in the library.
	•	✅ View all borrowed books and their details.
	•	✅ Add new books to the library.

⸻

🧱 Class Structure

LibraryManagement.java

	•	The main class of the project.
	•	Provides a menu-driven interface for selecting roles (Customer or Librarian).
	•	Routes user input to the appropriate class (Customer or Librarian).

Customer.java

	•	Handles operations for customers.
	•	Allows users to:
	•	View all books
	•	Borrow a book
	•	Generates a Borrow ID and tracks the issue date upon borrowing.

Librarian.java

	•	Handles administrative tasks.
	•	Functions include:
	•	Viewing all books
	•	Viewing borrowed book records
	•	Adding new books to the collection

⸻

📄 Borrow Record Structure

Each time a book is borrowed, the system logs:
Book Name-Title of the borrowed book
Author Name-Author of the borrowed book
Customer Name-Name of the customer borrowing
Borrow ID-Auto generated unique ID
Date of Issue-Date when the book was borrowed

🏗️ Future Enhancements

	•	Add book return functionality.
	•	Set due dates and apply late return logic.
	•	Persist data using file handling or a database.
	•	Build a GUI using JavaFX or Swing.
