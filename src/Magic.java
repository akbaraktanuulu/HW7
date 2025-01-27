public class Magic extends Hero{

    public Magic(int health, int demage, String superPower) {
        super(health, demage, superPower);
    }

    @Override                         // реализация метода applySuperAbility()
    public void applySuperAbility() {
        System.out.println(" Magic " + getSuperPower());

    }
}
