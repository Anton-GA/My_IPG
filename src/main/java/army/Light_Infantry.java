package army;

public class Light_Infantry extends Warrior{

    public Light_Infantry(int health, int armor, String typeOfWeapon, int initiative) {
        super(health, armor, typeOfWeapon, initiative);

    }

    @Override
    public int attack() {
        int attack = this.health / 2;
        return attack;
    }

    @Override
    public int defend() {
        return defend();
    }
}
