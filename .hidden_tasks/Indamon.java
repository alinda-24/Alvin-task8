import java.util.List;
import java.util.ArrayList;

public class Indamon {
    private String name;
    private String type;
    private int strength;
    private int agility;
    private int intelligence;

    // Constructor to initialize an Indamon
    public Indamon(String name, String type, int strength, int agility, int intelligence) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    // Getters and setters for Indamon attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    // Method to simulate a battle between two Indamons
    public String battle(Indamon opponent) {
        int scoreThisIndamon = calculateScore();
        int scoreOpponent = opponent.calculateScore();

        if (scoreThisIndamon > scoreOpponent) {
            return this.name + " wins against " + opponent.getName() + "!";
        } else if (scoreThisIndamon < scoreOpponent) {
            return opponent.getName() + " wins against " + this.name + "!";
        } else {
            return "It's a draw between " + this.name + " and " + opponent.getName() + "!";
        }
    }

    // Calculate the battle score based on Indamon's attributes
    public int calculateScore() {
        return strength * 2 + agility * 2 + intelligence;
    }
}

// Utility class to handle file operations for Indamon objects
class IndamonLoader {

    // Method to load Indamons from a file
    public List<Indamon> loadIndamonsFromFile(String filename) throws IOException {
        List<Indamon> indamons = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine(); // Skip the header line
        while ((line = reader.readLine()) != null) {
            String[] attributes = line.split(",");
            String name = attributes[0];
            String type = attributes[1];
            int strength = Integer.parseInt(attributes[2]);
            int agility = Integer.parseInt(attributes[3]);
            int intelligence = Integer.parseInt(attributes[4]);
            Indamon indamon = new Indamon(name, type, strength, agility, intelligence);
            indamons.add(indamon);
        }
        reader.close();
        return indamons;
    }
}