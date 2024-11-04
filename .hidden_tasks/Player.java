public class Player {
    private int score;
    private Room currentRoom;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
        this.score = 0;
    }

    public void move(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}