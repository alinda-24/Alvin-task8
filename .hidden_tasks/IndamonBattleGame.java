import java.util.List;

public class IndamonBattleGame {

    public static void main(String[] args) {
        IndamonLoader loader = new IndamonLoader();
        try {
            List<Indamon> indamons = loader.loadIndamonsFromFile("indamons.txt");
            for (int i = 0; i < indamons.size(); i++) {
                for (int j = i + 1; j < indamons.size(); j++) {
                    System.out.println(indamons.get(i).battle(indamons.get(j)));
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}