package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IndamonLoaderTest {

    private static final String TEST_FILENAME = "test_indamons.txt";

    @Before
    public void setUp() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILENAME));
        writer.write("name,type,strength,agility,intelligence\n");
        writer.write("Firemon,Fire,10,15,20\n");
        writer.write("Watermon,Water,20,10,5\n");
        writer.close();
    }

    @Test
    public void testLoadIndamonsFromFileSuccessfully() {
        IndamonLoader loader = new IndamonLoader();
        try {
            List<Indamon> indamons = loader.loadIndamonsFromFile(TEST_FILENAME);
            assertEquals(2, indamons.size());

            Indamon firemon = indamons.get(0);
            assertEquals("Firemon", firemon.getName());
            assertEquals("Fire", firemon.getType());
            assertEquals(10, firemon.getStrength());
            assertEquals(15, firemon.getAgility());
            assertEquals(20, firemon.getIntelligence());

            Indamon watermon = indamons.get(1);
            assertEquals("Watermon", watermon.getName());
            assertEquals("Water", watermon.getType());
            assertEquals(20, watermon.getStrength());
            assertEquals(10, watermon.getAgility());
            assertEquals(5, watermon.getIntelligence());
            
        } catch (IOException e) {
            fail("IOException should not have been thrown");
        }
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadIndamonsFromFileWhenFileNotFound() throws IOException {
        IndamonLoader loader = new IndamonLoader();
        loader.loadIndamonsFromFile("no_such_file.txt");
    }

    @Test
    public void testLoadIndamonsFromFileWithInvalidDataFormat() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILENAME));
        writer.write("name,type,strength,agility,intelligence\n");
        writer.write("InvalidData,InvalidType,not_an_int,another_non_int,yet_another_non_int\n");
        writer.close();

        IndamonLoader loader = new IndamonLoader();
        try {
            loader.loadIndamonsFromFile(TEST_FILENAME);
            fail("NumberFormatException should have been thrown");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"not_an_int\"", e.getMessage());
        }
    }
}