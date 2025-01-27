public class Medic extends Hero{                                 // Класс Медик
    private int healPoints;// Поле healPoints

    public Medic(int health, int demage, String superPower, int healPoints) {
        super(health, demage, superPower);
        this.healPoints = healPoints;
    }

    public void increaseExperience() {// Метод increaseExperience
        this.healPoints*=1.1;
        System.out.println(" Опыт медика увеличивалось на 10% " + this.healPoints);
    }

    @Override
    public void applySuperAbility() {                            // реализация метода applySuperAbility() в классе Medic
        System.out.println(" Medic " + getSuperPower());
    }

}
/*
5. В классе медик добавить поле healPoints✅, затем добавить метод increaseExperience✅,
 в котором бы при вызове увеличивалось количество единиц лечения на 10%.✅
 */

