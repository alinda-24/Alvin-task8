import java.util.List;
import java.util.ArrayList;

public class GameWorld {
    private List<Room> rooms = new ArrayList<>();
    private List<Enemy> enemies = new ArrayList<>();

    public void instantiateEnemiesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] enemyData = line.split(",");
                String type = enemyData[0];
                int health = Integer.parseInt(enemyData[1]);
                Enemy enemy = new Enemy(type, health);
                enemies.add(enemy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void startGameLoop(Player player) {
        // Basic game loop logic here, expand with user input handling and game state updates
    }
}