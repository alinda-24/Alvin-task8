import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class IndamonBattleGame {
    public static void main(String[] args) {
        IndamonLoader loader = new IndamonLoader();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            List<Indamon> indamons = loader.loadIndamonsFromFile("Indamons.txt");
            for (Indamon indamon : indamons) {
                System.out.println("Loaded Indamon: " + indamon.getName() + ", Type: " + indamon.getType());
            }
            List<Indamon> enemyIndamons = generateEnemyIndamons();
            boolean playing = true;

            while (playing){
                System.out.println("Enter number of steps to take (1-10)");
                int steps = scanner.nextInt();
                if (steps < 0 || steps > 10) {
                    System.out.println("Invalid number of steps. Please choose between 1 and 10.");
                    continue;
                }
                for (int step = 1; step <= steps; step++){
                    System.out.println("Step " + step);
                    if (random.nextInt(5) == 1){
                        System.out.println("An enemy appears!");
                        Indamon enemyIndamon = enemyIndamons.get(random.nextInt(enemyIndamons.size()));
                        System.out.println("Which indamon do you wish to use?");
                        System.out.println("Available Indamons to use:");
                        for (Indamon indamon : indamons) {
                            System.out.println("- " + indamon.getName());
                        }
                        String indamonuse = scanner.next();
                        Indamon selectedIndamon = null;
                        for (Indamon indamon : indamons) {
                            if (indamon.getName().equalsIgnoreCase(indamonuse)) {
                                selectedIndamon = indamon;
                                break;
                            }
                            if (selectedIndamon == null) {
                                System.out.println("No such Indamon found. Please try again.");
                                continue;
                            }
                        }
                        System.out.println(selectedIndamon.battle(enemyIndamon));
                        System.out.println("Do you wish to continue y/n?");
                        String userResponse = scanner.next();
                        if (userResponse.equals("n")){
                            System.out.println("Exiting the game. Goodbye!");
                            playing = false;
                            break;
                        } else if (userResponse.equals("y")){
                            continue;
                        } else {
                            System.out.println("Invalid input stoping the game!");
                            playing = false;
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
    private static List<Indamon> generateEnemyIndamons() {
        List<Indamon> enemies = new ArrayList<>();
        enemies.add(new FireIndamon("Inferno", 9, 4, 5));
        enemies.add(new WaterIndamon("AquaFang", 6, 5, 7));
        enemies.add(new EarthIndamon("TerraClaw", 8, 6, 4));
        enemies.add(new FireIndamon("Blaze", 7, 5, 6));
        enemies.add(new WaterIndamon("Hydro", 5, 8, 7));
        enemies.add(new EarthIndamon("Rocky", 8, 4, 6));
        return enemies;
    }
}