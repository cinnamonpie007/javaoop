package Main.Java.characters;

public abstract class Person {

    protected String name;

    protected String wapon;

    protected int health;

    protected int armor;

    protected int strength;

    protected int dexterity;

    protected int hardy;

    protected float money;

    public Person(String name, String wapon, int health, int armor, float money,
                       int strength, int dexterity, int hardy) {
        this.name = name;
        this.wapon = wapon;
        this.health = health;
        this.strength = strength;
        this.armor = armor;
        this.money = money;
        this.dexterity = dexterity;
        this.hardy = hardy;
    }

    public abstract void defend();

    public abstract void buy(int coast);


    @Override
    public String toString() {
        return name;
    }



}
