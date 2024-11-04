package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {

    private GameWorld gameWorld;

    @Before
    public void setup() {
        gameWorld = new GameWorld();
    }

    @Test
    public void testInstantiateEnemiesFromFileWithValidData() throws IOException {
        String fileContent = "zombie,50\nvampire,100\n";
        Path tempFile = Files.createTempFile("enemies", ".txt");
        Files.write(tempFile, fileContent.getBytes());

        gameWorld.instantiateEnemiesFromFile(tempFile.toString());

        List<Enemy> enemies = gameWorld.getEnemies();
        assertEquals(2, enemies.size());
        assertEquals("zombie", enemies.get(0).getType());
        assertEquals(50, enemies.get(0).getHealth());
        assertEquals("vampire", enemies.get(1).getType());
        assertEquals(100, enemies.get(1).getHealth());

        Files.delete(tempFile);
    }

    @Test
    public void testInstantiateEnemiesFromFileWithInvalidData() throws IOException {
        String fileContent = "zombie,50\ninvalid data\nvampire,100\n";
        Path tempFile = Files.createTempFile("enemies", ".txt");
        Files.write(tempFile, fileContent.getBytes());

        gameWorld.instantiateEnemiesFromFile(tempFile.toString());

        List<Enemy> enemies = gameWorld.getEnemies();
        assertEquals(3, enemies.size());
        assertEquals("zombie", enemies.get(0).getType());
        assertEquals(50, enemies.get(0).getHealth());
        assertEquals("invalid data", enemies.get(1).getType());
        assertEquals(0, enemies.get(1).getHealth()); // Defaults to 0 health
        assertEquals("vampire", enemies.get(2).getType());
        assertEquals(100, enemies.get(2).getHealth());

        Files.delete(tempFile);
    }

    @Test
    public void testInstantiateEnemiesFromFileWithEmptyFile() throws IOException {
        Path tempFile = Files.createTempFile("enemies", ".txt");
        Files.write(tempFile, "".getBytes());

        gameWorld.instantiateEnemiesFromFile(tempFile.toString());

        List<Enemy> enemies = gameWorld.getEnemies();
        assertTrue(enemies.isEmpty());

        Files.delete(tempFile);
    }

    @Test
    public void testInstantiateEnemiesFromFileWithMissingFile() {
        gameWorld.instantiateEnemiesFromFile("nonexistentfile.txt");
        List<Enemy> enemies = gameWorld.getEnemies();
        assertTrue(enemies.isEmpty());
    }

    @Test
    public void testAddRoomAndRetrieve() {
        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");

        gameWorld.addRoom(room1);
        gameWorld.addRoom(room2);

        List<Room> rooms = gameWorld.getRooms();
        assertEquals(2, rooms.size());
        assertEquals(room1, rooms.get(0));
        assertEquals(room2, rooms.get(1));
    }

    @Test
    public void testRoomNavigation() {
        Room start = new Room("Start Room");
        Room eastRoom = new Room("East Room");

        start.addExit("east", eastRoom);

        assertNull(start.go("west")); // Non-existent exit
        assertEquals(eastRoom, start.go("east"));
    }

    @Test
    public void testPlayerMovement() {
        Room start = new Room("Start Room");
        Room nextRoom = new Room("Next Room");

        Player player = new Player(start);

        assertEquals(start, player.getCurrentRoom());

        player.move(nextRoom);

        assertEquals(nextRoom, player.getCurrentRoom());
    }

    @Test
    public void testPlayerScoreMechanics() {
        Room room = new Room("Room");
        Player player = new Player(room);

        assertEquals(0, player.getScore());

        player.increaseScore(10);
        assertEquals(10, player.getScore());

        player.increaseScore(15);
        assertEquals(25, player.getScore());
    }

    @Test
    public void testEnemyToString() {
        Enemy enemy = new Enemy("orc", 30);
        assertEquals("Enemy{type='orc', health=30}", enemy.toString());
    }

    @Test
    public void testEnemySetAndGetType() {
        Enemy enemy = new Enemy("goblin", 20);
        assertEquals("goblin", enemy.getType());

        enemy.setType("troll");
        assertEquals("troll", enemy.getType());
    }

    @Test
    public void testEnemySetAndGetHealth() {
        Enemy enemy = new Enemy("skeleton", 45);
        assertEquals(45, enemy.getHealth());

        enemy.setHealth(60);
        assertEquals(60, enemy.getHealth());
    }
}