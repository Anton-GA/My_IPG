package army;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        armyAandArmyB();
    }

    public static void armyAandArmyB() {
        List<Warrior> armyA = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            armyA.add(new LightInfantry());
        }
        for(int i = 0; i < 15; i++) {
            armyA.add(new Archer());
        }
        for(int i = 0; i < 5; i++) {
            armyA.add(new HeavyInfantry());
        }

        List<Warrior> armyB = new ArrayList<>();
        for(int i = 0; i < 15; i++) {
            armyB.add(new LightInfantry());
        }
        for(int i = 0; i < 40; i++) {
            armyB.add(new Archer());
        }
        for(int i = 0; i < 5; i++) {
            armyB.add(new HeavyInfantry());
        }

        int summaryHealthForArmyA = armyA.stream().mapToInt(x -> x.health).reduce(0, Integer::sum);
        System.out.println("Summary health of Army A: " + summaryHealthForArmyA);

        int summaryHealthForArmyB = armyB.stream().mapToInt(x -> x.health).reduce(0, Integer::sum);
        System.out.println("Summary health of Army B: " + summaryHealthForArmyB);

        int summaryPowerForArmyA = armyA.stream().mapToInt(Warrior::attack).reduce(0, Integer::sum);
        System.out.println("Summary power of Army A: " + summaryPowerForArmyA);

        int summaryPowerForArmyB = armyB.stream().mapToInt(Warrior::attack).reduce(0, Integer::sum);
        System.out.println("Summary power of Army B: " + summaryPowerForArmyB);

        if(summaryPowerForArmyA > summaryPowerForArmyB) {
            System.out.println("Army A is more power");
        } else {
            System.out.println("Army B is more power");
        }
    }


}
