# 🪨📄✂️ Rock-Paper-Scissors Game

A **Java-based Rock-Paper-Scissors** game where you can play against the computer. The game offers a simple yet interactive console interface with animated typing effects, score tracking, and replay options.

---

### 🚀 **Features**

- 🎮 **Gameplay:** 
    - Choose between **Rock 🪨, Paper 📄, or Scissors ✂️**.
    - The computer makes a random selection.
    - The game announces the winner, updates the score, and offers a replay option.
- 💻 **Interactive UI:**
    - Typing effect for a dynamic experience.
    - Clear screen after each round for a clean UI.
- 🔥 **Score Tracking:** 
    - Keeps track of **user and computer scores**.
- 🔄 **Replay Option:** 
    - Choose to continue or exit after each round.

---

### ⚙️ **Technologies Used**

- **Language:** Java
- **IDE:** Visual Studio Code (VS Code)
- **Java Version:** JDK 17+
- **Platform:** Cross-platform (Windows, Linux, macOS)

---

### 🛠️ **How to Run**

#### 💻 **Run in VS Code**

1. **Install JDK (Java Development Kit):**
   - Download and install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Java 17 or later).
   - Verify installation by running the following commands in the terminal:
   ```bash
   java --version
   javac --version
   ```

2. **Install Required Extensions:**
   - Open VS Code.
   - Go to **Extensions** (`Ctrl+Shift+X`) and install:
     - `Extension Pack for Java`
     - `Code Runner` (for easy execution)

3. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/rock-paper-scissors-java.git
   cd rock-paper-scissors-java
   ```

4. **Open the Project in VS Code:**
   - Go to **File > Open Folder** and select the project folder.
   - Create a new file: `RockPaperScissors.java`.
   - Paste the game code into the file.

5. **Compile and Run:**
   - Open the terminal in VS Code:  
     (**Terminal > New Terminal**)
   - Compile the program:
   ```bash
   javac RockPaperScissors.java
   ```
   - Run the game:
   ```bash
   java RockPaperScissors
   ```

✅ **Optional: Use Code Runner**
- Instead of compiling and running manually:
   - Right-click the code and select **Run Code**.
   - Or use the shortcut:  
     `Ctrl + Alt + N` (Windows) or `Cmd + Option + N` (Mac).

---

### 📁 **Project Structure**
```
/RockPaperScissors
 ├── RockPaperScissors.java     # Main game logic
 ├── README.md                   # Project documentation
 ├── .gitignore                  # Git ignore file
```

---

### ✅ **Gameplay Instructions**

1. **Start the Game:** 
    - Select `(1)` for Rock, `(2)` for Paper, `(3)` for Scissors, or `(0)` to Exit.
2. **Game Flow:**
    - Your choice and the computer's choice are displayed.
    - The game announces the winner and updates the score.
3. **Replay or Exit:** 
    - Press `Y` to play again or `N` to exit.

---

### 🎯 **Sample Output**
```
Choose (1) Rock 🪨, (2) Paper 📄, (3) Scissors ✂️, or (0) Exit:
1

Your choice: Rock 🪨  
Computer's choice: Scissors ✂️  
You win!  
Current Score: You - 1, Computer - 0  

Play again? (Y/N):
```

---

### 🛠️ **Customization Options**

- **Disable Typing Effect:** 
    - Set `typingEffect = false` for instant output.
- **Change Delay Speed:** 
    - Modify `Thread.sleep(10)` in `printWithTypingEffect()` for faster/slower typing.

---

### 📌 **Improvements and Future Enhancements**

- 🕹️ Add more game modes (e.g., **best of 3**, **best of 5**).
- 🌐 Create a **GUI version** using JavaFX or Swing.
- 🔥 Add **sound effects** or music for a better experience.
- 🛠️ Save **game statistics** to a file or database.

---

### 🤝 **Contributing**

Contributions, issues, and feature requests are welcome!  
Feel free to fork the repository and submit a pull request. 

---


✅ Let me know if you need further modifications or additional features! 🚀
