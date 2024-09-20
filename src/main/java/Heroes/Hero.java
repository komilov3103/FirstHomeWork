package Heroes;

public abstract class Hero {
    private String name;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);

}
