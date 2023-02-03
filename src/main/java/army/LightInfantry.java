package army;

public class LightInfantry extends Warrior{

    public LightInfantry() {
        super(100, 5, "Меч", 10);
        System.out.println("Light Infantry has health, armor and initiative " + health + ", " + armor + ", " + initiative);
    }

    @Override
    public int attack() {
        return this.health / 10;
    }

    @Override
    public int defend() {
        return attack() / 2;
    }
}
