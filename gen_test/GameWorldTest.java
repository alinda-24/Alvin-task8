package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {

    @Test
    public void testAddRoom() {
        GameWorld gameWorld = new GameWorld();
        Room room = new Room("Test Room");

        gameWorld.addRoom(room);
        // Logic to check if room is added. Add method to get rooms and verify.
    }
}

// RoomTest.java

import org.junit.Test;
import static org.junit.Assert.*;

