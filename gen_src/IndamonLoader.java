import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class IndamonLoader {
    public List<Indamon> loadIndamonsFromFile(String filename) throws IOException {
        List<Indamon> indamons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                if (attributes.length == 5) {
                    String name = attributes[0];
                    String type = attributes[1];
                    int strength = Integer.parseInt(attributes[2]);
                    int agility = Integer.parseInt(attributes[3]);
                    int intelligence = Integer.parseInt(attributes[4]);
                    
                    Indamon indamon = createIndamon(name, type, strength, agility, intelligence);
                    if (indamon != null) {
                        indamons.add(indamon);
                    }
                }
            }
        }
        return indamons;
    }

    private Indamon createIndamon(String name, String type, int strength, int agility, int intelligence) {
        switch (type) {
            case "Fire":
                return new FireIndamon(name, strength, agility, intelligence);
            case "Water":
                return new WaterIndamon(name, strength, agility, intelligence);
            case "Earth":
                return new EarthIndamon(name, strength, agility, intelligence);
            default:
                System.out.println("Unknown type: " + type);
                return null;
        }
    }
}
