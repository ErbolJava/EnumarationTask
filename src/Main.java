

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Lenin",25,45,48);
        Warrior warrior1 = new Warrior("Stalin",33,49,57);
        Archer archer = new Archer("LeninLuchnik",25,45,48);
        Archer archer1 = new Archer("StalinLuchnik",33,49,57);

        Character[] characters = {warrior,warrior1,archer1,archer};

        for (Character character:characters) {
            if(character.equals(warrior)) {
                warrior.setWeapon(new Weapon(WeaponType.SWORD));
                System.out.println(warrior.getName() + ": " + warrior.getWeapon().getWeaponType()+" - "+warrior.attack());
                warrior1.setWeapon(new Weapon(WeaponType.AXE));
                System.out.println(warrior1.getName() + ": " + warrior1.getWeapon().getWeaponType()+" - "+warrior1.attack());
            }else if (character.equals(archer1)) {
                archer.setWeapon(new Weapon(WeaponType.BOW));
                System.out.println(archer.getName()+": "+archer.getWeapon().getWeaponType()+" - "+archer.attack());
                archer1.setWeapon(new Weapon(WeaponType.BOW));
                System.out.println(archer1.getName()+": "+archer1.getWeapon().getWeaponType()+" - "+archer.attack());
            }
        }
    }
}