import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private Map<String, Room> exits = new HashMap<>();
    private String description;

    public Room(String description) {
        this.description = description;
    }

    public void addExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public Room go(String direction) {
        Room nextRoom = exits.get(direction);
        if (nextRoom == null) {
            System.out.println("You can't go that way!");
            printExits();
        }
        return nextRoom;
    }

    public void printExits() {
        System.out.print("Exits: ");
        for (String exit : exits.keySet()) {
            System.out.print(exit + " ");
        }
        System.out.println();
    }

    public void lookAround() {
        System.out.println(description);
        printExits();
    }
}