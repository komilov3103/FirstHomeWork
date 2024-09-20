package Heroes;

import java.awt.geom.Area;
import java.util.jar.JarEntry;

public class TrainingGround {
    public static void main(String[] args){
        Warrior warrior = new Warrior("Firuz");
        Mage mage = new Mage("Mage");
        Archer archer = new Archer("Archer");

        Enemy enemy = new Enemy(100);
        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);

    }
}
