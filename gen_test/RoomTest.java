package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testRoomConstructorAndAttributes() {
        Room room = new Room("Dungeon");
        assertEquals("Room description should be Dungeon", "Dungeon", room.getDescription());
    }

    @Test
    public void testAddEnemyToRoom() {
        Room room = new Room("Castle");
        Enemy dragon = new Enemy("Dragon", 50);

        room.addEnemy(dragon);
        // Logic to check if enemy is added to room. Add such method if necessary and verify the presence of enemy.
    }
}