package army;

public class Archer extends Warrior{

    public Archer() {
        super(75, 2, "Стрелы", 15);
        System.out.println("Archer has health, armor and initiative " + health + ", " + armor + ", " + initiative);
    }

    @Override
    public int attack() {
        return this.health / 5;
    }

    @Override
    public int defend() {
        return attack() / 5;
    }
}
