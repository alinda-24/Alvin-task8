package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void testGameStateInitialization() {
        Player player = new Player("Chris", 100);
        GameWorld world = new GameWorld();
        GameState gameState = new GameState(player, world);

        assertNotNull("Player should not be null", gameState.getPlayer());
        assertNotNull("GameWorld should not be null", gameState.getGameWorld());
    }
}

// GameWorldTest.java

import org.junit.Test;
import static org.junit.Assert.*;

