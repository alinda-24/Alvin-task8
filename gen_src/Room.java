Room.java

```java
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private Map<String, Room> exits;
    private String description;

    public Room(String description) {
    }

    public void addExit(String direction, Room neighbor) {
    }

    public Room go(String direction) {
        return null;
    }

    public void printExits() {
    }

    public void lookAround() {
    }
}
```