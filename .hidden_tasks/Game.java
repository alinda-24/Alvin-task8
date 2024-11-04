import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private GameState state;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PROMPT = "> ";

    public static void main(String[] args) {
        Game game = new Game();
        game.loadGameObjects("gameData.txt"); // Example file name
        game.printWelcomeMessage();
        game.gameLoop();
    }

    private void loadGameObjects(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].equals("PLAYER")) {
                    String name = data[1];
                    int score = Integer.parseInt(data[2]);
                    Player player = new Player(name, score);
                    state = new GameState(player, new GameWorld()); // Assuming GameWorld setup
                }
                // Additional parsing logic for enemies, items, etc.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to the Simple Game!");
    }

    private void gameLoop() {
        while (true) {
            System.out.print(PROMPT);
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("exit")) break;
            // Handle commands
        }
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void move(String direction, GameWorld world) {
        // Logic to move player within the world
        System.out.println("Moving " + direction);
    }
}

class Enemy {
    private String type;
    private int strength;

    public Enemy(String type, int strength) {
        this.type = type;
        this.strength = strength;
    }

    public void interact(Player player) {
        // Define interaction logic with the player
    }
}

class GameState {
    private Player player;
    private GameWorld gameWorld;

    public GameState(Player player, GameWorld gameWorld) {
        this.player = player;
        this.gameWorld = gameWorld;
    }

    public Player getPlayer() {
        return player;
    }

    public GameWorld getGameWorld() {
        return gameWorld;
    }
}

class GameWorld {
    private List<Room> rooms;

    public GameWorld() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Additional methods to manage game world state
}

class Room {
    private String description;
    private List<Enemy> enemiesInRoom;

    public Room(String description) {
        this.description = description;
        this.enemiesInRoom = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void addEnemy(Enemy enemy) {
        enemiesInRoom.add(enemy);
    }

    public void listEnemies() {
        for (Enemy enemy : enemiesInRoom) {
            System.out.println("Enemy Type: " + enemy.type);
        }
    }

    // Additional methods
}