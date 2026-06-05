# 📚 Library System

A command-line Library Management System built in Java, developed as a weekly learning project to practice core Java concepts step by step.

---

## 🗺️ Project Roadmap

| Version | Focus | Status |
|---------|-------|--------|
| v0.1 | Book array, CLI menu, encapsulation | ✅ Complete |
| v0.2 | Abstract classes, inheritance, ArrayList | 🔄 In progress |
| v0.3 | Interfaces, Comparable, Comparator | ⏳ Upcoming |
| v0.4 | Exceptions, File I/O, Maven, JUnit | ⏳ Upcoming |

---

## ✨ Features (v0.1)

- Add books with ISBN, title, and author
- List all books in the library
- Search books by title (case-insensitive)
- Input validation on all fields
- Error handling for invalid menu input

---

## 🏗️ Project Structure

```
library-system/
└── src/
    └── src/
        └── library/
            ├── Book.java       # Book model with validation
            ├── Library.java    # Core library logic
            └── Main.java       # CLI menu entry point
```

---

## 🚀 How to Run

1. Clone the repository:
```bash
git clone https://github.com/NikosKatrakoulis/library-system.git
```

2. Open in IntelliJ IDEA

3. Run `Main.java`

4. Use the CLI menu:
```
=== Library Menu ===
1. Add Book
2. List Books
3. Search by Title
0. Exit
```

---

## 🧱 Class Design (v0.1)

```
Main
 └── uses Library
      └── uses Book
```

**Book** — holds data (isbn, title, author, availability) with setter validation

**Library** — manages a fixed-size `Book[100]` array with add, list, and search operations

**Main** — handles all user interaction via Scanner and a while/switch menu loop

---

## 📦 Git Workflow

This project follows a simplified Gitflow:

```
main
 └── develop/vX.X
      └── feature/xxx  →  merge into develop  →  PR into main
```

Each version lives on its own `develop/vX.X` branch and is merged into `main` via Pull Request at the end of the week.

Commit messages follow the [Conventional Commits](https://www.conventionalcommits.org/) format:
```
feat:     add new feature
fix:      bug fix
refactor: code improvement without behaviour change
docs:     documentation update
test:     add or update tests
```

---

## 🧠 Concepts Practiced

**v0.1** — Classes, encapsulation, constructors, arrays, loops, Scanner, switch, String.format

**v0.2** — Abstract classes, inheritance, super(), toString(), ArrayList *(coming soon)*

**v0.3** — Interfaces, Comparable, Comparator, polymorphism *(coming soon)*

**v0.4** — Custom exceptions, try-with-resources, file I/O, Maven, JUnit *(coming soon)*

---

## 👨‍💻 Author

**Nikos Katrakoulis** — learning Java one week at a time.