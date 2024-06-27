import java.lang.reflect.Array;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDafence("fly");
        boss.setDamage(50);
        boss.setHealth(500);

        Hero[] herous = creatHerous();

        System.out.println("Information of boss: " + "\nBoss defence: " + boss.getDafence() +
                "\nBoss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\n");

        System.out.println("Information of Herous: ");
        // Hero В данном случае это тип данных и в hero говориться что в Hero может храниться тип данных Hero А herous это маиссив из обьектов класса Hero
        for (Hero hero : herous) {
            int numberOfHero = 0;
            numberOfHero++;
            System.out.println("Hero" + numberOfHero + " health: " + hero.getHealth() +
                    " damage: " + hero.getDamage() + " Supper ability" + hero.getSuperAbility());
        }

    }

    //Hero Это массив каторый может содержать обьекты класса Hero
    public static Hero[] creatHerous() {
        Hero hero1 = new Hero(100, "Fly", 30);
        Hero hero2 = new Hero(100, "Fly", 30);
        Hero hero3 = new Hero(100, 30);

        Hero[] allHerous = new Hero[]{hero1, hero2, hero3};
        return allHerous;


    }

}