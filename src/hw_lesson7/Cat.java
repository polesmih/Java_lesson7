package hw_lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {

        //task 2 - 4.
        if (p.getFood() < appetite) {
            System.out.print("В тарелке мало еды. ");
            System.out.println(name + " голоден.");
            return;
        }
        System.out.println(name + " ест.");
        p.decreaseFood(appetite);
        appetite = 0;
        full = true;
        System.out.println(name + " сыт.");
    }
}
