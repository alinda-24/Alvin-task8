package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IndamonTest {

    private Indamon indamon1;
    private Indamon indamon2;
    private Indamon indamon3;

    @Before
    public void setUp() {
        indamon1 = new Indamon("Firemon", "Fire", 10, 15, 20);
        indamon2 = new Indamon("Watermon", "Water", 20, 10, 5);
        indamon3 = new Indamon("Timemon", "Time", 20, 10, 25);
    }

    @Test
    public void testBattleWhenFirstIndamonWins() {
        String expected = "Firemon wins against Watermon!";
        assertEquals(expected, indamon1.battle(indamon2));
    }

    @Test
    public void testBattleWhenSecondIndamonWins() {
        String expected = "Timemon wins against Watermon!";
        assertEquals(expected, indamon2.battle(indamon3));
    }

    @Test
    public void testBattleWhenItsADraw() {
        Indamon equalIndamon1 = new Indamon("Equalmon1", "Ground", 10, 10, 10);
        Indamon equalIndamon2 = new Indamon("Equalmon2", "Air", 10, 10, 10);
        String expected = "It's a draw between Equalmon1 and Equalmon2!";
        assertEquals(expected, equalIndamon1.battle(equalIndamon2));
    }

    @Test
    public void testCalculateScore() {
        int expectedScore = 10 * 2 + 15 * 2 + 20;
        assertEquals(expectedScore, indamon1.calculateScore());
    }

    @Test
    public void testSetAndGetName() {
        indamon1.setName("FiremonUpdated");
        assertEquals("FiremonUpdated", indamon1.getName());
    }

    @Test
    public void testSetAndGetType() {
        indamon1.setType("FireUpdated");
        assertEquals("FireUpdated", indamon1.getType());
    }

    @Test
    public void testSetAndGetStrength() {
        indamon1.setStrength(25);
        assertEquals(25, indamon1.getStrength());
    }

    @Test
    public void testSetAndGetAgility() {
        indamon1.setAgility(30);
        assertEquals(30, indamon1.getAgility());
    }

    @Test
    public void testSetAndGetIntelligence() {
        indamon1.setIntelligence(35);
        assertEquals(35, indamon1.getIntelligence());
    }
}

import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

