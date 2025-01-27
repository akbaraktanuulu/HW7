public class Warrior extends Hero{

    public Warrior(int health, int demage, String superPower) {
        super(health, demage, superPower);
    }

    @Override                        // реализация метода applySuperAbility() в классе Warrior
    public void applySuperAbility() {
        System.out.println(" Warrior " + getSuperPower());
    }
}
