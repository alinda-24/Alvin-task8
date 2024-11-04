package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private static final String GAME_DATA_FILENAME = "testGameData.txt";

    @Before
    public void setUp() throws IOException {
        // Creating a sample game data file used for testing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(GAME_DATA_FILENAME))) {
            writer.write("PLAYER;John;150\n");
        }
    }

    @Test
    public void testLoadGameObjectsValidFile() {
        Game game = new Game();
        game.loadGameObjects(GAME_DATA_FILENAME);
        GameState state = game.getState();
        
        assertNotNull("GameState should not be null", state);
        assertNotNull("Player should not be null", state.getPlayer());
        assertEquals("Player name should be John", "John", state.getPlayer().getName());
        assertEquals("Player score should be 150", 150, state.getPlayer().getScore());
    }

    @Test
    public void testLoadGameObjectsFileNotFound() {
        Game game = new Game();
        game.loadGameObjects("nonExistentFile.txt");
        
        assertNull("GameState should be null if file not found", game.getState());
    }

    @Test(expected=IOException.class)
    public void testLoadGameObjectsMalformedData() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(GAME_DATA_FILENAME))) {
            writer.write("INVALIDDATA\n");
        }
        Game game = new Game();
        game.loadGameObjects(GAME_DATA_FILENAME);
    }

    @Test
    public void testPlayerMovementWithinWorld() {
        Player player = new Player("Alex", 0);
        GameWorld world = new GameWorld();
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        world.addRoom(room1);
        world.addRoom(room2);
        
        player.move("north", world); // Assuming 'north' should lead to Room 2
        // Test logic depending on move implementation
        // For example, check if player's current room is now Room 2 if such state exists
    }

    @Test
    public void testEnemyInteraction() {
        Player player = new Player("Emma", 100);
        Enemy enemy = new Enemy("Orc", 20);
        
        // Simulating interaction
        enemy.interact(player);
        
        // Verify interaction effects: maybe player's score or health changes, etc.
    }
    
    // Additional test cases can be added to test the game loop, input commands, etc.,
    // by mocking the scanner input to simulate user commands.

}

// PlayerTest.java

import org.junit.Test;
import static org.junit.Assert.*;

