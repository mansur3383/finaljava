package OOP.sem1.Heroes;

import OOP.sem1.TypeOfHeroes.RangeHero;
import OOP.sem1.Vector2;

import java.util.Random;

public class Sniper extends RangeHero {
    public Sniper(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10, 15}, nameHero, posX, posY, 7, 7, 4);
        angryRDD = new Rogue(this.nameHero, this.position.posX, this.position.posY);
        angryRDD.position = this.position;
        angryRDD.damage = new int[] {9, 10};
    }

    @Override
    public String toString() {
        return "Снайпер: " + super.toString();
    }
    @Override
    public String getInfo() {
        return "Снайпер";
    }
}
