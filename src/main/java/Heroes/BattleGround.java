package Heroes;

public class BattleGround {
    public static void main(String[] args){
        Enemy enemy = new Enemy(100);
        System.out.println("Our hero appears in battle field..");
        Hero hero = new Warrior("Dilovar");
        while (enemy.getHealth() != 0){
            System.out.println("Warrior is attacking enemy...");
            System.out.print("Enemy's health: ");
            System.out.println(enemy.getHealth());
            hero.attackEnemy(enemy);
        }

        System.out.println("Enemy died...");

    }
}
