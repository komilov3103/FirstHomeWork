package Heroes;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void takeDamage(int damage){
        int difference = this.health - damage;
        this.health = difference < 0 ? 0 : difference;

    }

    @Override
    public boolean isAlive(Enemy enemy){
        return true ? enemy.getHealth() > 0 : false;
    }
}
