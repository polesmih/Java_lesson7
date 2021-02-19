package lesson7;

import java.util.Arrays;

public class Main_lesson7 {
    public static void main(String[] args) {
        Cat barsic = new Cat("Барсик", 3);
        Plate plate = new Plate(10);
        plate.info();

        barsic.eat(plate);
        plate.info();

        //check that food can't be negative
        //plate.decreaseFood(20);

        //task 5.
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 12),
                new Cat("Мурка", 7)
        };

        Plate generalPlate = new Plate(20);
        Arrays.stream(cats).forEach(eachCat -> eachCat.eat(generalPlate));
        generalPlate.info();
    }
}
