import java.util.Scanner;

public class Game {
    private static GameWorld gameWorld = new GameWorld();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setupGameWorld();
        Player player = new Player(gameWorld.getRooms().get(0));
        gameWorld.startGameLoop(player);
    }

    private static void setupGameWorld() {
        // Example room setup. Would normally be constructed from file data.
        Room start = new Room("Starting Room");
        Room secondRoom = new Room("Second Room");
        start.addExit("east", secondRoom);
        secondRoom.addExit("west", start);

        gameWorld.addRoom(start);
        gameWorld.addRoom(secondRoom);

        gameWorld.instantiateEnemiesFromFile("enemies.txt");
    }
}