
public abstract class Indamon {
    private String name;
    private String type;
    private int strength;
    private int agility;
    private int intelligence;
    private int score;

    public Indamon(String name, String type, int strength, int agility, int intelligence) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.score = 0;
    }

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
    public int getScore() {
        return score;
    }
    public void addScore(int points) {
        this.score += points;
    }
    public abstract int useSpecialAbility();

    public String battle(Indamon opponent) {
        int thisagility = getAgility() + this.useSpecialAbility();
        int opponentagility = opponent.getAgility() + opponent.useSpecialAbility();
        int thisstrength = getStrength();
        int opponentstrength = opponent.getStrength();
        int thisScore = this.calculateScore();
        int opponentScore = opponent.calculateScore();
        System.out.println(this.name + " battles " + opponent.getName() + "!");
        System.out.println(this.name + " strength " + thisstrength + " and agility: " + thisagility);
        System.out.println(opponent.getName() + " strength " + opponentstrength + " and agility: " + opponentagility);
        if (thisstrength > opponentagility){
            this.addScore(10);
            return this.name + " has higher strength than opponent has agility and therefore wins and now has a score of: " + thisScore;
        }
        else if (thisstrength < opponentagility){
            System.out.println(opponent.getName() + " has a higher agility and dodges!");
            System.out.println(opponent.getName() + " counterattacks!");
            if (opponentstrength > thisagility) {
                opponent.addScore(10);
                return opponent.getName() + " Has higher strength and wins and now has a score of: " + opponentScore;
            }
            else {
                return this.name + " Has higher agility and dodges and it ends in a Draw!";
            }
        } else {
            return "it's a draw!";
        }
    }

    public int calculateScore() {
        return strength * 2 + agility * 1 + intelligence * 3;
    }
}
class FireIndamon extends Indamon {
    public FireIndamon(String name, int strength, int agility, int intelligence) {
        super(name, "Fire", strength, agility, intelligence);
    }

    public int useSpecialAbility() {
        System.out.println(getName() + " uses Fire Blast! (Agility Boost +2)");
        return 2; 
    }
}


class WaterIndamon extends Indamon {
    public WaterIndamon(String name, int strength, int agility, int intelligence) {
        super(name, "Water", strength, agility, intelligence);
    }

    public int useSpecialAbility() {
        System.out.println(getName() + " uses Water Surge! (Agility Boost +3)");
        return 3; 
    }
}

class EarthIndamon extends Indamon {
    public EarthIndamon(String name, int strength, int agility, int intelligence) {
        super(name, "Earth", strength, agility, intelligence);
    }
    public int useSpecialAbility() {
        System.out.println(getName() + " uses Earth Shield! (Agility Boost +1)");
        return 1;
    }
}