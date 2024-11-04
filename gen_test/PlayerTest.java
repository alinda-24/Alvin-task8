package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerConstructorAndAttributes() {
        Player player = new Player("Alice", 200);
        assertEquals("Name should be Alice", "Alice", player.getName());
        assertEquals("Score should be 200", 200, player.getScore());
    }

    @Test
    public void testSetScore() {
        Player player = new Player("Bob", 0);
        player.setScore(500);
        assertEquals("Score should be 500 after setScore", 500, player.getScore());
    }
}

// GameStateTest.java

import org.junit.Test;
import static org.junit.Assert.*;

