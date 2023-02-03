package army;

public class HeavyInfantry extends Warrior{

    public HeavyInfantry() {
        super(200, 20, "Меч", 5);
        System.out.println("Heavy Infantry has health, armor and initiative " + health + ", " + armor + ", " + initiative);
    }

    @Override
    public int attack() {
        return this.health / 2;
    }

    @Override
    public int defend() {
        return attack() / 5;
    }
}
