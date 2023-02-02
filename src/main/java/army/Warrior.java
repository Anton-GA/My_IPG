package army;

public abstract class Warrior {
    int health;
    int armor;
    String typeOfWeapon;
    int initiative;

    public Warrior (int health, int armor, String typeOfWeapon, int initiative) {
        this.health = health;
        this.armor = armor;
        this.typeOfWeapon = typeOfWeapon;
        this.initiative = initiative;
    }

    public void go() {
        System.out.println("Я пошел устраивать махач");
    }
    abstract int attack();
    abstract int defend();
}
