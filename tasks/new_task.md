## 🎮 Simple Game Application using the Indamon Program

Welcome to your new coding adventure! In this task, you will create a simple game application with exciting features like player movement, a scoring system, and enemy interactions using the indamon program. This assignment will challenge you to integrate several important programming concepts while allowing you to express your creativity in a fun way.

### 📚 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques for data extraction.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

### 🔍 Task Overview

Your mission is to build a game application with the following features:
- Player movement within a game world.
- A scoring system to track player points.
- Interactions with enemies that affect the game state.
- Dynamic object creation from external file data.

Let's get started with structured exercises to guide you through the process.

---

### 🔎 Exercise 1: Theoretical Exploration of File-based Object Instantiation 💡

**Objective:** Lay the groundwork for understanding how data can be used to dynamically create objects.

**Tasks:**
- Research different file formats (e.g., CSV, JSON, XML) and discuss their advantages and disadvantages when used for data-driven applications.
- Explain how file I/O operations are performed in Java. Briefly describe the purpose of `FileReader`, `BufferedReader`, and `Scanner`.

**Questions:**
1. How do different file formats affect the way data is stored and parsed?
2. Describe the process of reading a file and instantiating an object with the read data in Java.

---

### 🔎 Exercise 2: Class Design Fundamentals in Game Development 🏗️

**Objective:** Dive into the principles of designing clean, modular classes for games.

**Tasks:**
- Analyze a simple existing game class structure. Identify key responsibilities and their implementations.
- Research common design patterns used in game development, such as Singleton, Factory, and Observer.

**Questions:**
1. What are the advantages of using design patterns in game development?
2. How do clear class interfaces benefit game scalability and maintainability?

---

### 🛠️ Exercise 3: Implementing File-based Object Creation 🔨

**Objective:** Apply your theoretical knowledge to create game objects using external file data.

**Task:**
- Write a Java method `instantiateEnemiesFromFile(String filename)` that reads enemy specifications from a file and creates corresponding enemy objects.

**Code Snippet:**
```java
public void instantiateEnemiesFromFile(String filename) {
    // Initialize necessary resources for file reading
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Parse line to extract enemy data
            String[] enemyData = line.split(",");
            String type = enemyData[0];
            int health = Integer.parseInt(enemyData[1]);
            // Create and initialize enemy object
            Enemy enemy = new Enemy(type, health);
            // Add enemy to the game
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

**Considerations:**
- Ensure data integrity by validating file contents.
- Handle exceptions to provide user-friendly error messages.

---

### 🛠️ Exercise 4: Designing and Implementing Your Game Classes 🎨

**Objective:** Use your understanding of class design to create a foundational game structure.

**Task:**
- Design and implement the following classes: `Player`, `Enemy`, `GameWorld`.
  - Include necessary attributes and methods (e.g., movement, interactions).

**Example Structure:**
```java
class Player {
    private int score;
    // Methods for player movement and scoring interactions
}

class Enemy {
    private String type;
    private int health;
    // Methods defining enemy behavior
}

class GameWorld {
    private List<Room> rooms;
    // Methods to add rooms and manage the game state
}
```

**Guidelines:**
- Define clear interfaces for each class.
- Ensure encapsulation by using access modifiers.

---

### ⚔️ Exercise 5: Creating an Integrated Game Loop 🌟

**Objective:** Assemble your components into a functioning game loop that facilitates player and enemy interactions.

**Task:**
- Implement a basic game loop within the `GameWorld` class that allows player movement, enemy interactions, and scoring.

**Key Elements:**
- Move player between rooms.
- Trigger enemy encounters and update the player's score.
- Allow the game to reach a win/lose state.

**Steps:**
1. Initialize the game world and player.
2. Implement player input handling to move within the game world.
3. Randomize enemy interactions and update the player's score.
4. Define win/lose conditions to end the game loop.

---

### 🚀 Exercise 6: Level Up with Creative Enhancements 🎉

**Objective:** Enhance your game with creative features and user feedback integration.

**Tasks:**
- Add graphical elements or sound effects to your game to improve user experience.
- Solicit user feedback to refine your game design.

**Bonus Challenges:**
- Implement additional game modes or difficulty levels.
- Introduce power-ups or special items within the game.

**Reflection:**
- Document changes based on user feedback and iterative enhancements.
- Analyze how creative programming influenced your final design decisions.

---

### 🎓 Final Submission

Ensure your project adheres to the following:
- Functional and error-free code.
- Well-documented classes and methods using Javadoc.
- A README file describing your game's theme, features, and classes.

**Checklist:**
- [ ] All exercises completed.
- [ ] Game world instantiated from file data.
- [ ] Comprehensive class design and implementation.
- [ ] Game loop with properly functioning mechanics.
- [ ] Creative enhancements made to the gameplay.
- [ ] Code appropriately documented and submitted.

Good luck, and have fun creating your game masterpiece! 🎮🔧