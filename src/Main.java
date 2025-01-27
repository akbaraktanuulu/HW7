import java.util.Arrays;

public class Main {                          // Класс Main
    public static void main(String[] args) { // Метод Main

        Medic medic = new Medic(200,10,"HEALING",100);
        Magic magic = new Magic(250,50,"WATERBOLL");
        Warrior warrior = new Warrior(300,80,"CRITICAL DAMAGE");

        Hero[] heroes = { magic, medic, warrior,};    // Массив из 3х героев
        for (Hero hero : heroes) {                        // Цикл for each
            hero.applySuperAbility();
            if (hero instanceof Medic m) {
                m.increaseExperience();
            }
        }
        }
    }

/*
4. В классе Main создать массив из 3х разных героев, затем через цикл применить супер способность каждого героя.✅

6. При прохождении через массив в пункте 4 увеличить опыт лечения медика, сделав приведение типов (Type Casting).✅

 */
