![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-3quyDv9fj1FYA9zre4EiIK24.png?st=2024-11-04T09%3A01%3A39Z&se=2024-11-04T11%3A01%3A39Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-04T02%3A07%3A00Z&ske=2024-11-05T02%3A07%3A00Z&sks=b&skv=2024-08-04&sig=uI9wxnCUS55I//23CjuuDCyr2rKDXwzGETguSlmnfUI%3D)

# 📚 Programming Task: Indamon Battle Game

Welcome to your quest to create an engaging text-based game using Indamons (imaginary creatures born from your creativity)! This project will guide you through designing and implementing an exciting battle system where Indamons fight and score points.

## 🎯 Learning Goals

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

## 🚀 Task Overview

Your task is to create a text-based game where players control and battle with Indamons. The game will read Indamon data from files to instantiate objects and create a scoring system based on battle outcomes. You'll design classes to represent various game elements and program creatively to make the experience engaging.

### Exercise 1: 📜 Understanding Data from Files

Before diving into coding, let's understand the role of files in our game:

- **Question 1**: What is the purpose of reading data from files in a game setting? How does it enhance the gaming experience?
  
- **Question 2**: Describe different file formats suitable for storing Indamon data and how you would parse these files in Java. Consider cases like CSV, JSON, or XML.

### Exercise 2: 🏗️ Theoretical Class Design

Now, let’s focus on class design:

- **Question 1**: Identify and describe the main classes needed for an Indamon battle game. What responsibilities would each class have?

- **Question 2**: Explain how you would use design patterns to enhance your class design. Focus on patterns like Factory, Strategy, or Observer, and why they might be useful in a game setting.

### Exercise 3: 🖥️Coding: File Data to Objects

Your task is to implement a method that reads Indamon data from a file and instantiates them as objects. Create a file named `indamons.txt` with data in a CSV format:

```plaintext
name,type,strength,agility,intelligence
Flamon,Fire,8,5,4
Aquamon,Water,4,6,9
Terramon,Earth,7,7,3
```

Implement the following method in a suitable class:

```java
public List<Indamon> loadIndamonsFromFile(String filename) throws IOException {
// Implement loading logic here
}
```

### Exercise 4: 🔍 Combining: Basic Class Implementation

Design and implement a basic `Indamon` class with attributes and methods:

- Attributes: `name`, `type`, `strength`, `agility`, `intelligence`.
- Methods: Basic getters and setters, `battle(Indamon opponent)` to start a battle, and `calculateScore` to determine the score based on the outcome.

### Exercise 5: ⚔️ Advanced Battle System

Expand your Indamon Battle System:

1. **Design a Battle**: Create a battle algorithm that uses Indamon attributes to determine the winner.
2. **Implement Special Moves**: Each type of Indamon should have unique special moves affecting the battle outcome. Use polymorphism to implement these moves.
3. **Track Scores**: Update the game's scoring system to reflect battles. Players earn points based on wins and moves.

### Exercise 6: 🌟 Creative Expansion

1. **Expand the Game World**: Introduce new elements such as items, abilities, and more complex interactions.
2. **Add a Save/Load Feature**: Allow players to save their progress and load it later, utilizing file I/O operations.
3. **User Interface Enhancement**: Improve the text-based UI for better user interaction, integrating user feedback for refinement.

Throughout these exercises, focus on good design principles and document your code using Javadoc. Be creative and enjoy the process of bringing your Indamon game to life!

### 🚨 Troubleshooting Guide

- **Struggling with File I/O?**: Review how Java handles files and exceptions.
- **Design Blocks?**: Sketch your class diagrams and think through the relationships.
- **Battle Logic Issues?**: Write pseudocode for your algorithms before coding.

### 📝 Submission Checklist

- [ ] All classes have clear responsibilities and interfaces.
- [ ] Data from files is correctly parsed and used to instantiate objects.
- [ ] Document all code changes with proper Javadoc comments.
- [ ] Create a README documenting your game world, win/lose conditions, and class structure.
- [ ] Submit your completed project in the specified format.

Happy coding! Let your creativity take your Indamons to victory! 🎉