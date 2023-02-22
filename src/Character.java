public class Character {
    private String name;
    private int force;
    private Weapon weapon;
    private int dexterity;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Character(String name, int force, int speed, int dexterity) {
        this.name = name;
        this.force = force;
        this.speed = speed;

        this.dexterity = dexterity;
    }

    public String attack() {
        return name + " is attacking";
    }
}
