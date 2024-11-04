// Game.java
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private GameState state;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        Game game = new Game();
        game.loadGameObjects("gameData.txt");
        game.printWelcomeMessage();
        game.gameLoop();
    }

    private void loadGameObjects(String filename) {
    }

    private void printWelcomeMessage() {
    }

    private void gameLoop() {
    }
}

// Player.java
public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
    }

    public void move(String direction, GameWorld world) {
    }
}

// Enemy.java
public class Enemy {
    private String type;
    private int strength;

    public Enemy(String type, int strength) {
    }

    public void interact(Player player) {
    }
}

// GameState.java
public class GameState {
    private Player player;
    private GameWorld gameWorld;

    public GameState(Player player, GameWorld gameWorld) {
    }

    public Player getPlayer() {
        return player;
    }

    public GameWorld getGameWorld() {
        return gameWorld;
    }
}

// GameWorld.java
import java.util.List;
import java.util.ArrayList;

public class GameWorld {
    private List<Room> rooms;

    public GameWorld() {
    }

    public void addRoom(Room room) {
    }
}

// Room.java
import java.util.List;
import java.util.ArrayList;

public class Room {
    private String description;
    private List<Enemy> enemiesInRoom;

    public Room(String description) {
    }

    public String getDescription() {
        return description;
    }

    public void addEnemy(Enemy enemy) {
    }

    public void listEnemies() {
    }
}