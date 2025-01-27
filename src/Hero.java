public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int demage;
    private String superPower;

    public Hero(int health, int demage, String superPower) {
        this.health = health;
        this.demage = demage;
        this.superPower = superPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
    public abstract void applySuperAbility();

}


/*
2. Создать абстрактный класс Hero с полями здоровье,
 урон и тип супер способности и реализовать интерфейс HavingSuperAbility.✅
 */
